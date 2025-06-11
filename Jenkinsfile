def services = [
  [name: 'api-gateway', path: 'api-gateway', dockerfile: 'api-gateway/Dockerfile'],
  [name: 'user-service', path: 'user-service', dockerfile: 'user-service/Dockerfile'],
  [name: 'product-service', path: 'product-service', dockerfile: 'product-service/Dockerfile'],
  [name: 'favourite-service', path: 'favourite-service', dockerfile: 'favourite-service/Dockerfile'],
  [name: 'order-service', path: 'order-service', dockerfile: 'order-service/Dockerfile'],
  [name: 'shipping-service', path: 'shipping-service', dockerfile: 'shipping-service/Dockerfile'],
  [name: 'payment-service', path: 'payment-service', dockerfile: 'payment-service/Dockerfile'],
  [name: 'proxy-client', path: 'proxy-client', dockerfile: 'proxy-client/Dockerfile']
]

pipeline {
  agent any
  environment {
    REGISTRY = "pipebarreto"
    VERSION = "" // Will be set in a stage
  }
  stages {
    stage('Get Semantic Version') {
      steps {
        script {
          def version = sh(script: "./mvnw help:evaluate -Dexpression=project.version -q -DforceStdout", returnStdout: true).trim()
          env.VERSION = version
        }
      }
    }
    stage('Detect Changed Services') {
      steps {
        script {
          def changedDirs = sh(
            script: "git diff --name-only origin/master...HEAD | awk -F/ '{print \$1}' | sort -u",
            returnStdout: true
          ).trim().split('\n') as Set
          def changedServices = services.findAll { svc -> changedDirs.contains(svc.path) }
          env.CHANGED_SERVICES = changedServices.collect { it.name }.join(',')
          echo "Changed services: ${env.CHANGED_SERVICES}"
        }
      }
    }
    stage('Build and Push Changed Images') {
      when {
        expression { env.CHANGED_SERVICES && env.CHANGED_SERVICES.trim() }
      }
      steps {
        script {
          def changedServiceNames = env.CHANGED_SERVICES.split(',')
          def changedServices = services.findAll { svc -> changedServiceNames.contains(svc.name) }
          changedServices.each { svc ->
            sh """
              cd ${svc.name}
              ./mvnw clean package
              docker build -t $REGISTRY/${svc.name}:${env.VERSION} -f Dockerfile .
              docker push $REGISTRY/${svc.name}:${env.VERSION}
              cd ..
            """
          }
        }
      }
    }
    stage('Trigger Manifest Update') {
      when {
        expression { env.CHANGED_SERVICES && env.CHANGED_SERVICES.size() > 0 }
      }
      steps {
        build job: 'updatemanifest', parameters: [string(name: 'DOCKERTAG', value: env.VERSION)]
      }
    }
  }
}