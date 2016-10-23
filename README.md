# spring-boot-app

A simple sample application Spring Boot

## Requires

- Java (>= 1.8)
- Apache Maven (>= 3.3.9)
- Docker (>= 1.11.2)
- Docker Machine (>= 0.7.0)
- Docker Compose (>= 1.8.0)

## Database
Creating a [Docker](https://www.docker.com/) container image for [PostgreSQL](http://postgresql.org/). Using the Docker [official image](https://docs.docker.com/docker-hub/official_repos/) for [postgres](https://registry.hub.docker.com/_/postgres/). See [the Docker Hub page](https://registry.hub.docker.com/_/postgres/) for the full readme.

### Quickstart

With docker service running:
```bash
cd spring-boot-app/docker
```
Create virtual machine for docker container:
```bash
docker-machine create --driver virtualbox default
```
Start new docker machine:
```bash
docker-machine start
```
Get the environment commands for your new VM.
```bash
docker-machine env
```

```console
export DOCKER_TLS_VERIFY="1"
export DOCKER_HOST="tcp://192.168.99.100:2376"
export DOCKER_CERT_PATH="/home/teste/.docker/machine/machines/default"
export DOCKER_MACHINE_NAME="default"
# Run this command to configure your shell: 
# eval $(docker-machine env)
```
Connect your shell to the new machine
```bash
eval $(docker-machine env)
```

## Build
- mvn clean package

## Run
- mvn spring-boot:run


