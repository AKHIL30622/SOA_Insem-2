USER MOCK TESTING - HOW TO RUN

Requirements:
- JDK 17 or later
- Maven 3.6.3 or later

Steps:
1. Extract the ZIP file.
2. Open the UserMockTesting folder in VS Code, IntelliJ, or Spring Tool Suite.
3. Open a terminal in the project folder.
4. Run:

   mvn test

Expected result:
- Tests run: 1
- Failures: 0
- Errors: 0
- BUILD SUCCESS

Test endpoint:
GET /users/1

Expected JSON:
{
  "id": 1,
  "name": "Akhil"
}

Important:
The test uses @WebMvcTest to load the controller layer and @MockBean
to provide a mocked UserService. The test does not require a database.

Compatibility:
This project uses Spring Boot 3.5.7 and Java 17.
