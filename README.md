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
9. For maven project click the maven tab and you wil get something like below:
```
mvn clean verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar \
  -Dsonar.projectKey=sonar-demo \
  -Dsonar.projectName='Sonar Demo' \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.token=<your token>

```
10. This can be copied and used directly to run the project

> Note: Two things that will be used from this step are the project key and token to be used later  


## Adding sonarqube to Springboot Maven Project
1. Create a springboot maven project (ref. sonar-demo)
2. In the pom.xml file add the following under properties and plugin sections:   
```
<!-- Connection Details -->
<sonar.host.url>http://localhost:9000</sonar.host.url>
<!-- Use a token for authentication (recommended) -->
<sonar.token>Your token that your copied</sonar.token>
<!-- Project Details (optional, often automatically detected) -->
<sonar.projectKey>Your project key that you copied</sonar.projectKey>

<plugin>
    <groupId>org.sonarsource.scanner.maven</groupId>
    <artifactId>sonar-maven-plugin</artifactId>
    <version>5.5.0.6356</version>
</plugin>

```
3. Run the maven project by running the following command:  
mvn clean install sonar:sonar  



### References:
ProgrammingKnowledge. (2024, January 29).   
How To Sonarqube Setup From Scratch And Code Analysis [Video].  
YouTube. https://www.youtube.com/watch?v=6vdRvz_LnbQ 



