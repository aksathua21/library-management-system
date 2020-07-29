# Library Management System

## Objective

To develop a library management system using Java based technologies.

NOTE: The application will not have a front end. The backend will expose REST APIs to allow future integration of a front end.

## Database Design

Use the following link to setup your database and as your starting point.

https://www.c-sharpcorner.com/UploadFile/ea3ed6/database-design-for-library-management-system/

## Layered design

The application should have the following layers:

1. Controller - Expose the REST API endpoints here
2. Validation - Validate the incoming data here
3. Business Logic - Perform all business logic here
4. Data Access - Perform database access here

## Technologies to use

1. Spring MVC for Controller Layer
2. Spring Data JPA for Data Access Layer
3. Spring Boot to bind them all
4. Docker for 

## Project Setup

> You need Linux system - Ubuntu LTS
> Use the attached folder as your project code base

### Install IntelliJ IDEA

1. Download from here - https://download.jetbrains.com/idea/ideaIC-2020.1.4.tar.gz
2. Installtion instructions are here (Choose linux option) - https://www.jetbrains.com/help/idea/installation-guide.html#standalone
3. Usage instruction videos are here - https://www.jetbrains.com/idea/documentation/

### Install Git

1. `sudo apt update`
2. `sudo apt install git`

### Installing Java 11

1. `sudo apt install zip unzip`
2. `curl -s "https://get.sdkman.io" | bash`
3. `source "$HOME/.sdkman/bin/sdkman-init.sh"`
4. `sdk install java 11.0.2-open`
5. Setup `JAVA_HOME`
   1. `vi ~/.bashrc`
   2. Before the SDKMAN entries (found at the end of the file) add `export JAVA_HOME=/home/$USER/.sdkman/candidates/java/current`
   3. `source ~/.bashrc`

### Installing Docker & Docker Compose

1. `sudo apt-get remove docker docker-engine docker.io containerd runc`
2. `sudo apt-get update`
3. `sudo apt-get install apt-transport-https ca-certificates curl gnupg-agent software-properties-common gnupg2 pass`
4. `curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -`
5. `sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"`
6. `sudo apt-get update`
7. `sudo apt-get install docker-ce docker-ce-cli containerd.io docker-compose`
8. `sudo groupadd docker`
9. `sudo usermod -aG docker $USER`
10. Log out and log back in so that your group membership is re-evaluated.
