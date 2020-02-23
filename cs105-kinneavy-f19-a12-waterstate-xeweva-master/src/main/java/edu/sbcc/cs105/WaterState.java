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
/**
 * Can calculate state of the water 
 */
public class WaterState {

    boolean isCelsisus;

    double waterTemperature;

    /**
     * converts water temp from String to double and sets boolean isCelsisus
     * @param temperature water temp
     */
    public WaterState(String temperature){

        int lastDigit;

        if(temperature.contains("C")){

            isCelsisus = true;
            lastDigit = temperature.indexOf("C");
        } else {

            lastDigit = temperature.indexOf("F");
        }
        
        waterTemperature = Integer.parseInt(temperature.substring(0, lastDigit));
    }

    /**
     * @return water state
     */
    public MatterState getState(){

        if(isCelsisus)
            return waterTemperature <= 0 ? MatterState.SOLID : (waterTemperature >= 100 ? MatterState.GAS : MatterState.LIQUID);
        else
            return waterTemperature < 32 ? MatterState.SOLID : (waterTemperature >= 212 ? MatterState.GAS : MatterState.LIQUID);
    }

    /**
     * @return water temperature
     */
    public String getTemperature(){

        return Double.toString(waterTemperature);

    }


}