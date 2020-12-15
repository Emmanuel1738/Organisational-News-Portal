# Organisational-News-Portal

### Description
This is a RESTful API that helps retrieve news for an organization. The users should be able to add news, add users and view the same
By Emmanuel Bett

## Installation

* Clone the repo: `https://github.com/Emmanuel1738/Organisational-News-Portal`
* Run the command `gradle build`
* Run the tests `gradle test`
* Launch the app `gradle run`.

### HTTP Methods

| Method | Path                  | Description               |
| ---    | ---                   | ---                       |
| `Post` | /departments/new      | Creates a new Department  |
| `Get`  | /departments          | Fetches all departments   | |
| `Post` | /users/new            | Creates a new User        |
| `Get`  | /users                | Fetches all users         |
| `Post` | /news/new             | Creates news              |
| `Get`  | /news                 | Fetches all news          |

### Prerequisites

- You need Java installed on your pc.
- You will need an IDE, preferably Intellij
- You also need Gradle. Install it using "sdk install gradle"
- You need postgres installed for the database to work.

### Setup.

- Clone the repo to your computer.
- Open the project folder with the IDE of your choice, preferably Intellij

### Database Setup
Launch your terminal, and type in psql. Then type the following

   - CREATE DATABASE organization_api;
   - \c organization_api
   - CREATE TABLE news(id serial PRIMARY KEY, title VARCHAR, newsContent VARCHAR, writtenBy VARCHAR, departmentId int);
   - CREATE TABLE departments_users(id serial PRIMARY KEY, departmentId int, usersId int);
   - CREATE TABLE users(id serial PRIMARY KEY, title VARCHAR, userName VARCHAR, position VARCHAR, userRole VARCHAR, departmentId int);
   
### API Documentation
- Get all users 
   (http://localhost4567/new)

- Add new user
   (http://localhost4567/new/users)
   
 - Get departments
   (http://localhost4567/departments)
 
 -Add new department
 (http://localhost4567/departments/new)

   
 - 
### Technologies Used
* Java
* Spark
* Heroku
* Intellij 
* Postgres  
 
 ### Known Bugs
 - Some of the API endpoints don't work.
### Contacts
Reach me via emmanuelbett13@gmail.com incase of any issues.

License
MIT Copyright (c) {2020} Emmanuel Bett.
