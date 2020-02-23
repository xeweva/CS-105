/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: L02
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;

public class Timeslot{

    public final int MINUTES_PER_TIME_BLOCK = 15;
    public final int TIME_BLOCKS_PER_HOUR = 4;

    char day;
    int duration;
    String startTime;

    public Timeslot(char day, String startTime, int duration){

        this.day = day;
        this.startTime = startTime;
        this.duration = duration;
    }

    public char getDay(){

        return day;
    }

    public int getDuration(){

        return duration;
    }

    public String getStartTime(){

        return startTime;
    }

    public int getStartHour(){

        return 1;
    }

    public int getStartMinute(){

        return 1;
    }
}