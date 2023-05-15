#!/bin/bash
docker container run -d -p 8080:8080 --name demo -d demo:1.0
docker ps -a
docker container logs demo
#docker exec -ti demo bash

# run with image from docker hub
# docker pull tongdha/demo:1.0
# docker run -d -p 80:8080 -t demo:1.0
