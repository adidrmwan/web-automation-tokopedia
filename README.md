# AUTOMATION TESTING - JAVA

System Under Test:
1. Web

Features:
1. Selenium for Website
2. Junit
3. Cucumber

## Prerequisites
* [JDK 8](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html)
* [Git](https://git-scm.com/downloads)
* [Intellij IDEA](https://www.jetbrains.com/idea/download/)
* [Gradle](https://gradle.org/install/)
* [Chromedriver](https://formulae.brew.sh/cask/chromedriver)
* [Chrome Browser](https://www.google.com/chrome/)
* [Geckodriver](https://formulae.brew.sh/formula/geckodriver)
* [Firefox Browser](https://www.mozilla.org/en-US/firefox/new/)

## Getting started
1. Clone the repository

## Intellij Plugin
### Cucumber for Java
Add IntelliJ Cucumber for Java plugin:

* Open `Preferences` (⌘ + ,)
* Go to `Plugins > Marketplace`
* Search for `Cucumber for Java` and Install

### Lombok Plugin
Add IntelliJ Cucumber for Java plugin:
* Open `Preferences` (⌘ + ,)
* Go to `Plugins > Marketplace`
* Search for `Lombok` and Install

## Running the Test
* To execute Website Test cases
  > ./gradlew clean cucumber --tags @Web generateCucumberReports

## Report
* Find the reporting file on `build/customreport/overview-features.html`
* Open the reporting file in browser