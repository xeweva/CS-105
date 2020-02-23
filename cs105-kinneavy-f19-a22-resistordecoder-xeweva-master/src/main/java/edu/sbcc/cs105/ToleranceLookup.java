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
 * extracts the resistor's tolerance
 */ 
public class ToleranceLookup extends LookupTable{

    @Override
    /**
    * extracts the resistor's tolerance
    */ 
    public String get(String color) {

        String tolerance = "";

        switch(color){

            case("Brown"):
                tolerance = "±1%";
                break;

            case("Red"):
                tolerance = "±2%";
                break;

            case("Yellow"):
                tolerance = "±5%";
                break;

            case("Green"):
                tolerance = "±0.5%";
                break;

            case("Blue"):
                tolerance = "±0.25%";
                break;

            case("Violet"):
                tolerance = "±0.1%";
                break;

            case("Gray"):
                tolerance = "±10%";
                break;

            case("Gold"):
                tolerance = "±5%";
                break;

            case("Silver"):
                tolerance = "±10%";
                break;            
            
            case("None"):
                tolerance = "±20%";
                break;
        }
        return tolerance;
    }

}