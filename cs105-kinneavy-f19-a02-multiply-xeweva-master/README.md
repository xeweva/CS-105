# A02 - Multiply

## Pre-requisites
Ensure you have completed the [tutorials](https://canvas.sbcc.edu/courses/25771/pages/tutorials?module_item_id=743777) on command line (if you are unfamiliar), git/github, and Visual Studio Code.  You will find it easier to understand if you do.

## Overview

The project name of this exercise is Multiply.

The purpose of this assignment is to show you where to write your unit tests and how to run my unit test.

Start this exercise using the technique on the web page titled "How to Start Every Project in this Class" for either Eclipse or VSCode. When complete you should have a Program.java file ready for you to fill with code. Replace all of the code present with the code contained in the box below:

Adding and Running Java Code
Once you have followed the instructions shown on the "How to Start Every Project in this Class" web page you should have a file called Program.java. Replace all of the code present in that file with the code shown below.

Note that all assignments must run successfully by the automated tester.  When you submit, you will receive feedback within a few minutes. Even if the code works on your machine, if it does not pass the automated grader, then you will NOT receive points for the assignment. You can resubmit until the due date. After that, you will either use up your late bank points or have the assignment reduced if you have exhausted your late bank.


```Java
/**
 * CS 105 Theory and Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: Multiply
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.sbcc.cs105;

/**
 * This class tests the Multiply object.
 *
 */
public class Program {

    /**
     * This method creates a Multiply object and then uses it to multiply 2 by
     * 3. It prints out this result along with the expected result for error
     * checking.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
        Multiply multiply = new Multiply();

        int shouldBeSix = multiply.byTwo(3);

        System.out.println("Using the byTwo method, if you double 3 you should get 6 and we get "
                + shouldBeSix + ".");


        shouldBeSix = multiply.getProduct(3, 2);

        System.out.println("Using the getProduct method method, if you multiply 3 by 2, you should also " 
             + "get 6 and we get " + shouldBeSix + ". Isn't it great how consistent mathematics are?!?");

    }

}
```

You can simply copy the code from the box and paste it into the Program.java file. Go through the code and replace every instance of [CHANGE THIS TO YOUR INFORMATION] to the appropriate information. Be sure that the square brackets are removed when replace the text. There are two items that need to be changed.

Next, Create another file called Multiply.java in the SAME folder as Program.java. Replace the code in that file with the code in the box below. This one is a little tougher because you have to edit the calculation in getProduct to return the product of the two passed operands. You should be able to figure this out from the completed method

```Java
/**
 * CS 105 Theory and Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: Multiply
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.sbcc.cs105;

/**
 * This class implements various multiplication types using a variety of methods.
 *
 */
public class Multiply {

    /**
     * Multiplies an integer input by two.
     * 
     * @param multiplicand
     *            number to be multiplied by two.
     * @return the multiplicand multiplied by two.
     */
    public int byTwo(int multiplicand) {
        return multiplicand * 2;
    }

   /**
     * Calculates and returns product of two integers.
     * 
     * @param operand1
     *            first operand.
     * @param operand2
     *            second operand.
     * @return the product of the two passed operands.
     */
    public int getProduct(int operand1, int operand2) {

        /* TODO: calculate product of operand1 and operand2        
            If you don't know what is meant by product, it means multiplication
            
            Be sure to replace <add your calculate> with VALID Java code that calculates the product of operand1 and operand2.
            The angle brackets will cause a compile error if you leave them in

            Finally, remove any instruction comments (but not the documentation outside the method)
        */

        int result = <add your calculation>
        return result;
    }   

}

```

Similar to the Program.java file go through Multiply.java and change the [CHANGE THIS TO YOUR INFORMATION] text to the proper items. There are two items to be changed. Run the code by single clicking on Program.java in the package explorer and selecting Run->Run from the menu. You should really memorize the keyboard shortcut since you'll be doing this a lot in this class!

What you've done is create an object that solves a particular problem and then tested it with the code that was found in Program.java. You also properly documented the code using JavaDocs (okay, I provided this for you, but you are learning what they are). This is a very typical structure for exercises in this class. You will be given a problem which you will solve using one or more objects that you write. In this case there was only one object which was specified by the Multiply.java class. The test code was found in Program.java and this code created a Multiply object and then used it. It predicted the output and then showed that the output matched the input.


## Run Unit Tests

In the Visual Studio Code Activity Bar (docked on the left edge of the applicatoin), select the Beaker icon (Unit Tests). To run the unit test, select the item that starts with the word Test (in this case TestMultiply) and click the run button.  If it succeeds, you should see an All and a green Passed status indicator with the number of tests in each. Hopefully, the number passed equals the total number.  If something fails, you'll see a red Failed status indicator. To see what went wrong, expand the Test method

**Unit Test Runner**

![run unit tests](images/RunUnitTest.png?raw=true)

**Failed Test Run**

![failed test run summary](images/FailedUnitTestRun.png)

**Failed Test Run Details**

![failed test run details](images/FailedUnitTestRunDetail.png)

**Successful Test Run** 

![successful unit test run](/images/SuccessfulTestRun.png)

## How to turn in this exercise ##
Follow the instructions in Canvas on "How to Submit Assignments"
