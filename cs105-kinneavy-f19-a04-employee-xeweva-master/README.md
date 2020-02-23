# A04 - Employee

# Overview

You will want to complete enough of L02 - PhoneBill lab to understand how to create classes, attributes, and methods before completing the UML portion of this lab. You can do the code portion  first, though.

The project name of this exercise is **Employee**.

The purpose of this assignment is to give you some practice problem solving, writing your own classes, and running unit tests.

# Problem Description

Implement a class **Employee** and test it in your **Program****.java**. An employee has a name (a String) and a salary (a double). Your Employee class must follow the provided specification below:

**A constructor with two explicit arguments:**

`public Employee(String employeeName, double currentSalary)` - Constructor. The constructor will initialize instance variables of the same name as provided parameters. That is, it will assign the values from the parameters to the instance variables.

**Method Declarations / Class Interface**

`**public String getName()` - Returns the name of the employee from the instance variable **employeeName**

`public double getSalary()` - Returns the current salary. It gets this value from an instance variable named **currentSalary**

`public void raiseSalary(double byPercent)` - Gives the employee a raise according to the explicit argument **byPercent**. This method will modify the value of the **currentSalary** instance variable

**Sample Usage (paste this inside your main() method of Program.Java):**

```java
Employee harry = new Employee("Harry", 10000);
harry.raiseSalary(10); // Harry gets a 10% raise.
double harrysSalary = harry.getSalary();
```

# Getting Started

We are going to do this exercise by writing the object that solves the problem first (in a source file called **Employee.java**) and then testing it using code we write into **Program.java**. Using the techniques shown on the web page titled "How to Start Every Project in this Class" create a source file called **Employee.java** as well as a file called **Program.java**.

Open up the **Employee.java** file and replace the code with the code contained in the box below:

```java
/**
 * CS 105 Theory and Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.sbcc.cs105;

/**
 * This class implements an emplyee which is a person with a name and a salary.
 *
 */
public class Employee {

    /**
     * Constructor that creates a new Employee with an initial name and salary.
     * 
     */
    public Employee(String employeeName, double currentSalary) {
		// TODO: Initialize instance variables from constructor (ctor) parameters
    }

    // Accessors that are obvious and have no side effects don't have to have
    // any documentation unless you are creating a library to be used by other
    // people.
    public String getName() {
		// TODO: Return the name of the employee;
    }

    public double getSalary() {
		// TODO: Return the current salary of the employee
    }

    /**
     * Raise the salary by the amount specified by the explicit argument.
     * 
     */
    public void raiseSalary(double byPercent) {
		// TODO: Calculate the new salary by increasing it by the percent passed in as a method argument
    }
}
```

You'll notice that there is only a skelton of code. It current doesn't do anything. You will have to add instance variables and code to get this class defined properly. Read the comments (and the problem) to understand what the problem is and how you will solve it.

Don't forget to through the code and replace every instance of **[CHANGE THIS TO YOUR INFORMATION]** to the appropriate item. Be sure that the square brackets are included when you replace the text.

Next, using the same technique you used to create the **Employee.java** file to create another file called **Program.java**. This is where your test code will go. Replace the code in that file with the code in the grey box below:

```java
/**
 * CS 105 Theory and Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.sbcc.cs105;

/**
 * This class provides first level testing the Employee object.
 *
 */
public class Program {

    /**
     * Create an employee and test that the proper name has been created. Test
     * the initial salary amount and then give the employee a raise. Then check
     * to make sure the salary matches the raised salary.
     * 
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
		// TODO: Paste code in here from the sample usage section. Feel free to adjust things like the salary and percent raised
    }
}
```

Similar to the **Employee.java** file go through **Program.java** and change the **[CHANGE THIS TO YOUR INFORMATION]** text to the proper items. There are two items to be changed.

You will also notice that **Program.java** does not contain any code to test the **Employee.java** source code. Write some test routines based upon the problem description. There are a couple of lines of code you can use at a starting point.

Once you've written your code run the code by single clicking on **Program.java** in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

## Running Unit Tests

Don't forget to run unit tests. The unit test is called TestEmployee.java

**YOUR UNIT TESTS MUST PASS BEFORE SUBMITTING THE FILE OR YOU GET NOTHING (Reference to the original Charlie and the Chocolate Factory).**

## Create UML Diagram for the Project

Similar to the , you will create a UML diagram for this project and include it in the project submission. The UML assignment package should be named A04 - Employee and the exported XMI file should be named the same as the Java project. If we used our fictional student, Inigo Montoya, the file would be named Montoya-In-Employee.xmi

## Submitting Your Assignment

Follow the standard instructions for submitting a Java assignment: [How to Submit Assignments](https://canvas.sbcc.edu/courses/25771/pages/how-to-submit-assignments-new?module_item_id=761292)
