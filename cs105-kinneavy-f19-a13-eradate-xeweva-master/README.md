# A13 - EraData

# Overview

The project name of this exercise is **EraDate**.

The purpose of this assignment is to learn how to do comparisons using the if statement as well as expanding your knowledge of formatted output. Additionally, you get more practice on how to write all of your own code and Javadoc comments.

## Problem Description

In Japan, years are referred to using the [Gregorian Calendar (Links to an external site.)](https://en.wikipedia.org/wiki/Gregorian_calendar) like we do here and also by the name of the Era (called [nengou (Links to an external site.)](https://en.wikipedia.org/wiki/Japanese_era_name)). The Era is related to the reign of the emperor and to specify a year you use the Era name combined with the year when the Era started. For example, 2014 is referred to as Heisei 26 because that Emperor of  Japan's Era is called Heisei (hey-say) and it was been 26 years since the Era started.

The table below shows the last five Eras and when they started and ended*

| Era Name             | Start      | End        |
| -------------------- | ---------- | ---------- |
| Other Japanese Eras* | 498        | 01/24/1868 |
| Meiji                | 1/25/1868  | 7/30/1912  |
| Taisho               | 8/1/1912   | 12/25/1926 |
| Showa                | 12/26/1926 | 1/7/1989   |
| Heisei               | 1/8/1989   | 4/30/2019  |
| Rewei                | 5/1/2019   | present    |

\* Other Japanese eras began in 498.  We aren't including them in the program as you would have a really, really long if statement :-) 

You are to write a program that will take a date and then print out the Japanese Era name (using something like a println) or it will return a String in [ISO 8601 date format (Links to an external site.)](https://en.wikipedia.org/wiki/ISO_8601). ISO 8601 date format looks like the following:

YYYY-MM-DD

Where YYYY is the year, MM is the month, and DD is the day. Note that MM and DD **must** always have two digits and for one digit values a zero is prepended (e.g. January is 01). The complete string for an ISO 8601 formatted day of January 25, 2011 is:

2011-01-25

The class to implement this is referred to as **EraDate** and consists of the following public methods:

**public EraDate(int year, int month, int day)** - This Constructor takes a four digit year, a month (1-12), and a day (1-31).

**public String getIso8601Date()** - Returns a String corresponding to the date specified in the constructor.

**public String getJapaneseEraName()** - **Returns** the Japanese Era name according to the table shown above. The names used must match the table exactly.

Your **Program.java** should contain code to test your **EraDate** object. Be sure to test the cases where one day is one Era and the next day is another (i.e. the edge cases).

**Requirements**:

- If the EraDate class receives a date prior to the start of 498, return "Precedes known Japanese Eras"
- If the  EraDate classreceives a date between 498 (inclusive) and the start of the Meiji era exclusive, return "Other Japanese Era"
- You must use only **if** statements and compound conditional expressions to implement **getJapaneseEraName()**. You cannot use separate if/else or if/else if statements.
- Create a UML model and export the XMI per the standard course requirement

**Hints:**

- You might want to use the `GregorianCalendar` object to hold your date representation.
- The `GregorianCalendar` object uses months from 0 to 11 rather than from 1 to 12 so adjust accordingly.
- The `GregorianCalendar` object defines the fields: `Calendar.YEAR`, `Calendar.MONTH`, and `Calendar.DAY_OF_MONTH` to be used with the `get` method.
- The `GregorianCalendar` object also has a `getTimeInMillis` method that returns the number of millisecond of the object. This simplifies comparisons.
- `String.format` is a method called by specifying the class name (String) then the method name (format). It returns a custom string using the same format string as the **printf** method.

## Getting Started

Using the techniques shown on the instruction page [How to Start Every Java Project in this Course](https://canvas.sbcc.edu/courses/25771/modules/items/760779), create a new project from the GitHub classroom assignment.

Create the following files in the **src/main/java/edu/sbcc/cs105** folder and add the appropriately named classes to them

1. Program.java
2. EraDate.java

Open up each class file and create the class structure. Add the standard header to the file.  The template for this header is available at: https://drive.google.com/open?id=1XLCgOqdXc9p7syhL0-VGlCc-q12actG-

**You'll have to add the proper Javadoc documentation** as well as the proper code to solve the problem. You will have to add instance variables, constants, method stubs, and code to get this class defined properly. Read the comments (and the problem) to understand what the problem is and how you will solve it.  

You will need to add test code to **Program.java** to test the **<class-name>>.java** source code. 

Once you've written your code run the code by right clicking on **Program.java** in the file explorer and selecting **Run** from the context menu or using the debug tool from the **Activity Bar**. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

## Running Unit Tests

Don't forget to run unit tests. The unit test is called TestEmployee.java

**YOUR UNIT TESTS MUST PASS BEFORE SUBMITTING THE FILE OR YOU GET NOTHING (Reference to the original Charlie and the Chocolate Factory).**

## UML Diagram for the Project

Create an submit a UML diagram for this project which includes the EraDate and Program classes and submit an XMI file per the instructions.

## Submitting Your Assignment

Follow the standard instructions for submitting a Java assignment: [How to Submit Assignments](https://canvas.sbcc.edu/courses/25771/pages/how-to-submit-assignments-new?module_item_id=761292). Once you have submitted your assignment, it is a good idea to check the branches section of GitHub a few minutes later to see if your unit tests passed on the build server (green checkmark is good, red X is bad)
