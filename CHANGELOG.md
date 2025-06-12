# [1.0.0-dev.8](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/compare/v1.0.0-dev.7...v1.0.0-dev.8) (2025-06-12)


### Bug Fixes

* minor change to buildimage.yml to have it working on pr and test if the workflow works ([b60f8a4](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/b60f8a42de966ba1b757dca3c77768e65cb58462))
* minor changes to test actions ([0eb33d5](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/0eb33d5ca32704009635b036d126f000bfadc787))


### Features

* turn jenkins file to githubactions as the use of docker in jenkins was causing trouble ([992f859](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/992f859717d0fbd524ee108ff0bf5e8f562f8ba7))

# [1.0.0-dev.7](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/compare/v1.0.0-dev.6...v1.0.0-dev.7) (2025-06-11)


### Bug Fixes

* added wrapper for maven as it's causing trouble ([57c0ae0](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/57c0ae05257dcd9222fb770933c3c04c27e11234))

# [1.0.0-dev.6](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/compare/v1.0.0-dev.5...v1.0.0-dev.6) (2025-06-11)


### Bug Fixes

* mis config in the .releaserc file ([8a4ac55](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/8a4ac5598f5940b82cba0b6ae2fc69e8108190e8))
* reconfigured the versions ([aca0311](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/aca03119c51abdb788c22cac324ea55475da7a74))

# [1.0.0-dev.5](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/compare/v1.0.0-dev.4...v1.0.0-dev.5) (2025-06-11)


### Bug Fixes

* still having problem with the release versions ([e5593da](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/e5593da2f8e4484b4428311777a8b7cd917319aa))

# [1.0.0-dev.4](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/compare/v1.0.0-dev.3...v1.0.0-dev.4) (2025-06-11)


### Bug Fixes

* added checkout stage, as it appears jenkins is not downloading the parent pom and this is causing problems ([b5dcaa3](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/b5dcaa34302fd5b04d5292f81314433e6865a118))
* breacking change, semantic changed the version of the parent pom but not the son poms, now we test if the new githubactions works ([7d22e10](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/7d22e10f0e4f39c9ae85a72f6bc698c71ce4b8ba))
* changed the way the dockerimage is built in the jenkins file ([6a4176c](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/6a4176c1790507b3715864972dabfdc67ffefbc6))
* changed the way versions worked in the dockerfiles and project poms ([5afd313](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/5afd313870ef48bbf6071b7563589ef87522dd4e))
* changed the way versions worked in the dockerfiles and project poms ([67ef718](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/67ef718c5deb260d9df2d356c8026291920b5027))
* delete stage column, re added i ([cda6bf4](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/cda6bf4b4040b0ba3df6c5a4a37b16529f0e0ab7))
* delete stage column, re added it ([71838a0](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/71838a042d35fbef2e1a43724f3856d251249a42))
* moved the maven clean command and changed the building loop a bit ([c368441](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/c368441692644bb3d9562a7889512f91c14a4631))
* springboot version change appears to have broken a lot of stuff ([cffaee7](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/cffaee743f605a699d42886e6bbc318e6c8e1021))

# [1.0.0-dev.3](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/compare/v1.0.0-dev.2...v1.0.0-dev.3) (2025-06-11)


### Features

* added jacoco for coverage ([66f6815](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/66f6815bb80c4a54195abea37195599fd8bb6f1b))
* added sonar workflow ([bf8b1fc](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/bf8b1fc7f35e3e61f9b1163f72578ddf8fa26eb1))

# [1.0.0-dev.2](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/compare/v1.0.0-dev.1...v1.0.0-dev.2) (2025-06-04)


### Bug Fixes

* deleted the upload of the documentation, as it should now be available in the repo ([d25219b](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/d25219b52f4bc011066802c7cd0c71d74d4a034e))
* forgot I deleted the checksyle.xml and left a call to it in the parent pom ([138abd3](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/138abd3e0db57738dab3fda7e0f9e2f6a71a9076))
* something went wrong with javadoc method, added new javadoc plugin to parent pom ([4eb242d](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/4eb242dc2c2df132ee3cb07d09a1f72e75889cb4))


### Features

* added javadoc generation and check with checkstyle ([2e3e1ba](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/2e3e1ba73493e60dab471d8f2b5e41dbc9bca936))
* the documentation should now be available in a /doc folder ([9f4773a](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/9f4773a98d41625a513c8130de8f3139bbac8da9))

# 1.0.0-dev.1 (2025-06-03)


### Bug Fixes

* added node_modules to git by accident ... sorry ([56ec10f](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/56ec10f1d1fbcb87386736380ab09e8049ec78ee))
* changed the name of the .releasec file as it was causing trouble. ([cd5be31](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/cd5be311c13d74ccfdf4f9740338d202d39304e6))
* enable CORS ([44ac66c](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/44ac66c91435fb120e88d76d873497702a7a0d66))


### Features

* added a new workflow to automate channel logs, releases and tags using semantic-release ([7ed6f5c](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/7ed6f5c54d5500b6b4ffba062b6e1e23dc89e5c3))
* K8 should now be working and connects with the frontend, all endpoints should be accesible if the proxy is bypassed as it appears there's a breaking bug in the app/api/authenticate method. Fix: eureka now works as expected, all services now use cloud-config ([64940cb](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/64940cb2d49d418ee0bc180fb0c2ca8614fe77e7))
