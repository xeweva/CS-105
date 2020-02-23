/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Letter
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */
package edu.sbcc.cs105;

/**
 * This class tests the Letter object.
 *
 */
public class Program {

    /**
     * Test this code by creating a letter in the form shown in the problem
     * description.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
        Letter l = new Letter("Max", "Alisa");

        //l.addLine("line 1");
        //l.addLine("line 2");

        System.out.println(l.getText());

    }
}