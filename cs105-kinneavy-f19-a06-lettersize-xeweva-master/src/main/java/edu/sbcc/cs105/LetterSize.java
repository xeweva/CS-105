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
 * This class converts the size of letters.
 *
 */
public class LetterSize {

    double inchWidth = 0;
    double inchHeight = 0;

    public LetterSize(double widthInInches, double heightInInches) {

        inchWidth = widthInInches;
        inchHeight = heightInInches;
    }

    /**
     * get letter width in millimeters
     * @return letter width in millimeters
     */
    public double getWidthInMillimeters() {
      
        return inchWidth * 25.4;
    }

    /**
     * get letter height in millimeters
     * @return letter height in millimeters
     */
    public double getHeightInMillimeters() {

        return inchHeight * 25.4;
    }
}