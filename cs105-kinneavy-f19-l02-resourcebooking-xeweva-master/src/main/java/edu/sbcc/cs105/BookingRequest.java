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

public class BookingRequest{

    int resourceId;
    Timeslot timeslot;
    String requester;

    public BookingRequest(int resourceId, Timeslot timeslot, String requester){

        this.resourceId = resourceId;
        this.timeslot = timeslot;
        this.requester = requester;
    }

    public String getRequester(){

        return requester;
    }

    public Timeslot getTimeSlot(){

        return timeslot;
    }

    public int getResourceId(){

        return resourceId;
    }
}