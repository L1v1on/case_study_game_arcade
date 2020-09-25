# case_study_game_arcade
Full-stack web application using SpringBoot. Case study for PerScholas Charlotte 2020 1st cohort.

# what technology is used
- Front-End: JSP/CSS/JS
- Back-End: Spring Boot - embedded Apache Tomcat server
- Database: Spring H2 Database
- Game Engine: Phaser (JS game engine framework - create browser based games)

# how to run
1. `git clone` https://github.com/L1v1on/case_study_game_arcade.git
2. navigate into the arcade directory
3. run ArcadeApplication under src -> main -> java -> com.ezra.arcade
4. go to http://localhost:8085/login **(application.propertise has default port set to 8085 not 8080)**
5. register and login
  - can see registered players in h2 database here http://localhost:8085/h2-console/
  - Driver Class should be `org.h2.Driver`
  - JDBC URL should be `jdbc:h2:mem:testdb`
  - User Name should be `sa`
  - Password is left blank
6. select game\
**Everything below is not fully implemented as of 09/24/2020**
7. play game (your score should get submitted to server and saved into the database)
8. click on view profile button to see your current scores for all games
