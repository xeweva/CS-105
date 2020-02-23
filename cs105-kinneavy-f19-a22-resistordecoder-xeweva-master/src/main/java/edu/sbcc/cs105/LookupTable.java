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
 * abstract method declarations for further usage in subclasses
 */
public abstract class LookupTable{
    
    /**
     * abstract method for getting number, multiplier or tolerance
     * @param color to get value
     * @return value of the color (number, multiplier or tolerance)
     */
    public abstract String get(String color);
}