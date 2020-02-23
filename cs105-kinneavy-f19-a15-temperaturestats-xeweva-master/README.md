# A15 - TemperatureStats

# Overview

The project name of this exercise is **TemperatureStats**

The purpose of this assignment is to learn how to use loops to navigate collections (ArrayList) and get additional practice using multiple classes in a project as well as reinforcing the use of conditional statements. 

## Problem Description

You are writing a small program that computes various temperature stats for a series of temperature readings. After the **TemperatureStats** object has been created (instantiated), you can add any number of **TemperatureReading** objects that you'd like to it. At any time you can ask for the minimum of the temperatures, the maximum of the temperatures, and an [average (Links to an external site.)](http://math.about.com/od/glossaryofterms/g/Average-Defined.htm) of the temperatures. Note that the readings can be either in Fahrenheight (F) or Celsius (C). However, when calculating the stats, you most make sure that the calculation converts them all correctly to a canonical scale (the one currently set in TemperatureStats)

The primary class to implement this is referred to as `**TemperatureStats**``` and consists of the following public methods:

**public TemperatureStats(String defaultScale)** - Construct takes in a default scale for calculations and output, regardless of the values added for TemperatureReading. This may require some conversions during the stats calculation. Scale should be either C for Celsius or F for Fahrenheit.

**public void addTemperature(TemperatureReading t)** - Add a temperature to the statistics. This can be called as much as we'd like. Note that each reading can be a different scale (C / F) for that instance. They can be mixed.

**public void setScale(String scale)** - Changes the scale used for calculations. You can pass in either C or F. Once this value is set, all calculations (e.g. getMinimum) should return their results in that scale

**public String getScale()** - Returns the current scale used for calculations

**public void clearTemperatures()** - Removes all temperatures.

**public double getMaximumTemperature()** - Returns the maximum temperature for the inputs given (at the current scale)

**public double getMinimumTemperature()** - Returns the minimum temperature for the inputs given (at the current scale)

**public double getAverageTemperature()** - Returns the [average (Links to an external site.)](http://math.about.com/od/glossaryofterms/g/Average-Defined.htm) temperature for the inputs given (at the current scale)

You will also need a **TemperatureReading** class which has the following methods:

**public TemperatureReading(double temperature, String scale)** - Constructor to create / initialize the TemperatureReading object

**public double getTemperature(String scale)** - Returns the value of the temperature reading in the specified scale. You will need to convert the temperature to the correct scale if it is not already in the desired form.  If a bad scale (other than C or F is passed in), the method should throw an **IllegalArgumentException** (this is a built in Java Exception Type)

**TemperatureReading** should have two publicly exposed constants (public static final) called **FAHRENHEIT** and **CELSIUS**.  When passing arguments or performing comparisons of scale, you should use this constant. Example Usage:  

```
if (scale.equals(TemperatureReading.FAHRENHEIT)){ ... }
```

Your **`Program.java`** should contain code to test your **TemperatureStats** object. Load multiple values and check to make sure that the values match the expected values.

Requirement:

- You must use loops to determine the statistics [rather than doing something such as sorting the temperature array list and getting the first and list]. While our way is less efficient, our learning objective is become comfortable with loops.

## Getting Started

Using the techniques shown on the instruction page [How to Start Every Java Project in this Course](https://canvas.sbcc.edu/courses/25771/modules/items/760779), create a new project from the GitHub classroom assignment.

Create the following files in the **src/main/java/edu/sbcc/cs105** folder and add the appropriately named classes to them.

Open up each class file and create the class structure. Add the standard header to the file.  The template for this header is available at: https://drive.google.com/open?id=1XLCgOqdXc9p7syhL0-VGlCc-q12actG-

**You'll have to add the proper Javadoc documentation** as well as the proper code to solve the problem. You will have to add instance variables, constants, method stubs, and code to get this class defined properly. Read the comments (and the problem) to understand what the problem is and how you will solve it.  

You will need to add test code to **Program.java** to test your code

Once you've written your code run the code by right clicking on **Program.java** in the file explorer and selecting **Run** from the context menu or using the debug tool from the **Activity Bar**. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

## Running Unit Tests

Don't forget to run unit tests. The unit test is called **TestTemperatureStats.java**

**YOUR UNIT TESTS MUST PASS BEFORE SUBMITTING THE FILE OR YOU GET NOTHING (Reference to the original Charlie and the Chocolate Factory).**

## UML Diagram for the Project

Create a UML diagram for this project that contains all of the classes, their attributes and methods, and their relationships.  Note that the relationship between TemperatureStats and TemperatureReading is an aggregation relationship ( <> ----> )

## Submitting Your Assignment

Follow the standard instructions for submitting a Java assignment: [How to Submit Assignments](https://canvas.sbcc.edu/courses/25771/pages/how-to-submit-assignments-new?module_item_id=761292). Once you have submitted your assignment, it is a good idea to check the branches section of GitHub a few minutes later to see if your unit tests passed on the build server (green checkmark is good, red X is bad)
