
# Distributed Taxi System

A distributed taxi system created using Kubernetes architecture with service providers Linode and Digital Ocean is a scalable and highly available system that allows users to generate a taxi number, cluster ID, availability, and the hosted server when a GET request is sent through an API.


## API Reference (testing a local deployment)

#### Get request to find if a taxi is available(localhost)

```http
  GET /http://localhost:8080/2
```




## Deployment

To deploy this project on Linode

```bash
export KUBECONFIG=achira-dts-kubeconfig.yaml
kubectl apply -f linode_service.yaml
kubectl get services
kubectl apply -f linode_deploy.yaml
kubectl get pods
```

To deploy this project on Digital Ocean

```bash
export KUBECONFIG=achira-ams3-1681588070260-kubeconfig.yaml
kubectl apply -f do_service.yaml
kubectl apply -f do_deploy.yaml
```

Nginx proxy server script

  ```bash
upstream myproxy {
    server 139.144.162.11:8080;
    server 159.223.240.113:8080;
}

server {
    listen 80;
    server_name localhost;
    root /var/www/html;

    location / {
        proxy_pass http://myproxy;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header Host $host;
        proxy_redirect off;
    }
}
```

## Documentation

[Documentation](https://github.com/YasithRW/Distributed-Taxi-System/edit/v1.0/README.md)

