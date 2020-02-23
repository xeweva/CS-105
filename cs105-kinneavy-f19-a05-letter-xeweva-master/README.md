# A05 - Letter

## Overview

You will want to complete enough of L01 - Car lab to understand how to create classes, attributes, and methods before completing the UML portion of this lab. You can do the code portion  first, though.

The project name of this exercise is **Letter**.

The purpose of this assignment is to give you some practice problem solving, writing your own classes, and running unit tests.

## Problem Description

Provide a class for authoring a simple letter.  Before starting to write the code, first ensure that you understand the anatomy of a letter.  A typical letter is divided into the following components:

**Sender** - This is the author of the letter (i.e. who is writing and sending it).

**Recipient** - This is the person to whom the letter is addressed.

**Salutation** - This is an opening greeting and precedes the body of the letter. In this case, our salutation will be: "Dear *recipient name*:" where recipient name will be replaced with an actual name

**Body** - This is the main text of the letter that exists between the salutation and the closing.

**Closing** - This formally ends a letter and is typically (and in this case) in the form of "Sincerely, *sender name*" where the sender name will be replaced with an actual name.  Also, note that there will be some blank lines between "Sincerely," and the sender name.

 This structure may seem obvious, but we are calling it out for a reason.  It provides information on what data the Letter object will need to store persistently.  This particular class follows a style we call a builder pattern in object-oriented parlance. This means that we are constructing something progressively (in this case a letter).  As we are building it, we need to maintain the individual pieces of information (i.e. sender, recipient, and body) that make up the letter. The body will get progressively built as you will see below.  When we are all done building the individual components, we can retrieve the final results (i.e. the full letter).

You need the following constructor:

```java
public Letter(String from, String to)
```

The constructor sets the name of the sender and the recipient.  These values will be stored for later use in constructing the full text of the letter.

You will also need the following two methods:

```java
public void addLine(String line)
```

This method adds *a line of text* to the *body* of the letter. This method will be called *multiple* times to build a complete letter and each invocation should *append* the line to the existing text of the body. It should **NOT** overwrite it.  It also should **ONLY** act on the body and in no way touch the other parts of the letter.

```java
public String getText()
```

This method returns the entire text of the letter. It only needs to be called *once* after we have constructed the body using multiple **addLine** calls. When getText is called, it will assemble the full letter text from the individual components (again sender, recipient, and body).  Calling getText multiple times should be **idempotent**. That means the result will always be the same and the effect of a preceding invocation will have no affect on a subsequent invocation.  To put that concretely, calling getText twice in a row (with no intervening addLine calls) will return exactly the same full letter text.

The text has the form:

Dear *recipient name*:
*blank line*
*first line of the body*
*second line of the body*
...
*last line of the body*
*blank line*
Sincerely,
*blank line*
*sender name*

You do not need any more methods in your **Letter.java**. In your **Program.java** you'll write code that calls the methods in **Letter.java**. These methods will be called to print the following letter.

Dear Person:

I am sorry we must part.
I wish you all the best.

Sincerely,

Another Person

Construct an object of the Letter class and call addLine twice.

Hints:

\1. Use the concat method to form a longer string from two shorter strings.
\2. The special string "\n" represents a new line. For example, the statement

```java
**body = body.concat("Sincerely,").concat("\n");**
```

adds a line containing the string "Sincerely," to the body. Notice that you can use the `**concat**` method multiple times to keep concatinating. Once you've got that working you can download my test (called **LetterTester.java**) and run it.

## Getting Started

Like our last exercise, we are going to do this exercise by writing the object that solves the problem first (in a source file called **Letter.java**) and then testing it using code we write into **Program.java**. Using the techniques shown on the web page titled "How to Start Every Project in this Class" create a source file called **Letter.java** as well as a file called **Program.java**.

Open up the **Letter.java** file and replace the code with the code contained in the box below:

```java
/**
 * CS 105 Theory and Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: Letter
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.sbcc.cs105;

/**
 * This class creates letters in an automated fashion.
 *
 */
public class Letter {

    /**
     * Constructor that sets the letter writer and recipient.
     * 
     * @param from
     *            Person who is writing the letter.
     * @param to
     *            Person to whom the letter is addressed.
     */
    public Letter(String from, String to) {

    }

    /**
     * Add a line of text to the body of the letter.
     * 
     * @param line
     */
    public void addLine(String line) {

    }

    /**
     * Creates a letter using the designated sender and recipient. The format of
     * the letter is:
     * 
     * Dear recipient name: blank line first line of the body second line of the
     * body ... last line of the body blank line Sincerely, blank line sender
     * name
     * 
     * @return the formatted letter.
     */
    public String getText() {

    }
}
```

You'll notice that there is only a skeleton of code. It current doesn't do anything; it won't even compile!. You will have to add i**nstance variables** (review explanation above about letter anatomy. each component will represent an instance variable) and **code** to get this class defined properly. Read the comments (and the problem) to understand what the problem is and how you will solve it.

Don't forget to go through the code and replace every instance of **[CHANGE THIS TO YOUR INFORMATION]** to the appropriate item. Be sure to replace the square brackets as well when you replace the text.

Next, using the same technique you used to create the **Letter.java** file to create another file called **Program.java**. This is where your test code will go. Replace the code in that file with the code in the grey box below:

```java
/**
 * CS 105 Theory and Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: Letter
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.sbcc.cs105;

/**
 * This class tests the Letter object.
 *
 */
public class Program {

    /**
     * Test this code by creating a letter in the form shown in the problem
     * description.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {

    }
}
```

Similar to the **Letter.java** file go through **Program.java** and change the **[CHANGE THIS TO YOUR INFORMATION]** text to the proper items. There are two items to be changed.

You will also notice that **Program.java** does not contain any code to test the **Letter.java** source code. Write some test routines based upon the problem description.

Once you've written your code, run the code by selecting the bug icon on the activity bar, creating a launch configuration if one doesn't exist already, and then running the launch configuration. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

## Adding and Running Unit Tests

Be sure to run the unit tests from the unit test runner in the activity bar (beaker icon)

**YOUR UNIT TESTS MUST PASS BEFORE SUBMITTING THE FILE OR YOU GET NOTHING (Reference to the original Charlie and the Chocolate Factory).**

## Create UML Diagram for the Project

Similar to the prior assignment, you will create a UML diagram for this project and include it in the project submission. It should be in the root folder of the project. The UML assignment package should be named A05 - Letter and the exported XMI file should be named the same as the Java project. If we used our fictional student, Inigo Montoya, the file would be named Montoya-In-Employee.xmi

## Submitting Your Assignment

Follow the standard instructions for submitting a Java assignment: [How to Submit Assignments](https://canvas.sbcc.edu/courses/25771/pages/how-to-submit-assignments-new?module_item_id=761292)







