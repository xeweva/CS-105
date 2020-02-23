# A18 - DocStats

# Overview

The project name of this exercise is **DocStats**.

The purpose of this assignment is to learn how to work with a data file and iteration. You get more practice on how to write all of your own code and Javadoc comments.

## Problem Description

You are going to write a program that gathers statistics on a text file in a way that is similar to word processors which tell you how many characters, words, and lines you have written.

![DocStats Class Diagram](D:\cs105-starters\A18 - DocStats\images\DocStats-ClassDiagram.png)

 

The UML above contains all of the public interfaces needed to implement the problem. You might need some private variables to fully implement the **`DocStats`** object.

**Requirement**: 

- You must use at least one loop to calculate document statistics.
  - Number of characters in document 
  - Number of lines in document 
  - Number of words in document
- Your `**Program**``.`**java** should contain code to test your` **DocStats**` object.
- It must run with both **seuss.txt** (provided in the starter code) and **goblin.txt** (in Canvas)
- Your code must actually count the number of characters and not "calculate" them. Scanner.nextLine method returns string without the line endings. If you simply increment the characters by one or two for each line (depending on the platform line endings), YOU NOT ACTUALLY COUNTING. You are anticipating and that is not a correct solution.

**Hints:**

- You can use two independent scanners inside of one method rather than than trying to calculate all of your stats in one pass
- Counting the number of characters can be tough. 
  - Make sure it counts the line endings, which if you just read each line as a string and count the characters, it will not include these; 
  - Be aware of platform line ending issues (i.e. does the file contain CR-LF or just LF?). Setting the useDelimiter method of the Scanner is one possible help. 
 
## Getting Started

Using the techniques shown on the instruction page [How to Start Every Java Project in this Course](https://canvas.sbcc.edu/courses/25771/modules/items/760779), create a new project from the GitHub classroom assignment.

Create the following files in the **src/main/java/edu/sbcc/cs105** folder and add the appropriately named classes to them

1. Program.java
2. DocStats.java

Open up each class file and create the class structure. Add the standard header to the file.  The template for this header is available at: https://drive.google.com/open?id=1XLCgOqdXc9p7syhL0-VGlCc-q12actG-

**You'll have to add the proper Javadoc documentation** as well as the proper code to solve the problem. You will have to add instance variables, constants, method stubs, and code to get this class defined properly. Read the comments (and the problem) to understand what the problem is and how you will solve it.  

You will need to add test code to **Program.java** to test the **DocStats.java** source code. 

Once you've written your code run the code by right clicking on **Program.java** in the file explorer and selecting **Run** from the context menu or using the debug tool from the **Activity Bar**. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

## Testing Your Code

Your ***\*Program\**.java** should contain code to test your **DocStats** object. Ask the user for the name of a file (using a scanner) and outputs the statistics. A sample run is shown below:

```
Enter filename: goblin.txt
Number of characters: 1450 (expected 1450)
Number of words: 257 (expected 257)
Number of lines: 49 (expected 49)
```

To use the file **goblin.txt** download it from the learning management system. It should be located immediately below this assignment.

## Running Unit Tests

Don't forget to run unit tests. The unit test is called TestDocStats.java

**YOUR UNIT TESTS MUST PASS BEFORE SUBMITTING THE FILE OR YOU GET NOTHING (Reference to the original Charlie and the Chocolate Factory).**

## No UML Diagram for the Project

No UML diagram is required for this project as one has been provided for you.

## Submitting Your Assignment

Follow the standard instructions for submitting a Java assignment: [How to Submit Assignments](https://canvas.sbcc.edu/courses/25771/pages/how-to-submit-assignments-new?module_item_id=761292). Once you have submitted your assignment, it is a good idea to check the branches section of GitHub a few minutes later to see if your unit tests passed on the build server (green checkmark is good, red X is bad)
