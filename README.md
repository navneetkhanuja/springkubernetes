Steps to deploy and test

1) Compile
./gradlew clean build

2) Use skaffold to deploy
skaffold run  
OR
skafflod run --tail

3) Once deployed do node forward to access app end point
kubectl port-forward <pod-name> 8080:8080

To see config map properties
kubectl describe configmap config-example

To apply updated config map
kubectl apply -f config.yaml
NOTE: As soon as config map is applied application is restarted.

-- In previous version refresh command was used to update configuration in application
curl http://127.0.0.1:8080/actuator/refresh -d {} -H "Content-Type: application/json"

--To expose deployment via kubectl

kubectl expose deployment <deployment name> --type=NodePort --port=80
service "<service name>" exposed

Create a role and role binding in kubernetes cluster to give access to pod to access config maps. Default role
cannot access config maps. Below link shows how to set the config maps.
https://www.bswen.com/2020/11/springboot-springcloud-kubernetes-k8s-error1.html

