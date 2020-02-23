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

import java.io.PrintStream;

/**
 * prints calc result
 *////
public class AlignedNumbersReport{
    
    PrintStream printStream; //
   
    StatisticsCalculator data;

    public AlignedNumbersReport(PrintStream printStream, StatisticsCalculator data){

        this.printStream  = printStream;

        this.data = data;
    } 
    
    /**
     * prints calculator data in formated way
     */
    public void print(){

        printStream.printf("Sum: %25d%nAverage: %24.2f%nDifference: %18d%nProduct: %21d%nDistance: %20d%nMaximum: %21d%nMinimum: %21d%n", 
                            data.getSum(), data.getAverage(), data.getDifference(), data.getProduct(), data.getDistance(), data.getMaximum(), data.getMinimum());
    }

}