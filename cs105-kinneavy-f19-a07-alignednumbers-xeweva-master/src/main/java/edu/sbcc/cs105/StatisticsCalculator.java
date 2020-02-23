/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: AlignedNumbers
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */
package edu.sbcc.cs105;

/**
 * calculates a lot of things for two numbers
 */
public class StatisticsCalculator {     

    int firstNumber, secondNumber;

    /**
     * sets firts number
     * @param a
     */
    public void setFirstNumber(int a){

        firstNumber = a;
    }

    /**
     * sets second number
     * @param b
     */
    public void setSecondNumber(int b){

        secondNumber = b;
    }

    /**
     * finds the average of stored numbers
     * @return the average of stored numbers
     */
    public double getAverage(){// - The average of the two numbers

        return (firstNumber + secondNumber) / (float) 2;
    }

    /**
     * finds the difference of stored numbers
     * @return the diffeence of stored numbers
     */
    public int getDifference(){ //- The difference between the first and second number (see example output for guidance)

        return firstNumber - secondNumber;
    }

    /**
     * finds the distance between stored numbers
     * @return the distance between stored numbers
     */
    public int getDistance(){ ///- The absolute value of the difference between the first and second number

        return Math.abs(firstNumber - secondNumber);
    }

    /**
     * finds the highest of two stored numbers
     * @return highest of storen numbers
     */
    public int getMaximum(){ //- The greater of the values between the first and second number. **You may NOT use Math.max to calculate this**.

        return firstNumber > secondNumber ? firstNumber : secondNumber;
    }

    /**
     * finds the lowest of two stored numbers
     * @return lowest of storen numbers
     */
    public int getMinimum(){

        return firstNumber < secondNumber ? firstNumber : secondNumber;
    }

    /**
     * finds the sum of stored numbers
     * @return sum of stored numbers
     */
    public int getSum(){

        return firstNumber + secondNumber;
    }

    /**
     * finds the product of stored numbers
     * @return product of stored numbers
     */
    public int getProduct(){

        return firstNumber * secondNumber;
    }
}