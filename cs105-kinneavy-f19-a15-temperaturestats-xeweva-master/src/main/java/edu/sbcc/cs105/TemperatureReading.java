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
 * Stores temperature
 */
public class TemperatureReading{
    
    double temperature;

    String scale = "";

    public static final String FAHRENHEIT = "F";
    public static final String CELSIUS = "C";

    /**
     * sets class private vars
     * @param temperature temp value
     * @param scale temp scale ("F" or "C")
     */
    public TemperatureReading(double temperature, String scale){

        this.temperature = temperature;
        this.scale = scale;
    }    
    
    /**
     * returns temperature in given scale
     * @param scale scale to calculate temp
     * @return temp in given scale
     * @throws IllegalArgumentException if given scale is not "F" or "C"
     */
    public double getTemperature(String scale)throws IllegalArgumentException{

        if(scale.equals(FAHRENHEIT))
            return this.scale.equals(FAHRENHEIT) ? temperature : (temperature * 9/5) + 32;

        else if(scale.equals(CELSIUS))
            return this.scale.equals(CELSIUS) ? temperature : (temperature - 32) * 5/9;
            
        else
            throw new IllegalArgumentException("Wrong Scale!");
    }
}