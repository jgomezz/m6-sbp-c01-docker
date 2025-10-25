
Ver imagenes
```
docker images
```
Crear una imagen
```
docker pull nginx:latest
```

Ejecutar un contenedor
```
docker run -d -p 8010:80 --name web  nginx
```

Ver logs
```
docker logs web
docker logs -f web
```

Entrar al contenedor ( para salir con exit)
```
docker exec -it web /bin/bash
```

Detener contenedor
```
docker stop web
```

Elminar un contenedor, para le ejemplo el contenedor es  'web'
```
docker rm web
```

Elminar una imagen
```
docker rmi nginx
```

-
#Ejercicio

Crear 4 contenedores de la imagen nginx:latest, que apunten
a los puertos 8010, 8020, 8030, 8040 y que se llamen web1, web2, 
web3 y web4 respectivamente

```
docker pull nginx:latest

docker run -d -p 8010:80 --name web1 nginx
docker run -d -p 8020:80 --name web2 nginx
docker run -d -p 8030:80 --name web3 nginx
docker run -d -p 8040:80 --name web4 nginx

```