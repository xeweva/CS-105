# A14 - AtmPin

# Overview

The project name of this exercise is **AtmPin**.

The purpose of this assignment is to learn how to do intermediate comparisons as well as learning when to create instance variables. Additionally, you get more practice on how to write all of your own code and JavaDoc comments.

## Problem Description

You are writing a small section of an ATM machine where you accept a string that is a password and accept it or reject it. If the user tries more than three times with a bad password the card is blocked and no password will be accepted until the **resetFailedAttemptCounter** method is called. The password is provided at creation of the AtmPin. Security is a priority!

The class to implement this is referred to as **AtmPin** and consists of the following public methods:

**public AtmPin(String actualCode)** - Creates an AtmPin object with the provided code as the actual PIN

**public boolean verifyPinCode(String code)** - Accepts a string which represents the user's entry of their pin code. If the string matches the actual code provided in the constructor and the account is not blocked then the method returns true. Returns false when the code is bad OR when **isAccountLocked**() is true due to too many consecutive bad verification attempts. If an invalid code was passed or a valid code, but the account is blocked, the system will increment the number of bad password attempts. 

**public boolean lastAttemptFailed()** - Returns true if the last invocation of **verifyPinCode** was unsuccessful. Underlying state is updated every time a password is passed to **verifyPinCode**. This method DOES NOT do the verification of the code, but simply is a record of whether the last attempt was successful. Note that you can submit a good password but have it rejected by the system since the account is locked (**verifyPinCode** returns false).

**public boolean isAccountLocked()** - If *more than* three consecutive attempts are made then the password is not accepted (**verifyPinCode** returns false) until **resetFailedAttemptCounter** is called.

**public void resetFailedAttemptCounter()** - Resets the number of failed attempts to zero.

Your **Program.java** should contain code to test your **AtmPin** object. 

**Requirements:**

- You may not hard-code the pin in the AtmPin class, but must provide it as a constructor argument
- DO NOT STORE the user's code when attempting to verify
- **verifyPinCode** returns false when
  - code is bad 
  - OR 
  - when **isAccountLocked**() is true due to too many consecutive bad verification attempts
- **lastAttempt** failed should not do any comparison of actual pin to the tested pin (i.e. you cannot store the user's pin)

## Getting Started

Using the techniques shown on the instruction page [How to Start Every Java Project in this Course](https://canvas.sbcc.edu/courses/25771/modules/items/760779), create a new project from the GitHub classroom assignment.

Create the following files in the **src/main/java/edu/sbcc/cs105** folder and add the appropriately named classes to them

1. Program.java
2. AtmPin.java

Open up each class file and create the class structure. Add the standard header to the file.  The template for this header is available at: https://drive.google.com/open?id=1XLCgOqdXc9p7syhL0-VGlCc-q12actG-

**You'll have to add the proper Javadoc documentation** as well as the proper code to solve the problem. You will have to add instance variables, constants, method stubs, and code to get this class defined properly. Read the comments (and the problem) to understand what the problem is and how you will solve it.  

You will need to add test code to **Program.java** to test the **<class-name>>.java** source code. 

Once you've written your code run the code by right clicking on **Program.java** in the file explorer and selecting **Run** from the context menu or using the debug tool from the **Activity Bar**. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

## Running Unit Tests

Don't forget to run unit tests. The unit test is called TestEmployee.java

**YOUR UNIT TESTS MUST PASS BEFORE SUBMITTING THE FILE OR YOU GET NOTHING (Reference to the original Charlie and the Chocolate Factory).**

## UML Diagram for the Project

Create an submit a UML diagram for this project which includes the AtmPin and Program classes and submit an XMI file per the instructions.

## Submitting Your Assignment

Follow the standard instructions for submitting a Java assignment: [How to Submit Assignments](https://canvas.sbcc.edu/courses/25771/pages/how-to-submit-assignments-new?module_item_id=761292). Once you have submitted your assignment, it is a good idea to check the branches section of GitHub a few minutes later to see if your unit tests passed on the build server (green checkmark is good, red X is bad)
