# Salesforce Login Automation Framework

This project is a robust Selenium automation framework designed for testing the Salesforce login functionality. It is built using Java, Maven, and TestNG, following the Page Object Model (POM) design pattern.

## 🚀 Features

-   **Page Object Model (POM)**: Separates test logic from page details for better maintainability.
-   **Robust Locator Strategy**: Uses strictly **XPath** locators as per requirements.
-   **Explicit Waits**: Implements `WebDriverWait` for stable element interaction.
-   **Exception Handling**: Comprehensive `try-catch` blocks in both Page Objects and Test classes.
-   **Browser Management**: Uses `WebDriverManager` for automatic driver management.
-   **Test Management**: Uses TestNG for test execution and assertions.

## 🛠️ Technology Stack

-   **Language**: Java 11
-   **Build Tool**: Maven
-   **Testing Framework**: TestNG 7.9.0
-   **Browser Automation**: Selenium WebDriver 4.16.1
-   **Driver Manager**: WebDriverManager 5.6.3
-   **Logging**: SLF4J 2.0.9

## 📂 Project Structure

```
e:/Playwright/SalesforceAutomation
├── pom.xml                   # Maven dependencies and build configuration
├── testng.xml                # TestNG suite configuration
├── src
│   ├── main/java/com/salesforce/pages
│   │   └── LoginPage.java    # Page Object for Login Page
│   └── test/java/com/salesforce/tests
│       ├── BaseTest.java     # Test setup and teardown
│       ├── ValidLoginTest.java # Positive test scenarios
│       └── InvalidLoginTest.java # Negative test scenarios
```

## 📋 Prerequisites

-   Java Development Kit (JDK) 11 or higher
-   Maven installed and configured in system PATH
-   Google Chrome browser installed

## ⚙️ Installation

1.  Clone the repository or navigate to the project directory:
    ```sh
    cd e:/Playwright/SalesforceAutomation
    ```

2.  Install dependencies:
    ```sh
    mvn clean install -DskipTests
    ```

## ▶️ Running Tests

### Option 1: Using Maven (Command Line)

Run the specific test suite defined in `testng.xml`:
```sh
mvn clean test -DsuiteXmlFile=testng.xml
```

### Option 2: Using IDE (IntelliJ / Eclipse)

1.  Right-click on `testng.xml`.
2.  Select **Run 'e:/Playwright/SalesforceAutomation/testng.xml'**.

## 🏗️ Architecture Details

### 1. Page Objects (`src/main/java`)
-   **`LoginPage.java`**: Encapsulates all interactions with the Salesforce Login page.
    -   Attributes: WebElements identified by `@FindBy(xpath = ...)`.
    -   Methods: `enterUsername()`, `enterPassword()`, `clickLogin()`, `getErrorMessage()`.
    -   Includes a standard `PageFactory` initialization.

### 2. Tests (`src/test/java`)
-   **`BaseTest.java`**: Handling `@BeforeMethod` and `@AfterMethod`.
    -   Initializes `ChromeDriver` with options (Maximized, Disable Notifications).
    -   Navigates to the Salesforce login URL.
    -   Quits the driver after each test.
-   **`ValidLoginTest.java`**: Verifies successful login.
    -   *Note*: Requires valid credentials `testuser@example.com` / `SecurePassword123` to be updated in the code.
-   **`InvalidLoginTest.java`**: Verifies error handling for incorrect credentials.

## 🤝 Contributing

1.  Create a feature branch.
2.  Commit your changes.
3.  Push the branch and open a Pull Request.

