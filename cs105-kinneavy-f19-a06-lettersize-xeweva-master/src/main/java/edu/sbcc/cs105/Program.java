/**
 * CS 105 Theory and Practice I
 * CRN: 38066
 * Assignment: LetterSize
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */
package edu.sbcc.cs105;

/**
 * This class tests the LetterSize object.
 *
 */
public class Program {

    /**
     * Test this code by creating an 8.5 x 11 inch letter and getting the size
     * in millimeters.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {

        LetterSize ls = new LetterSize(8.5, 11);

        System.out.println(ls.getWidthInMillimeters());
        System.out.println(ls.getHeightInMillimeters());
    }
}