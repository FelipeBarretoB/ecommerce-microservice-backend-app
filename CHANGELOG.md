# 1.0.0-dev.1 (2025-06-03)


### Bug Fixes

* added node_modules to git by accident ... sorry ([56ec10f](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/56ec10f1d1fbcb87386736380ab09e8049ec78ee))
* changed the name of the .releasec file as it was causing trouble. ([cd5be31](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/cd5be311c13d74ccfdf4f9740338d202d39304e6))
* enable CORS ([44ac66c](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/44ac66c91435fb120e88d76d873497702a7a0d66))


### Features

* added a new workflow to automate channel logs, releases and tags using semantic-release ([7ed6f5c](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/7ed6f5c54d5500b6b4ffba062b6e1e23dc89e5c3))
* K8 should now be working and connects with the frontend, all endpoints should be accesible if the proxy is bypassed as it appears there's a breaking bug in the app/api/authenticate method. Fix: eureka now works as expected, all services now use cloud-config ([64940cb](https://github.com/FelipeBarretoB/ecommerce-microservice-backend-app/commit/64940cb2d49d418ee0bc180fb0c2ca8614fe77e7))
