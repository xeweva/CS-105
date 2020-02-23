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
 * translates resistor color code to human-friendly values
 */
public class ResistorDecoder{

    /**
     * translates resistor color code to human-friendly values
     * @param ResistorColor 4 colors on resostor
     * @return resistor niminal and tolerance
     */
    public String decodeResistor(String[] ResistorColor){

        //necessary objects
        NumberLookup digits = new NumberLookup();
        MultiplierLookup multiplier = new MultiplierLookup();
        ToleranceLookup tolerance = new ToleranceLookup();

        //stores digit resistor value
        double value = (10 * Double.parseDouble(digits.get(ResistorColor[0])) +  //first digit
                            Double.parseDouble(digits.get(ResistorColor[1]))) *  //second digit
                            multiplier.getDouble(ResistorColor[2]);              //multiplier

        String humanFriendlyValue = ""; //stores human-friendly resistance value

        //ternary used to determine if the dot is necessary
        if(value < 1000)          // 0.01 - 999 range
            humanFriendlyValue = value % 1 == 0 ? Integer.toString((int) value) : Double.toString(Math.round(value * 100.0) / 100.0); //round used to round value to 2 digits after point(for example 0.47)

        else if(value < 1000000)  //1k - 999k range 
            humanFriendlyValue = (value % 1000 == 0 ? Integer.toString((int) (value / 1000)) : Double.toString(value / 1000)) + "K";

        else                      //1M - inf range
            humanFriendlyValue = (value % 1000000 == 0 ? Integer.toString((int) (value / 1000000)) : Double.toString(value / 1000000)) + "M";
        
        return  humanFriendlyValue + "Ω, " + tolerance.get(ResistorColor[3]);
    }
}
