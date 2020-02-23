# A21 - Dedup

# Overview

The project name of this exercise is **Dedup**.

The purpose of this assignment is to learn how to work with iteration, reading a file, sorting, as well as how to write all of your own code and JavaDocs comments.

## Problem Description

Dedup is pronounced "dee-dupe" and it refers to the elimination of duplicate items (i.e. to de-duplicate them). You are to create an object that will read in a list of integers and then tell you how many of a given number are present in the list. Also, you can ask for an ArrayList of all of the unique numbers in the list.

By way of an example, if you read in a sequence that is 1, 1, 3, 9, 5, 5, 1 and you ask how many "1"s you'll get back "3" as your answer. Also, an ArrayList of unique items will contain 1, 3, 5, 9 (note that they are in ascending order).

The object to implement this is referred to as **Dedup** and consists of the following public methods:

**public Dedup(String filename) throws Exception** - Constructor which takes a filename and reads the data from the file. See the file "small.txt" for details on the file format.

**public int howMany(int ofThisValue)** - This will return the number of times the number *ofThisValue* appears in the list that was specified when the object was created.

**public ArrayList returnUnique()** - Returns an array list consisting of each unique number in the file specified when the object was created. The numbers must be in ascending order.

Your **Program.java** should contain code to test your **Dedup** object using the test file "small.txt". The tester will use the file "large.txt". Both files are available in Canvas and **must** be imported into your project.

### Hints

- The Arrays object has a sort method but it only works on arrays not ArrayLists.
- You will probably need to know how to convert an **ArrayList** to an **Array** for this assignment.

Your **Program.java** file should contain code to test your **Dedup** object. Load multiple values and check to make sure that the values match the expected values. Use looping to load and test your object.

## Getting Started

Using the techniques shown on the instruction page [How to Start Every Java Project in this Course](https://canvas.sbcc.edu/courses/25771/modules/items/760779), create a new project from the GitHub classroom assignment.

Create the following files in the **src/main/java/edu/sbcc/cs105** folder and add the appropriately named classes to them

1. Program.java
2. Dedup.java

Open up each class file and create the class structure. Add the standard header to the file.  The template for this header is available at: https://drive.google.com/open?id=1XLCgOqdXc9p7syhL0-VGlCc-q12actG-

**You'll have to add the proper Javadoc documentation** as well as the proper code to solve the problem. You will have to add instance variables, constants, method stubs, and code to get this class defined properly. Read the comments (and the problem) to understand what the problem is and how you will solve it.  

You will need to add test code to **Program.java** to test your source code. 

Once you've written your code run the code by right clicking on **Program.java** in the file explorer and selecting **Run** from the context menu or using the debug tool from the **Activity Bar**. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

## Running Unit Tests

Don't forget to run unit tests. The unit test is called **TestDedup.java**

**YOUR UNIT TESTS MUST PASS BEFORE SUBMITTING THE FILE OR YOU GET NOTHING (Reference to the original Charlie and the Chocolate Factory).**

## UML Diagram for the Project

Create a UML diagram for this class based upon the specifications including all classes and relationships

## Submitting Your Assignment

Follow the standard instructions for submitting a Java assignment: [How to Submit Assignments](https://canvas.sbcc.edu/courses/25771/pages/how-to-submit-assignments-new?module_item_id=761292). Once you have submitted your assignment, it is a good idea to check the branches section of GitHub a few minutes later to see if your unit tests passed on the build server (green checkmark is good, red X is bad)
