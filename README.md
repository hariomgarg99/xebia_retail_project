# xebia_retail_project


Retail Bill Amount Generator for a Sample Retail Store

Following is the goal of this program

On a retail website, the following discounts apply:

If the user is an employee of the store, he gets a 30% discount
If the user is an affiliate of the store, he gets a 10% discount
If the user has been a customer for over 2 years, he gets a 5% discount.
For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount).
The percentage based discounts do not apply on groceries.
A user can get only one of the percentage based discounts on a bill.
Finds the net payable amount.

Few Notes :-

Since i have created this project using Maven, this can be imported in eclipse as a Maven Project specifying the pom file. Run [mvn clean eclipse:eclipse] to generate eclipse files for the project.

Run [mvn clean install] to install and run all the test cases.

I have included Cobertura for Coverage Analysis and Reporting. To generate reports run [mvn soanr:sonar] . Reports will be generated in the target folder of the project as well as sonar ui on localhost:9000.

code coverage for the project is 100% and line coverage is 80% till last noticed.

I have kept this exercise as simple and tried not to overcode. This project contains 10 test cases.

I have used Joda-Time for efficient Date related calculations.

This Application uses Java 1.8 and 11 for sonar qube and JUnit.