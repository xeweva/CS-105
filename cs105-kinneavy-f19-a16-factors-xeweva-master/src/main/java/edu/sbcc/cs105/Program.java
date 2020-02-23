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

import java.util.Scanner;;

/**
 * Asks user a number and find number factors
 */
public class Program {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number to find factors : ");

        int number = s.nextInt();

        Factors f = new Factors(number);

        System.out.printf("%d factors are : ", number);

        while(f.hasMoreFactors())
            System.out.print(f.nextFactor() + "  ");

            System.out.println();
    }
}