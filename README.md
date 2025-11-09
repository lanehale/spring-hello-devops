# Spring Boot on Kubernetes — Local DevOps Demo

**Zero cloud. Full CI/CD pipeline.**

```bash
# 1. Build & load
docker build -t spring-hello:v1 .
minikube image load spring-hello:v1

# 2. Deploy
helm install hello ./hello-chart

# 3. Access
kubectl port-forward svc/hello 8080:80

![Live App](main/screenshots/browser.png?raw=true)
![Pods](main/screenshots/pods.png)
