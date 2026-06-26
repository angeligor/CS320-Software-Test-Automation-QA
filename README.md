# CS320-Software-Test-Automation-QA

## Overview
This repository contains portfolio artifacts from CS 320 Software Test, Automation, and Quality Assurance. The included files demonstrate my work with Java, JUnit testing, software requirements, unit testing, and quality assurance practices.

## Included Artifacts

## Project One: Contact Service
The Contact Service files demonstrate how I created and tested a backend service using Java and JUnit. The files include:

Contact.java
ContactService.java
ContactTest.java
ContactServiceTest.java

These files show how I tested requirements such as unique contact IDs, field length limits, null validation, phone number validation, adding contacts, deleting contacts, and updating contact information.

## Project Two: Summary and Reflection Report

The Project Two report explains my unit testing approach, how my tests aligned with software requirements, and how I used testing techniques such as positive testing, negative testing, boundary testing, exception testing, and code coverage analysis.

## Reflection

## How can I ensure that my code, program, or software is functional and secure?
I can ensure that my code is functional by writing tests that are based directly on the software requirements. In this project, I used JUnit tests to check valid inputs, invalid inputs, boundary values, duplicate IDs, and expected exceptions. I can also improve security by validating input, rejecting null or invalid values, and testing failure cases instead of only testing successful cases. 

## How do I interpret user needs and incorporate them into a program?
I interpret user needs by turning requirements into specific rules that the program must follow. For example, if the requirement says a contact ID cannot be longer than 10 characters, I turn that into both program logic and a JUnit test. This helps ensure the final program matches what the user or customer requested. 

## How do I approach designing software?
I approach software design by breaking the problem into smaller parts with clear responsibilities. For this project, I separated the contact object from the contact service so the data model and service behavior were easier to understand and test. I then used unit tests to verify each behavior, which made the code easier to maintain and helped confirm that it met the requirements.
