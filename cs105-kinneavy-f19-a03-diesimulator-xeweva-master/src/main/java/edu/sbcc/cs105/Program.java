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

/**
 * This class tests the DieSimulator object.
 *
 */
public class Program {

    /**
     * This method creates a DieSimulator object and repeatedly invokes its
     * rollTheDie method. The hope is that there are enough calls here to show
     * that the simulator works properly.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
        DieSimulator ds = new DieSimulator();

        System.out.println("    One die roll is " + ds.rollTheDie());
        
        // Add more of these until you are convinced the code works
        // correctly.
        System.out.println("Another die roll is " + ds.rollTheDie());
    }

}