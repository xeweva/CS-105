/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: ResistorDecoder
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;

import java.util.*;
/**
 * extracts the resistor's digit values
 */
public class NumberLookup extends LookupTable{

    @Override
    /**
     * extracts the resistor's digit values
     * 
     * @return digit value in string
     */
    public String get(String color) {

        final String[] colors = {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Gray", "White"};

        return Integer.toString(Arrays.asList(colors).indexOf(color));
    }
    

    public double getDouble(String color){

        return Double.parseDouble(this.get(color));
    }
} 
