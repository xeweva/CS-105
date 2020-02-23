/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: ResistorDecoder
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;


/**
 * tests resistor decoding 
 */
public class Program {

    public static void main(String[] args) {

        ResistorDecoder r = new ResistorDecoder();

        String[] resistor0 = { "Yellow", "Violet", "Black", "Gold" };
        System.out.println("Expected output: 47Ω, ±5% Actual output: " + r.decodeResistor(resistor0));

        String[] resistor1 = { "Yellow", "Violet", "Brown", "Gold" };
        System.out.println("Expected output: 470Ω, ±5% Actual output: " + r.decodeResistor(resistor1));

        String[] resistor2 = { "Yellow", "Violet", "Red", "Gold" };
        System.out.println("Expected output: 4.7kΩ, ±5% Actual output: " + r.decodeResistor(resistor2));

        String[] resistor3 = { "Yellow", "Violet", "Orange", "Gold" };
        System.out.println("Expected output: 47kΩ, ±5% Actual output: " + r.decodeResistor(resistor3));
        
        String[] resistor4 = { "Yellow", "Violet", "Yellow", "Gold" };
        System.out.println("Expected output: 470kΩ, ±5% Actual output: " + r.decodeResistor(resistor4));
        
        String[] resistor5 = { "Yellow", "Violet", "Green", "Gold" };
        System.out.println("Expected output: 4.7MΩ, ±5% Actual output: " + r.decodeResistor(resistor5));
        
        String[] resistor6 = { "Yellow", "Violet", "Blue", "Gold" };
        System.out.println("Expected output: 47MΩ, ±5% Actual output: " + r.decodeResistor(resistor6));
        
        String[] resistor7 = { "Yellow", "Violet", "Violet", "Gold" };
        System.out.println("Expected output: 470MΩ, ±5% Actual output: " + r.decodeResistor(resistor7));
        
        String[] resistor8 = { "Yellow", "Violet", "Gray", "Gold" };
        System.out.println("Expected output: 4700MΩ, ±5% Actual output: " + r.decodeResistor(resistor8));
        
        String[] resistor9 = { "Yellow", "Violet", "White", "Gold" };
        System.out.println("Expected output: 47000MΩ, ±5% Actual output: " + r.decodeResistor(resistor9));
        
        String[] resistor10 = { "Yellow", "Violet", "Gold", "Gold" };
        System.out.println("Expected output: 4.7Ω, ±5% Actual output: " + r.decodeResistor(resistor10));
        
        String[] resistor11 = { "Yellow", "Violet", "Silver", "Gold" };
        System.out.println("Expected output: 0.47Ω, ±5% Actual output: " + r.decodeResistor(resistor11));
        
        String[] resistor12 = { "Black", "Brown", "Orange", "Gold" };        //same resistance, different colors test
        System.out.println("Expected output: 1KΩ, ±5% Actual output: " + r.decodeResistor(resistor12));

        String[] resistor13 = { "Brown", "Black", "Red", "Gold" };           //same resistance, different colors test 
        System.out.println("Expected output: 1KΩ, ±5% Actual output: " + r.decodeResistor(resistor13));
        
        String[] resistor14 = { "Black", "Brown", "Silver", "Gold" };           //same resistance, different colors test 
        System.out.println("Expected output: 0.01Ω, ±5% Actual output: " + r.decodeResistor(resistor14));
    }
}
