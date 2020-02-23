# A10 - IntegerPairs

# Overview

The project name of this exercise is **IntegerPairs**.

The purpose of this assignment is to give you practice parsing strings and using some combination of if statements, parallel if statements, switch statements, and Boolean expressions.

## Problem Description

You are to write a program that will take one string of four positive, single-digit integers (e.g. "0 1 1 2") and will test to see if there are two pairs present in the string. This will be implemented by the **IntegerPairs** object. This object will have a constructor that takes no arguments and the following two methods:

- ```java
  public void setPairString(String str)
  ```

   - This method will take a string as an argument and then store it in an instance variable.

- ```java
  public boolean hasTwoPairs()
  ```

   - This will return true when there are only two pairs present in the string.

Hints:

- You can use a **Scanner** on a string as well as **System.in**. It works the same way but the constructor takes a string rather than **System.in**.
- After you are done with the scanner be sure to call **{your scanner variable name}.close()**;
- Don't be afraid to make local variables. You can use them to hold the numbers you get from the string.
- You do NOT need nested ifs and you definitely do NOT need loops to solve this
- Think about using the && (logical and) operator to test conditions
- Depending on what method you use to convert strings (e.g. Integer.parseInt), you may want to use an try...catch block (covered in class) to handle a parsing exception. See the Java API documentation for what type of exception an the parseInt method throws

## Getting Started

Using the techniques shown on the instruction page [How to Start Every Java Project in this Course](https://canvas.sbcc.edu/courses/25771/modules/items/760779), create a new project from the GitHub classroom assignment.

Create the following files in the **src/main/java/edu/sbcc/cs105** folder and add the appropriately named classes to them

1. Program.java
2. IntegerPairs.java

Open up each class file and create the class structure. Add the standard header to the file.  The template for this header is available at: https://drive.google.com/open?id=1XLCgOqdXc9p7syhL0-VGlCc-q12actG-

**You'll have to add the proper Javadoc documentation** as well as the proper code to solve the problem. You will have to add instance variables, constants, method stubs, and code to get this class defined properly. Read the problem carefully to understand what the problem is and how you will solve it.  

You will need to add test code to **Program.java** to test the **IntegerPairs.java** source code. 

Once you've written your code run the code by right clicking on **Program.java** in the file explorer and selecting **Run** from the context menu or using the debug tool from the **Activity Bar**. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

## Running Unit Tests

Don't forget to run unit tests before submitting your assignment.

**YOUR UNIT TESTS MUST PASS BEFORE SUBMITTING THE FILE OR YOU GET NOTHING (Reference to the original Charlie and the Chocolate Factory).**

## UML Diagram for the Project

Create a UML diagram that show both the **Program** and **IntegerPairs** class (and dependency relationship). For the **IntegerPairs** class, include the class name, instance variables, and public methods. Any private methods you choose to create do not need to be show. Export the UML project as an XMI document and place in the root folder of the java project (same folder as the pom.xml). Do not zip / compress this file.

## Submitting Your Assignment

Follow the standard instructions for submitting a Java assignment: [How to Submit Assignments](https://canvas.sbcc.edu/courses/25771/pages/how-to-submit-assignments-new?module_item_id=761292). Once you have submitted your assignment, it is a good idea to check the branches section of GitHub a few minutes later to see if your unit tests passed on the build server (green checkmark is good, red X is bad)
