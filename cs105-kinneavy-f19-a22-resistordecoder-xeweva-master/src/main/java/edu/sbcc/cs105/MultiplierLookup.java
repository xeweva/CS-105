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

/**
 * class to extract the resistor's multiplier
 */
public class MultiplierLookup extends NumberLookup{

    @Override
    /**
     * extracts the resistor's multiplier
     */
    public String get(String color) {

        if(color.equals("Gold"))
            return "0.1";

        else if(color.equals("Silver"))
            return "0.01";

        else
            return Double.toString(Math.pow(10, Double.parseDouble(super.get(color))));
    }
}