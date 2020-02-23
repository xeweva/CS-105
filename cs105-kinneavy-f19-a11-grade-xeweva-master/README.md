# A11 - Grade

# Overview

The project name of this exercise is **Grade**.

The purpose of this assignment is to give you practice parsing strings and using some combination of if statements, parallel if statements, switch statements, and Boolean expressions.

## Problem Description

You are to write a program that will take a grade as a String. This grade has the form of a letter (e.g. A, B, C, D, F) followed by an ***optional*** sign (e.g. +, -). The letter values are worth 4.0 grade points for an A, 3.0 for a B, 2.0 for a C, 1.0 for a D, and 0 for an F. The + sign add 0.3 to the grade points and the - sign subtracts 0.3. Note that an "A+" is still 4.0 points and an "F+" or "F-" is still 0 grade points.  **NOTE: You may not hard-code the return value for +/- grades, but must add or subtract 0.3**

This class will have a constructor that takes one argument and the following two methods:

- ```java
  public Grade(String grade)
  ```

  - Constructor that sets the grade as a String. This is the only place the grade is set. This will take a combination of a letter grade and possibly a +/- suffix

- ```java
  public String getLetterGrade()
  ```

   - Returns the grade as a String.

- ```java
  public double getNumericGrade()
  ```

   - Returns the numeric grade in the range 0.0 <= grade <= 4.0

Your **Program.java** should contain code to test your **Grade** object. Your test grades should be:

- "A+". Should return 4.0.
- "B". Should return 3.0.
- "B-". Should return 2.7.

**Hints:**

- You should be able to figure out the name of your class from the Constructor specification.
- You can use the **length()** method of the **String** object to figure out how many characters are in your input.
- You can use the **charAt()** method of the **String** object to extract a character from your string.

## Getting Started

Using the techniques shown on the instruction page [How to Start Every Java Project in this Course](https://canvas.sbcc.edu/courses/25771/modules/items/760779), create a new project from the GitHub classroom assignment.

Create the following files in the **src/main/java/edu/sbcc/cs105** folder and add the appropriately named classes to them

1. Program.java
2. Grade.java

Open up each class file and create the class structure. Add the standard header to the file.  The template for this header is available at: https://drive.google.com/open?id=1XLCgOqdXc9p7syhL0-VGlCc-q12actG-

**You'll have to add the proper Javadoc documentation** as well as the proper code to solve the problem. You will have to add instance variables, constants, method stubs, and code to get this class defined properly. Read the comments (and the problem) to understand what the problem is and how you will solve it.  

You will need to add test code to **Program.java** to test the **Grade.java** source code. 

Once you've written your code run the code by right clicking on **Program.java** in the file explorer and selecting **Run** from the context menu or using the debug tool from the **Activity Bar**. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

## Running Unit Tests

Don't forget to run unit tests before submitting your assignment.

**YOUR UNIT TESTS MUST PASS BEFORE SUBMITTING THE FILE OR YOU GET NOTHING (Reference to the original Charlie and the Chocolate Factory).**

## UML Diagram for the Project

Create a UML diagram that show both the Program and **Grade** class (and dependency relationship). For the **Grade** class, include the class name, instance variables, and public methods. Any private methods you choose to create do not need to be show. Export the UML project as an XMI document and place in the root folder of the java project (same folder as the pom.xml). Do not zip / compress this file.

## Submitting Your Assignment

Follow the standard instructions for submitting a Java assignment: [How to Submit Assignments](https://canvas.sbcc.edu/courses/25771/pages/how-to-submit-assignments-new?module_item_id=761292). Once you have submitted your assignment, it is a good idea to check the branches section of GitHub a few minutes later to see if your unit tests passed on the build server (green checkmark is good, red X is bad)