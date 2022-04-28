
# Full Stack Test Automation - Final Project.

## About :

Hello everyone.

Here is my final project from the course Full Stack Test Automation I did, in the project you can see an infrastructure that supports a large number of platforms while using frameworks such as: Selenium, TestNG, Appium and more..

## Supported Platforms :

- Web 

- Database Integration

- Mobile

- REST API

- Desktop Apps

- Electron App

## Tools & Frameworks :

- [TestNG](https://testng.org/doc/) - TestNG is a unit testing framework specifically designed to develop automated testing. This is a framework written in Java and is based on another framework - Junit.

- [Selenium](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java) - Selenium is the automation infrastructure for browsers.

- [WebDriverManager](https://github.com/bonigarcia/webdrivermanager) - Open-Source Java library that carries out the management of the drivers required by Selenium WebDriver

- [Allure Framework](https://docs.qameta.io/allure/) - Allure Framework is a test report framework.

- [Sikuli](http://sikulix.com/) - Sikoli is a testing framework for graphical elements.

- [Monte Media Library](http://www.randelshofer.ch/monte/) - Java library for processing media data for root cause analyses.

- [Appium](https://mvnrepository.com/artifact/io.appium/java-client) - Appium is an open source test automation framework for use with native, hybrid and mobile web apps.
 
- [REST-Assured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured) - Testing and validating REST services in Java.

- [JSoup](https://mvnrepository.com/artifact/org.jsoup/jsoup) - jsoup is a Java library for working with real-world HTML.

- [MySQL Connector/J](https://mvnrepository.com/artifact/mysql/mysql-connector-java) - For integrating MySQL DB testing.

## List of applications used in the project :
- Atid.Store - Web based application.
- FinancialCalculators - Mobile application.
- REQRES - Web API
- ToDoList - Electron application.
- Windows Calculator - Desktop application.

## Installation :

- https://maven.apache.org/install.html - For running the project.
- https://docs.qameta.io/allure/ - To see allure results.
- https://github.com/Microsoft/WinAppDriver/releases - For Desktop Tests.
- https://appium.io/ - AppiumStudio For Mobile Tests.
- https://apkfun.com/down_Financial-Calculators.10301702.html - The app apk for Mobile Tests (need to install on the device mobile first).
- https://www.electronjs.org/apps/todolist - "TODO" electron app to install for Electron Tests.

## Running Tests :

To run the tests,  run the following command :

```bash
  mvn test -PWebTests
```
```bash
  mvn test -PMobileTests
```
```bash
  mvn test -PElectronTests
```
```bash
  mvn test -PAPITests
```
```bash
  mvn test -PDesktopTests
```
