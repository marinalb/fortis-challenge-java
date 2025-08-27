# Fortis Games QA Exercise

This project was developed using **Java + Selenium + TestNG**, applying the **Page Object Model (POM)** design pattern to ensure better **organization**, **maintainability**, and **reusability** of the main methods across the test suite, the repository contains an **automated test suite** developed to validate some functionalities of the [Random Calendar Date Generator](https://www.random.org/calendar-dates/) website as part of the Fortis Games coding exercise.

**Note:** Questions 1 and 2 (non-coding) are answered in a separate file at the project root: **Q1+Q2.pdf**


##  Tech Stack
- **Language:** Java 17+
- **Framework:** TestNG
- **Automation Tool:** Selenium WebDriver
- **Build Tool:** Maven
- **Assertions:** TestNG Assertions
- **Browser:** Chrome (via ChromeDriver)



### 1️⃣ Run from the Terminal (Recommended)

1. **Open your terminal.**
2. Navigate to the project folder where the repository was cloned:
   ```bash
   cd fortis-challenge-java

   mvn clean test -Dtest=CalendarGetDatesTest

### 2️⃣ Run Inside IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Navigate to the file:
    ```bash
    src/test/java/com/randomcalendar/tests/CalendarGetDatesTest.java
3. Right-click on the class name CalendarGetDatesTest.
4. Select "Run 'CalendarGetDatesTest'".
5. IntelliJ will compile the project and execute the tests automatically.
 

##  Implemented Validations

| **Test Name**                       | **What It Validates**                                  |
|------------------------------------|--------------------------------------------------------|
| `validateAddDatesGetDates`         | Add dates and click on GetDates button test      |
| `validateFourDates`               | Confirms that **4 dates** are returned.                |
| `validateFourDatesV2`            | Confirms that **4 dates** are returned, but version 2  |
| `validateGeneratedDatesWithinRange` | Validates that dates are **within the allowed range**. |



## Project Structure
```bash
fortis-challenge-java/
├── src
│   ├── main
│   │   └── java/com/randomcalendar/pages
│   │       ├── BasePage.java            # Page base class
│   │       ├── CalendarDatesPage.java   # Page Object: inputs & actions Main Page
│   │       └── DateGeneratorPage.java   # Page Object: generated dates & Result Page
│   └── test
│       └── java/com/randomcalendar/tests
│           ├── BaseTest.java            # Test setup & teardown
│           └── CalendarGetDatesTest.java # Test scenarios
├── pom.xml
└── README.md
