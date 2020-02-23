/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Factors
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;

import java.util.*;

/**
 * finds all the factors of the given numer
 */
public class Factors {

    ArrayList<Integer> factorList = new ArrayList<Integer>(); //arraylist to store factors

    int factorIndex; //factor pointer for navigation in factorList

    /**
     * computes all the factor of the given number
     * @param numberToFactor number to factor
     */
    public Factors(int numberToFactor){

        int factor = 2;

        int div = numberToFactor;

        while(div / factor >= 1){

            if(div % factor == 0){

                factorList.add(factor);

                div /= factor;

                continue;
            }
            
            factor++;
        }
    }

    /**
     * checks if there are more factors to get from arraylist
     * @return true if there are more factors to get from arraylist
     */
    public boolean hasMoreFactors(){

        return factorList.size() > factorIndex ? true : false;
    }

    /**
     * returns the next factor and moves the factorPointer
     * @return the next factor
     */
    public int nextFactor(){

        return factorIndex + 1 <= factorList.size() ? factorList.get(factorIndex++) : 0;
    }

    /**
     * resets all the variables
     */
    public void reset(){

        factorIndex = 0;

        factorList.clear();
    }
}