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

import java.util.*; 

import java.lang.Double;

/**
 * Stores temperatures in array
 * Can calculate min temp, max temp, average temp
 */
public class TemperatureStats{

    String scale = "";

    ArrayList<TemperatureReading> temps = new ArrayList<TemperatureReading>();

    /**
     * sets scale
     * @param defaultScale scale to set
     */
    public TemperatureStats(String defaultScale){

        scale = defaultScale;
    }

    /**
     * adds temp in array
     * @param t temp to add
     */
    public void addTemperature(TemperatureReading t){

        temps.add(t);
    }

    /**
     * sets calculation scale
     * @param scale calculation scale
     */
    public void setScale(String scale){

        this.scale = scale;
    }

    /**
     * scale accessor method
     * @return scale
     */
    public String getScale(){

        return scale;
    }

    /**
     * clears temperature array
     */
    public void clearTemperatures(){

        temps.clear();
    }

    /**
     * calculate and returns max temp
     * @return maximum temperature
     */
    public double getMaximumTemperature(){

        double maxTemp = temps.get(0).getTemperature(scale);

        for(int i = 1; i < temps.size() - 1; i++){

            double scaledTemp = temps.get(i).getTemperature(scale);

            if(Double.compare(scaledTemp, maxTemp) > 0)
                maxTemp = scaledTemp;
        }

        return maxTemp;
    }

    /**
     * calculates and returns min temp
     * @return minimum temperature
     */
    public double getMinimumTemperature(){
        
        double minTemp = temps.get(0).getTemperature(scale);

        for(int i = 1; i < temps.size() - 1; i++){

            double scaledTemp = temps.get(i).getTemperature(scale);

            if(Double.compare(scaledTemp, minTemp) < 0)
                minTemp = scaledTemp;
        }

        return minTemp;
    }

    /**
     * calculates and returns avg temp
     * @return average temperature
     */
    public double getAverageTemperature(){
        
        double avgTemp = 0;

        for(TemperatureReading currentTemp : temps) 
            avgTemp += currentTemp.getTemperature(scale);

        avgTemp /= temps.size();

        return avgTemp;
    }
}