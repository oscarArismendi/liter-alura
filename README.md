﻿# liter-alura
## Prerequisites to Run the Project

1. **Java Development Kit (JDK) 17 or Higher**  
   - Download and install the latest version of the JDK from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) or [OpenJDK](https://openjdk.org/).

2. **Maven**  
   - Ensure Apache Maven is installed and properly configured.  
   - Verify installation by running `mvn -v` in the terminal.

3. **PostgreSQL Database**  
   - Install PostgreSQL and create a database for the project.
   - Default database connection details (adjust as needed):
     - Host: `localhost`
     - Port: `5432`
     - Database Name: `liter_alura`
     - Username: `postgres`
     - Password: `your_password`

4. **Spring Boot Configuration**  
   - Update the `application.properties` file to match your PostgreSQL database credentials:
     ```
     spring.datasource.url=jdbc:postgresql://localhost:5432/liter_alura
     spring.datasource.username=postgres
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```

5. **Internet Connection**  
   - Required to interact with the Gutendex API.

6. **Dependencies and Build Tools**  
   - Execute `mvn clean install` to download all dependencies and build the project.
   - 
## Main Menu Preview  
The main navigation hub of the application. It provides a list of all available actions and menus to interact with the system.

<div align="center">
  <img src="https://github.com/user-attachments/assets/9ced7d21-5d28-422b-8f7f-6bd5be340080" />
</div>

## Consult Books Menu Preview  
Search for books by title. The system fetches information such as authors, languages, and download counts, allowing users to explore details about their desired books.

<div align="center">
  <img src="https://github.com/user-attachments/assets/09526112-54e6-479e-bb13-6c1c6b99a104" />
</div>

## List Historial Of Books Menu Preview  
View the full history of books that have been searched and saved in the database. This menu displays titles, authors, languages, and download counts.

<div align="center">
  <img src="https://github.com/user-attachments/assets/e3098983-f7bd-4dde-bef8-c1c7bdf3646d" />
</div>


## List Historial Of Authors Menu Preview  
Access a complete list of authors from the database. For each author, you can see their name, birth year, death year (if available), and related books.

<div align="center">
  <img src="https://github.com/user-attachments/assets/71d5f7e6-b2b9-42a8-abf4-68a741938504" />
</div>

## List Authors Alive in Specific Year Preview  
Enter a specific year to see a list of authors who were alive during that time. The system calculates this based on the authors' birth and death years.

<div align="center">
  <img src="https://github.com/user-attachments/assets/6c654412-b4a4-4b46-a571-5122bdcc07e6" />
</div>

## List Stats Of Searched Books by Language Preview  
Displays the number of books in the database categorized by language. This provides insights into the diversity of languages among the saved books.

<div align="center">
  <img src="https://github.com/user-attachments/assets/86455768-bacf-428e-ba80-2ac744e8d499" />
</div>

## Top 10 Downloaded Books Preview  
Showcases the top 10 most downloaded books from the database. The list is sorted in descending order by download count, with detailed information for each book.

<div align="center">
  <img src="https://github.com/user-attachments/assets/b7e89c4a-866f-45f9-b571-e59da6099ff7" />
</div>
