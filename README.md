# spring-boot-app

A simple sample application Spring Boot

## Requires

- Java (>= 1.8)
- Apache Maven (>= 3.3.9)
- Docker (>= 1.11.2)
- Docker Machine (>= 0.7.0)
- Docker Compose (>= 1.8.0)

## Running Docker for database container
Creating a [Docker](https://www.docker.com/) container image for [PostgreSQL](http://postgresql.org/). Using the Docker [official image](https://docs.docker.com/docker-hub/official_repos/) for [postgres](https://registry.hub.docker.com/_/postgres/). See [the Docker Hub page](https://registry.hub.docker.com/_/postgres/) for the full readme.

### Quickstart

Create virtual machine for docker container:
```bash
docker-machine create --driver virtualbox default
```
Start new docker machine:
```bash
docker-machine start
```
Get the environment commands for your new VM:
```bash
docker-machine env
```
Output:
```console
export DOCKER_TLS_VERIFY="1"
export DOCKER_HOST="tcp://192.168.99.100:2376"
export DOCKER_CERT_PATH="/home/teste/.docker/machine/machines/default"
export DOCKER_MACHINE_NAME="default"
# Run this command to configure your shell: 
# eval $(docker-machine env)
```
Connect your shell to the new machine:
```bash
eval $(docker-machine env)
```
And run docker-compose.yml:
```bash
cd {your_dir}/spring-boot-app/docker && docker-compose up
```
> **Test your connection in your favorite database tool**

> - host: 192.168.99.100 
> - port: 32768 
> - database: postgres
> - user/pass: postgres


## Build
- mvn clean package

## Run
- mvn spring-boot:run


