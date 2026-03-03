# Sonarqube

## Architecture of Sonarqube
![Architecture](https://github.com/balaji1974/sonarcube/blob/main/resources/architecture.png)
Pellegrini, L. (2018). Representation of the different components of SQ and how they interact one with the other [Figure]. In On the fault proneness of SonarQube technical debt violations: An empirical study (thesis). ResearchGate. https://www.researchgate.net/figure/s-a-representation-of-the-different-components-of-SQ-and-how-they-interact-one-with-the_fig1_326655148


## Download and install using postgres as backend database
Create a docker compose file as given in the docker-compose.yml  
Then run the following commands:  
docker compose up -d 

## Login to the console
Open the browser and go to:  
http://localhost:9000  
User id: admin  
Password: admin (must be changed on first login)  


## Create your project
1. Login to sonarqube dashboard  
2. Create a local project and enter the below details:  
Project display name: **Human-readable name shown in SonarQube UI**  
Project Key: **A unique identifier for your project inside SonarQube** # copy this  
Branch Name: **The Git branch you are analyzing**  

> Example:    
* Project Display Name: Sonar Demo  
* Project Key: sonar-demo  
* Branch Name: main  

3. Next select 'Is Custom' and no. of days 30 (leave it as this default)  
4. Click create project  
5. Click locally  
6. Token name: **leave it to default**   
7. Expires in: 30 days **leave it to default** # later based on your project setup adjust this value   
8. Generate and copy the token  

> Note: Two things that will be used from this step are the project key and token to be used later  


## Adding sonarqube to Springboot Maven Project

Add properties 
Add plugin
mvn clean install sonar:sonar


### References:
ProgrammingKnowledge. (2024, January 29).   
How To Sonarqube Setup From Scratch And Code Analysis [Video].  
YouTube. https://www.youtube.com/watch?v=6vdRvz_LnbQ 



