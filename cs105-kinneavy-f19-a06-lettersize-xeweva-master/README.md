# A06 - LetterSize

# Overview

The project name of this exercise is **LetterSize**.

The purpose of this assignment is for you to write more of your own comments and to use constants in your program.

## Problem Description

Write a program that will create a LetterSize object. You specify the objects width and height in the constructor **in inches**. You can then call accessor methods that give you the width and height in millimeters. You will also write test code (in your **Program.java**) that will test the case for a letter that has the dimensions of 8.5 x 11 inches. Be sure to print it out so that there are two numbers after the decimal point for the conversions.

To solve this problem utilize the method signatures given in the UML diagram below.

![LetterSize Class Diagram Image](images\LetterSize-ClassDiagram.png))

Hints:

 - There are 25.4 millimeters per inch.
 - When using **printf**, refer to section 7.3 of the course book.

## Getting Started

Like our last exercise, we are going to do this exercise by writing the object that solves the problem first (in a source file called **LetterSize.java**) and then testing it using code we write into **Program.java**. Using the techniques shown on the instruction page 
[How to Start Every Java Project in this Course](https://canvas.sbcc.edu/courses/25771/modules/items/760779), create a new project.  Add a new file called **LetterSize.java** to the folder src/main/java/edu/sbcc/cs105.  You must select the cs105 folder and then select File >> New from the menu or use alternative methods (right-click on folder and select New File from the context menu or select the New File icon from the project bar)

Open up the **LetterSize.java** file and replace the code with the code contained in the box below:

```java
/**
 * CS 105 Theory and Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: LetterSize
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.sbcc.cs105;

/**
 * This class converts the size of letters.
 *
 */
public class LetterSize {

    //TODO: Declare required instance variables

    public LetterSize(double widthInInches, double heightInInches) {

      //TODO: Initialize object state
    }

    public double getWidthInMillimeters() {
      
    }

    public double getHeightInMillimeters() {

    }
}
```

In this case you'll notice that not only do we have a code skeleton but the methods don't have any documentation. **You'll have to add the proper Javadoc documentation** as well as the proper code to solve the problem. You will have to add instance variables, a constant, and code to get this class defined properly. Read the comments (and the problem) to understand what the problem is and how you will solve it.  Please note that the UML diagram provides some guidance such as *in which unit of measurement the height and width will be stored*. 

Next, using the same techique you used to create the **LetterSize.java** file to create another file called Program**.java**. This is where your test code will go. Replace the code in that file with the code in the grey box below:

```java
/**
 * CS 105 Theory and Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: LetterSize
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.sbcc.cs105;

/**
 * This class tests the LetterSize object.
 *
 */
public class Program {

    /**
     * Test this code by creating an 8.5 x 11 inch letter and getting the size
     * in millimeters.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {

    }
}
```

Similar to the **LetterSize.java** file go through **Program.java** and change the **[CHANGE THIS TO YOUR INFORMATION]**`` text to the proper items. There are two items to be changed.

You will also notice that **Program.java** does not contain any code to test the **LetterSize.java** source code. Write some test routines based upon the problem description.

Once you've written your code run the code by right clicking on **Program.java** in the file explorer and selecting **Run** from the context menu or using the debug tool from the **Activity Bar**. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

## Running Unit Tests

Don't forget to run unit tests. The unit test is called TestEmployee.java

**YOUR UNIT TESTS MUST PASS BEFORE SUBMITTING THE FILE OR YOU GET NOTHING (Reference to the original Charlie and the Chocolate Factory).**

## Create UML Diagram for the Project

Similar to the , you will create a UML diagram for this project and include it in the project submission. The UML assignment package should be named **A06 - LetterSize** and the exported XMI file should be named the same as the Java project. If we used our fictional student, Inigo Montoya, the file would be named **Montoya-In-LetterSize.xmi**

## Submitting Your Assignment

Follow the standard instructions for submitting a Java assignment: [How to Submit Assignments](https://canvas.sbcc.edu/courses/25771/pages/how-to-submit-assignments-new?module_item_id=761292)
