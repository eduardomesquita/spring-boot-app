# spring-boot-app

A simple sample application Spring Boot

## Requires

- Java (>= 1.8)
- Apache Maven (>= 3.3.9)
- Docker (>= 1.11.2)
- Docker Machine (>= 0.7.0)
- Docker Compose (>= 1.8.0)

## Database
Creating a [Docker](https://www.docker.com/) container image for [PostgreSQL](http://postgresql.org/)
Using the Docker [official image](https://docs.docker.com/docker-hub/official_repos/) for [postgres](https://registry.hub.docker.com/_/postgres/). See [the Docker Hub page](https://registry.hub.docker.com/_/postgres/) for the full readme on how to use this Docker image and for information regarding contributing and issues.

## Build
- mvn clean package

## Run
- mvn spring-boot:run


