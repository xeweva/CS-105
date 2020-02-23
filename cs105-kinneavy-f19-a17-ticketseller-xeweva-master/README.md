# A17 - TicketSeller

# Overview

The project name of this exercise is **TicketSeller**.

The purpose of this assignment is to learn how to work with iteration and constants. 

## Problem Description

You are to write an application to pre­sell a limited number of movie tickets. The simple user interface will be contained in ***\*Program\**.java** and the object to implement this is referred to as **TicketSeller** and consists of **only** the following public methods:

**public TicketSeller(int initialTicketAllotment)** - Specify the  total number of tickets you want to be able to sell.

**public int requestTickets(int ticketRequest)** - Allows buyer to request a specific number of tickets. 

- Returns the number of tickets remaining if the number requested is within the max allowable and does not exceed the number remaining.

- Returns the following value (when the conditions below it apply) 

  ```
  TicketSeller.TOO_MANY_TICKETS_REQUESTED
  ```

  - When the following conditions occur:
    - There are fewer remaining tickets than requested;
    - Or the number of requested exceeds **`TicketSeller.MAXIMUM_TICKETS_ALLOWED`**. 
  - Since the normal result is going to be zero or more tickets (up to the maximum allowed), use a negative number to represent a *constant* value for too many tickets requested. Note that at least one of these constants needs to be public. Which one needs to be exposed to the user of the class?

**public int getNumberOfBuyers()** - Tracks number of ticket buyers. You only count buyers who have fulfilled a request. Errors don't count.

Your **Program.java** should contain code to test your **TicketSeller** object.

**Requirements:**

- Each buyer can buy no more than as 4 tickets.
- Your requests for tickets will always be positive integers.

## Getting Started

Using the techniques shown on the instruction page [How to Start Every Java Project in this Course](https://canvas.sbcc.edu/courses/25771/modules/items/760779), create a new project from the GitHub classroom assignment.

Create the following files in the **src/main/java/edu/sbcc/cs105** folder and add the appropriately named classes to them

Open up each class file and create the class structure. Add the standard header to the file.  The template for this header is available at: https://drive.google.com/open?id=1XLCgOqdXc9p7syhL0-VGlCc-q12actG-

**You'll have to add the proper Javadoc documentation** as well as the proper code to solve the problem. You will have to add instance variables, constants, method stubs, and code to get this class defined properly. Read the comments (and the problem) to understand what the problem is and how you will solve it.  

You will need to add test code to **Program.java** to test your classes.

Once you've written your code run the code by right clicking on **Program.java** in the file explorer and selecting **Run** from the context menu or using the debug tool from the **Activity Bar**. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

## Running Unit Tests

Don't forget to run unit tests. The unit test is called **TestTicketSeller.java**

**YOUR UNIT TESTS MUST PASS BEFORE SUBMITTING THE FILE OR YOU GET NOTHING (Reference to the original Charlie and the Chocolate Factory).**

## UML Diagram for the Project

Create and submit a UML diagram for this project that contains all classes, attributes, and methods.

## Submitting Your Assignment

Follow the standard instructions for submitting a Java assignment: [How to Submit Assignments](https://canvas.sbcc.edu/courses/25771/pages/how-to-submit-assignments-new?module_item_id=761292). Once you have submitted your assignment, it is a good idea to check the branches section of GitHub a few minutes later to see if your unit tests passed on the build server (green checkmark is good, red X is bad)
