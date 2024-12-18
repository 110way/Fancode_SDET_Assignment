# Fancode SDET Assignment

This repository contains the automation framework for the Fancode SDET Assignment. Follow the steps below to set up and run the tests.

---

## Prerequisites

Ensure the following are installed:
- **Java JDK 8+**: [Download](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Maven**: [Download](https://maven.apache.org/download.cgi)
- **Git**: [Download](https://git-scm.com/downloads)
- **Chrome**: Latest version recommended
- **IDE**: IntelliJ IDEA or Eclipse (optional)

---

## Setup Instructions

1. Clone the repo and navigate to the folder / Download Fancode_SDET_Assignment.zip from git hub > unzip > Open in IDE
   ```bash
   git clone https://github.com/110way/Fancode_SDET_Assignment.git
   cd Fancode_SDET_Assignment
   
2.Open the project in your preferred IDE.

3.Dependancies updation :
Right-click on the project in the Project Explorer.

Select Maven > Update Project.

Alternatively, you can also press Alt + F5 after selecting the project.
In the Update Maven Project dialog that appears:

Make sure Force Update of Snapshots/Releases is checked.
Click OK.
This will force Maven to re-download all dependencies and ensure that the latest versions are used.

4.Configure the config.properties file (if applicable) in the src/test/resources folder. Set the following:

Base URL
Browser type
Test environment details



---

## Running the Tests
Using TestNG XML:

1.Open Eclipse / IntelliJ IDEA.
Go to File > Import.
Select Existing Maven Projects under the Maven folder and click Next.
Browse to the folder where you cloned the repository and click Finish.
Ensure Maven Dependencies Are Installed:

2.Right-click the project in the Package Explorer.
Select Maven > Update Project.
Check the box for your project and click OK. This ensures all dependencies are downloaded.
Check the TestNG Plugin:

3.Ensure you have the TestNG plugin installed in Eclipse / IntelliJ IDEA.

To install, go to Help > Eclipse Marketplace, search for "TestNG", and install it.
Run Tests via TestNG XML:
   -Locate the testng.xml file in the project root
   -Right-click on the testng.xml file and select "Run as TestNG Suite".

To set up TestNG in IntelliJ IDEA, begin by installing the TestNG plugin. 
Run Tests via TestNG XML:
   -Open IntelliJ IDEA, navigate to File > Settings, and select Plugins from the left-hand menu. 
   -Search for "TestNG" in the Marketplace tab, click Install, and restart IntelliJ to activate the plugin.

Run Tests via TestNG XML:
   -Locate the testng.xml file in the project root
   -Right-click on the testng.xml file and select "Run as TestNG Suite"
   
After the tests complete, reports will be available in the test-output folder.
Open emailable-report.html in a browser to view the results.


---
## Technologies Used
Java: Programming language
Selenium WebDriver: For test automation
TestNG: Test framework
Maven: Build and dependency management
Git: Version control



