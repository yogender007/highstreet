# Project for notonhighstreet.com task
Test Project for notonhighstreet.com task

#### 1. Prerequisite
a. JDK is installed and ‘JAVA_HOME’ and ‘Path’ environment variable are set
b. Maven is installed and ‘M2_HOME and ‘Path’ environment variables are set
c. Eclipse/IntelliJ (or any editor of your choice) is installed

#### 2. Import and Open the project in eclipse editor
a. Navigate to Test file and run the tests by right clicking and selecting the option.
b. Open command prompt/terminal and navigate to project home directory

#### 3. Running the Tests 

##### Run all the test classes.
a. mvn clean verify 

###### Run a single test class. 
b. mvn -Dtest=TestCheckout test

###### Run a single test method from a test class.
c. mvn -Dtest= TestCheckout#testCheckOutScenario2 test
