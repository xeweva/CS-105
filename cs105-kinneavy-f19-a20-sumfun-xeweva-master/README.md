# A22 - SumFun

# Overview

The project name of this exercise is **SumFun**.

The purpose of this assignment is to learn how to work with iteration and ArrayLists as well as how to write all of your own code.

## Problem Description

You are writing an object that is a list of numbers on which you are able to some simple mathematical computations. Please note that all of the indices that will be passed to you will be valid; you don't have to write error checking code. However, you will have to handle the case where you create a fresh object and call the appropriate methods (e.g. **sumOfAllOddNumbers**).

The object to implement this is referred to as **SumFun** and consists of the following public methods:

**public void addToList(int i)** - Add an integer to our list of integers.

**public int sumOfAllEvenNumbers()** - Returns the sum of all even numbers in the list.

**public int sumOfEvenNumbers(int start, int end)** - Returns the sum of all even numbers from the start index (given by start) and the end index (given by end). Note that it includes both the start and end indices.

**public int sumOfAllOddNumbers()** - Returns the sum of all odd numbers in the list.

**public int sumOfOddNumbers(int start, int end)** - Returns the sum of all even numbers from the start index (given by start) and the end index (given by end). Note that it includes both the start and end indices.

**public int sumOfOddDigitsForItem(int itemIndex)** - Given an index into the list you extract the number and then add all of the odd digits. For example, if you have the number 1234 the sum of the odd digits is 1 + 3 = 4.

Your **Program.java** should contain code to test your **SumFun** object. Load multiple values and check to make sure that the values match the expected values. Use looping to load and test your object.

## Getting Started

Using the techniques shown on the instruction page [How to Start Every Java Project in this Course](https://canvas.sbcc.edu/courses/25771/modules/items/760779), create a new project from the GitHub classroom assignment.

Create the following files in the **src/main/java/edu/sbcc/cs105** folder and add the appropriately named classes to them

1. Program.java
2. SumFun.java

Open up each class file and create the class structure. Add the standard header to the file.  The template for this header is available at: https://drive.google.com/open?id=1XLCgOqdXc9p7syhL0-VGlCc-q12actG-

**You'll have to add the proper Javadoc documentation** as well as the proper code to solve the problem. You will have to add instance variables, constants, method stubs, and code to get this class defined properly. Read the comments (and the problem) to understand what the problem is and how you will solve it.  

You will need to add test code to **Program.java** to test the your source code. 

Once you've written your code run the code by right clicking on **Program.java** in the file explorer and selecting **Run** from the context menu or using the debug tool from the **Activity Bar**. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

## Testing Your Code

Your **Main.java** should contain code to test your **SumFun** object. Create a loop and add the numbers from 0 to 39 (inclusive). You should get the following output.

```
s.sumOfAllEvenNumbers: 380
s.sumOfEvenNumbers between 3 and 31: 238
```

## Running Unit Tests

Don't forget to run unit tests. The unit test is called **TestSumFun.java**

**YOUR UNIT TESTS MUST PASS BEFORE SUBMITTING THE FILE OR YOU GET NOTHING (Reference to the original Charlie and the Chocolate Factory).**

## UML Diagram for the Project

Create a UML diagram for this class based upon the specifications including all classes and relationships

## Submitting Your Assignment

Follow the standard instructions for submitting a Java assignment: [How to Submit Assignments](https://canvas.sbcc.edu/courses/25771/pages/how-to-submit-assignments-new?module_item_id=761292). Once you have submitted your assignment, it is a good idea to check the branches section of GitHub a few minutes later to see if your unit tests passed on the build server (green checkmark is good, red X is bad)
