/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: intersign
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */


package edu.sbcc.cs105;


public class IntegerSign{


    private int signedInteger = 0;

    public IntegerSign(int numberToStore){

        signedInteger = numberToStore;
    }   

    /**
     * returns true if number is < 0
     * @return true if number is negative, false if number is positive
     */
    public boolean isNegative(){

        return signedInteger < 0 ? true : false; 
    }

    /**
     * returns true if number is >= 0
     * @return true if number is positive, false if number is negative
     */
    public boolean isPositive(){

        return signedInteger >= 0 ? true : false; 
    }

    /**
     * returns true if number is 0
     * @return true if number is zero
     */
    public boolean isZero(){

        return signedInteger == 0 ? true : false; 
    }
 } 