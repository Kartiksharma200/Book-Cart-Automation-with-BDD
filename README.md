# Book Cart Automation with BDD

Project Overview

This repository contains an automated test framework for the Book Cart application using Behavior Driven Development (BDD) with Cucumber, Selenium, and TestNG. The framework enables efficient and maintainable test automation using feature files, step definitions, and test runners.

# Directory Structure
~~~
kartiksharma200-book-cart-automation-with-bdd/
├── README.md                                 # Project documentation
└── BookCart-Automation-ByCucumber/
    ├── pom.xml                               # Maven dependencies and configurations
    ├── src/
    │   └── test/
    │       ├── java/
    │       │   └── com/
    │       │       ├── stepDefinition/      # Step definitions for feature files
    │       │       │   ├── addToCartStep.java
    │       │       │   ├── loginStep.java
    │       │       │   └── signUpStep.java
    │       │       └── testRunner/          # Test runner for executing tests
    │       │           └── TestRunnerForCucumber.java
    │       └── resources/
    │           └── AllFeaturesfile/         # Feature files for BDD
    │               ├── AddToCart.feature
    │               ├── login.feature
    │               └── sign-up.feature
    ├── target/                               # Compiled classes and generated reports
    │   ├── classes/
    │   │   └── META-INF/
    │   │       ├── MANIFEST.MF
    │   │       └── maven/
    │   │           └── Resume-Project/
    │   │               └── Resume-Project/
    │   │                   ├── pom.properties
    │   │                   └── pom.xml
    │   └── test-classes/
    │       ├── AllFeaturesfile/
    │       │   ├── AddToCart.feature
    │       │   ├── login.feature
    │       │   └── sign-up.feature
    │       └── com/
    │           ├── stepDefinition/
    │           └── testRunner/
    └── test-output/                          # Test execution reports
        ├── emailable-report.html
        ├── index.html
        ├── testng-failed.xml
        ├── testng-reports.css
        ├── testng-reports.js
        ├── testng-results.xml
        ├── Default suite/
        │   ├── Default test.html
        │   ├── Default test.xml
        │   └── testng-failed.xml
        └── junitreports/
            └── TEST-com.testRunner.TestRunnerForCucumber.xml
~~~
# Features

Behavior Driven Development (BDD) with Cucumber

* Selenium WebDriver for UI Testing
* TestNG for Test Execution and Reporting
* Page Object Model (POM) Implementation

# Cross-Browser Testing Support

Detailed Test Reports

Prerequisites

* Java Development Kit (JDK) 8 or higher
* Maven
* Selenium WebDriver
* Cucumber
* TestNG
* An IDE (IntelliJ IDEA, Eclipse, VS Code)

# Installation & Running Tests

Install Dependencies:
~~~
mvn clean install
~~~
Execute All Tests:
~~~
mvn test
~~~
Execute Specific Test Runner:
~~~
mvn test -Dcucumber.options="src/test/resources/AllFeaturesfile"
~~~
Reporting

Test execution reports are available in the test-output/ directory. Open index.html for detailed results.

Contribution

Feel free to fork this repository, raise issues, or contribute via pull requests.
