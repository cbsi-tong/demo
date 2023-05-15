## Spring Demo Application Build and Run Instructions

### Prerequisites

Install docker on you local machine.  See here:
https://docs.docker.com/engine/install/

### Run App Using Docker Image from Docker Hub

* Dowload app image from Docker hub
  * $ docker pull tongdha/demo:1.0
* Run app (This will do a git pull of the latest code and build it)
  * $ docker run -d -p 80:8080 -t tongdha/demo:1.0
* Test app
  * $ curl curl http://localhost:8080/shows -u user:password

### Build and Run locally using Docker
* Build Docker image locally
  * $ git clone https://github.com/cbsi-tong/demo.git
  * $ cd demo
  * $ ./build-docker.sh
* Run app using Docker
  * ./run-docker.sh
