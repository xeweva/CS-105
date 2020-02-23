# A19 - ReverseWord

# Overview

The project name of this exercise is **ReverseWord**.

The purpose of this assignment is to learn how to work with iteration and string processing. You get more practice on how to write all of your own code and Javadoc comments.

## Problem Description

You are going to write an object that takes a word (or short phrase) as an input for the Constructor and then will reverse the letters in the word.

The object to implement this is referred to as **ReverseWord** and consists of **only** the following public methods:

**public void setWord(String word)** - Sets the word to be processed.

**public String getWord()** - Returns the word that is set with **setWord**. Note that if this is called before setWord then an empty String is returned.

**public String getReversedWord()** - Returns the word set by setWord with the letters in reverse order. Note that if this is called *before* **setWord** then an empty string is returned.

Note that you **do not** implement a Constructor. We will simply use the default constructor that Java creates for us. Your **Program.java** should contain code to test your **ReverseWord** object. Load multiple values and check to make sure that the values match the expected values.

Requirements:

-  You must implement this manually using a loop. While there are Java capabilities that can do this in a single line of code, you may NOT use them. Even though this is less efficient, the objective is to apply the use of loops. 

## Getting Started

Using the techniques shown on the instruction page [How to Start Every Java Project in this Course](https://canvas.sbcc.edu/courses/25771/modules/items/760779), create a new project from the GitHub classroom assignment.

Create the following files in the **src/main/java/edu/sbcc/cs105** folder and add the appropriately named classes to them

1. Program.java
2. ReverseWord.java

Open up each class file and create the class structure. Add the standard header to the file.  The template for this header is available at: https://drive.google.com/open?id=1XLCgOqdXc9p7syhL0-VGlCc-q12actG-

**You'll have to add the proper Javadoc documentation** as well as the proper code to solve the problem. You will have to add instance variables, constants, method stubs, and code to get this class defined properly. Read the comments (and the problem) to understand what the problem is and how you will solve it.  

You will need to add test code to **Program.java** to test the **ReverseWord.java** source code. 

Once you've written your code run the code by right clicking on **Program.java** in the file explorer and selecting **Run** from the context menu or using the debug tool from the **Activity Bar**. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

## Testing Your Code

Your **Main.java** should contain code to test your **ReverseWord** object. Ask the user for a word and then output the original word and its reversed version. A sample run is shown below:

```
Input word to be reversed: catalog
Input word: catalog
Reversed word: golatac
```

## Running Unit Tests

Don't forget to run unit tests. The unit test is called **TestReverseWord.java**

**YOUR UNIT TESTS MUST PASS BEFORE SUBMITTING THE FILE OR YOU GET NOTHING (Reference to the original Charlie and the Chocolate Factory).**

## No UML Diagram for the Project

You must create a UML diagram for this project including all classes and their relationships

## Submitting Your Assignment

Follow the standard instructions for submitting a Java assignment: [How to Submit Assignments](https://canvas.sbcc.edu/courses/25771/pages/how-to-submit-assignments-new?module_item_id=761292). Once you have submitted your assignment, it is a good idea to check the branches section of GitHub a few minutes later to see if your unit tests passed on the build server (green checkmark is good, red X is bad)
