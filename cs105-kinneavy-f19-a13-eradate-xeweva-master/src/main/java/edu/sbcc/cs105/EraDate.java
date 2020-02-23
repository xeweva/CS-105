/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: EraDate
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * calculates Japancee era from the given date
 */
public class EraDate {

    GregorianCalendar calendar;

    /**
     * sets the date 
     * @param year
     * @param month
     * @param day
     */
    public EraDate(int year, int month, int day){

        calendar = new GregorianCalendar(year, month - 1, day);
    }

    /**
     * 
     * @return date in yyyy-mm-dd format
     */
    public String getIso8601Date(){
    
        return String.format("%04d-%02d-%02d", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
    }

    /**
     * computes what japanese era was in stored year
     * @return name of japanese era
     */

    public String getJapaneseEraName(){ 

        String era = "";

        if(getIso8601Date().compareTo("0498-01-01") < 0)
            era = "Precedes known Japanese Eras";

        if(getIso8601Date().compareTo("0498-01-01") >= 0 && getIso8601Date().compareTo("1868-01-24") <= 0)
            era = "Other Japanese Era";
        
        if(getIso8601Date().compareTo("1868-01-25") >= 0 && getIso8601Date().compareTo("1912-07-30") <= 0)
            era = "Meiji";
        
        if(getIso8601Date().compareTo("1912-08-01") >= 0 && getIso8601Date().compareTo("1926-12-25") <= 0)
            era = "Taisho";
        
        if(getIso8601Date().compareTo("1926-12-26") >= 0 && getIso8601Date().compareTo("1989-01-07") <= 0)
            era = "Showa";        

        if(getIso8601Date().compareTo("1989-01-08") >= 0 && getIso8601Date().compareTo("2019-04-30") <= 0)
            era = "Heisei";        

        if(getIso8601Date().compareTo("2019-05-01") >= 0)
            era = "Reiwa";

        return era;
    }


}