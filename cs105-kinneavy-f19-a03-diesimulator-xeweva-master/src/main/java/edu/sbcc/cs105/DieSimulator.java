/**
 * CS 105 Theory and Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: DieSimulator
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Maxim Dokukin
 */
package edu.sbcc.cs105;

import java.util.*;

/**
 * This class simulates rolling a die by generating a random number between 1
 * and 6 inclusive.
 *
 */
public class DieSimulator {

    /**
     * Simulates the roll of a six-sided die
     * 
     * @return a random integer from 1 to 6 inclusive.
     */
    public int rollTheDie() {
        Random ran =new Random();

        int randomDieRoll = 1 + ran.nextInt(6);

        return randomDieRoll;
    }



}