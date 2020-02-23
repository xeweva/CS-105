/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: TemperatureStats
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;

/**
 * tests TemperatureStats and TemperatureReading classes
 */
public class Program {

    public static void main(String[] args) {

        TemperatureStats ts = new TemperatureStats("F");
        
		ts.addTemperature(new TemperatureReading(32, TemperatureReading.FAHRENHEIT));
		ts.addTemperature(new TemperatureReading(100, TemperatureReading.CELSIUS));

        System.out.println("Stats in F:\nMax temp : " + ts.getMaximumTemperature() + ts.getScale());
        System.out.println("Min temp : " + ts.getMinimumTemperature() + ts.getScale());
        System.out.println("Avg temp : " + ts.getAverageTemperature() + ts.getScale());

        ts.setScale("C");

        System.out.println("Stats in C:\nMax temp : " + ts.getMaximumTemperature() + ts.getScale());
        System.out.println("Min temp : " + ts.getMinimumTemperature() + ts.getScale());
        System.out.println("Avg temp : " + ts.getAverageTemperature() + ts.getScale());
    }
}