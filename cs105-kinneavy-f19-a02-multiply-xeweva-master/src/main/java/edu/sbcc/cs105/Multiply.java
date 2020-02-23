/**
 * CS 105 Theory and Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: Multiply
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Maxim Dokukin
 */
package edu.sbcc.cs105;

/**
 * This class implements various multiplication types using a variety of methods.
 *
 */
public class Multiply {

    /**
     * Multiplies an integer input by two.
     * 
     * @param multiplicand
     *            number to be multiplied by two.
     * @return the multiplicand multiplied by two.
     */
    public int byTwo(int multiplicand) {
        return multiplicand * 2;
    }

   /**
     * Calculates and returns product of two integers.
     * 
     * @param operand1
     *            first operand.
     * @param operand2
     *            second operand.
     * @return the product of the two passed operands.
     */
    public int getProduct(int operand1, int operand2) {

        /* TODO: calculate product of operand1 and operand2        
            If you don't know what is meant by product, it means multiplication
            
            Be sure to replace <add your calculate> with VALID Java code that calculates the product of operand1 and operand2.
            The angle brackets will cause a compile error if you leave them in

            Finally, remove any instruction comments (but not the documentation outside the method)
        */

        int result = operand1 * operand2;
        return result;
    }   

}