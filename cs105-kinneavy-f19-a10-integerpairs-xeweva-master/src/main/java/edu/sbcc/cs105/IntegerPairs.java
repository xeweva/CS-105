/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: IntegerPairs
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;


public class IntegerPairs{

    String data = "";

    /**
     * set up the string to search for pairs in
     * @param str input data
     */
    public void setPairString(String str){

        data = str;
    }

    /**
     * check if there are two pairs of numbers in given string
     * @return true if there are two pairs
     */
    public boolean hasTwoPairs(){

        if(data.equals("")) //undeclared filter
            return false;

        int pairNum = 0;

        String[] numbers = data.split(" ");

        if(numbers[0].charAt(0) < 48 || numbers[0].charAt(0) > 57 || // nointeger filter
            numbers[1].charAt(0) < 48 || numbers[1].charAt(0) > 57 ||
            numbers[2].charAt(0) < 48 || numbers[2].charAt(0) > 57 ||
            numbers[3].charAt(0) < 48 || numbers[3].charAt(0) > 57)
                return false;

        if(numbers[0].equals(numbers[1]) || // comparing first to the others
            numbers[0].equals(numbers[2]) ||
            numbers[0].equals(numbers[3]))
            pairNum++;

        if(numbers[1].equals(numbers[2]) ||  // comparing second to the others
            numbers[1].equals(numbers[3]))
            pairNum++;

        if(numbers[2].equals(numbers[3]))   // comparing third to the fourth
            pairNum++;
        
        return pairNum >= 2 ? true : false;
    }
}