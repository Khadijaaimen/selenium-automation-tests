# Selenium WebDriver Automation Project (Java + IntelliJ)

## Project Overview
This project demonstrates automated UI testing using **Selenium WebDriver with Java** in **IntelliJ IDEA**.  
It was developed as part of Test Automation University training and extended with multiple automated test cases.  

The project covers end-to-end test automation workflows including login, form submissions, navigation flows, and validation of UI elements.

---

## Tech Stack
- **Language**: Java  
- **Framework**: Selenium WebDriver  
- **Test Runner**: TestNG
- **IDE**: IntelliJ IDEA  
- **Build Tool**: Maven
- **Reports**: TestNG reports

---

## Project Structure
```├── src/
│ ├── test/java/
│ │ ├── tests/ # Test classes
│ │ ├── pages/ # Page Object Model classes
│ │ └── utils/ # Utility classes (driver setup, helpers)
├── pom.xml # Maven dependencies
├── testng.xml # TestNG suite file (if used)
├── reports/ # Copied reports for GitHub visibility and
├── reports/index.html # Auto-generated reports after running tests
└── README.md # Project documentation
```

---

## How to Run the Tests
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/selenium-automation-tests.git
   cd selenium-automation-tests
2. mvn clean install
3. mvn test

## Features & Test Cases
- Login flow validation (valid & invalid credentials)
- Form submission tests (required fields, input validation)
- Navigation checks (menus, links, buttons)
- Assertions for page titles, error messages, and element visibility

## Reports
- Default TestNG emailable-report.html available in /target/surefire-reports/ after execution.
- For GitHub portfolio, sample reports are copied into /reports/ folder.
- These reports include:
    * Total tests executed
    * Passed/Failed/Skipped summary
    * Execution time
    * Error stack traces

