/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: AlignedNumbers
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */
package edu.sbcc.cs105;

import java.util.*;

public class Program {

    /**
     * Test this code by asking for two numbers, computing the various stats,
     * and then printing it out.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {

        StatisticsCalculator sc = new StatisticsCalculator();

        sc.setFirstNumber(4);
        sc.setSecondNumber(7);

        AlignedNumbersReport al = new AlignedNumbersReport(System.out, sc);

        al.print();

    }
}