/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: SumFun
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;

import java.util.*;

public class SumFun {

    ArrayList<Integer> values = new ArrayList<Integer>();

    /**
     * adds integer in array
     */
    public void addToList(int i){

        values.add(i);
    }

    /**
     * @return sum of all even numbers in array
     */
    public int sumOfAllEvenNumbers(){

        int sum = 0;

        for(int a : values)
            if(a % 2 == 0)
                sum += a;
        
        return sum;
    }

    /**
     * @param start start index
     * @param end end index
     * @return sum of even numbers from start index to end index
     */
    public int sumOfEvenNumbers(int start, int end){

        int sum = 0;

        for(int i = start; i <= end; i++)
            if(values.get(i) % 2 == 0)
                sum += values.get(i);
        
        return sum;
    }

    /**
     * @return sum of all odd numbers in array
     */
    public int sumOfAllOddNumbers(){

        int sum = 0;

        for(int a : values)
            if(a % 2 == 1)
                sum += a;
    
        return sum;
    }

    /**
     * @param start start index
     * @param end end index
     * @return sum of odd numbers from start index to end index
     */
    public int sumOfOddNumbers(int start, int end){

        int sum = 0;

        for(int i = start; i <= end; i++)
            if(values.get(i) % 2 == 1)
                sum += values.get(i);
        
        return sum;
    }

    /**
     * calculates the sum of the odd digits of number at the given index
     * @param itemIndex number's index
     * @return sum of all odd number's digits
     */
    public int sumOfOddDigitsForItem(int itemIndex){

        String number = Integer.toString(values.get(itemIndex));
        int sum = 0;

        for(int i = 0; i < number.length(); i++){

            int digit = number.charAt(i) - 48;

            if(digit % 2 == 1)
                sum += digit;
        }
        return sum;
    }
}