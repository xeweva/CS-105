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
 * This class tests the Multiply object.
 *
 */
public class Program {

    /**
     * This method creates a Multiply object and then uses it to multiply 2 by
     * 3. It prints out this result along with the expected result for error
     * checking.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
        Multiply multiply = new Multiply();

        int shouldBeSix = multiply.byTwo(3);

        System.out.println("Using the byTwo method, if you double 3 you should get 6 and we get "
                + shouldBeSix + ".");


        shouldBeSix = multiply.getProduct(3, 2);

        System.out.println("Using the getProduct method method, if you multiply 3 by 2, you should also " 
             + "get 6 and we get " + shouldBeSix + ". Isn't it great how consistent mathematics are?!?");

    }

}