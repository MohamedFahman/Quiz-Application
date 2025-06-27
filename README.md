# Quiz Application

This is a comprehensive Quiz Application developed using Spring Boot. The application allows users to manage questions, create quizzes, and evaluate submissions. It utilizes Spring Data JPA for database operations and Hibernate as the ORM tool. The project also features RESTful APIs for seamless interaction.

## Features

- Manage questions with categories
- Create quizzes with a specified number of questions
- Evaluate quiz submissions
- RESTful APIs for interaction

## Technologies Used

- **Programming Languages:** Java
- **Framework:** Spring Boot
- **Database:** PostgreSQL
- **ORM:** Hibernate
- **Build Tool:** Maven

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6.3 or higher
- PostgreSQL 13 or higher

### Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/MohamedFahman/Quiz-Application.git
    cd Quiz-Application/quizapp
    ```

2. **Configure the database:**

    Update the `application.properties` file located in `src/main/resources` with your PostgreSQL database configuration:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/quizapp
    spring.datasource.username=yourusername
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Build the project:**

    ```bash
    mvn clean install
    ```

4. **Run the application:**

    ```bash
    mvn spring-boot:run
    ```

### API Endpoints

- **Create Quiz:**

    ```http
    GET  /question/allQuestions
    GET  /question/category/{category}
    GET  /question/add
    GET  /get/{id}
    POST /submit/{id}
    POST /quiz/create
    ```

    **Parameters:**

    - `category` (String): The category of questions.
    - `noQuestion` (int): The number of questions.
    - `title` (String): The title of the quiz.

    **Response:**

    - `200 OK`: If the quiz is created successfully.
    - `400 Bad Request`: If there is an error in the request.

### Project Structure

```bash
quizapp
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── quizapp
│   │   │               ├── controller
│   │   │               │   └── QuizController.java
│   │   │               │   └── QuestionController.java
│   │   │               ├── dao
│   │   │               │   └── QuestionDao.java
│   │   │               │   └── QuizDao.java
│   │   │               ├── model
│   │   │               │   ├── Question.java
│   │   │               │   └── Quiz.java
│   │   │               │   └── QuestionWrapper.java
│   │   │               │   └── Response.java
│   │   │               └── service
│   │   │                   └── QuizService.java
│   │   │                   └── QuestionService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
├── .gitignore
├── README.md
└── pom.xml
