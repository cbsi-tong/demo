#!/bin/bash
docker build -t demo:1.0 .
docker images

# push image to docker hub (first do: docker login)
# demo docker image tag demo:1.0 tongdha/demo:1.0
# demo docker image push tongdha/demo:1.0
