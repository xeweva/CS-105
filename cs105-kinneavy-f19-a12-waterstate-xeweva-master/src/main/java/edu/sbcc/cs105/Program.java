/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: WaterState
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;


public class Program {

    public static void main(String[] args) {

        WaterState w = new WaterState("101C");

        System.out.println(w.getState());
    }
}