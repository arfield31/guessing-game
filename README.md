# Guessing Game
## Background
### This is a simple Java Spring Boot application that illustrates how to:
- set up the basic structure of a Spring Boot application
- construct a simple webservice
- use the h2 embedded database for persistence
  - see annotation in model/GuessingResult.java
  - see src/main/java/resources/application.properties
- serve static html and javascript from a Spring Boot application
  - Spring Boot automatically serves static content if it is placed in src/main/resources/public
  - see src/main/resources/public/index.html

### How To Test Repo
- (1) clone the repo,
- (2) execute gradle bootRun
- (3) point the browser at localhost:8080/index.html,
- (4) play the game
- (5) point the browser at localhost:8080/h2-console to see the contents of the database.