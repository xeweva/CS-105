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

import java.util.Date;

public class Booking{

    String bookedBy;
    Date bookedOn;
    int bookingId;
    Resource resource;
    boolean isCancelled;
    Timeslot timeslot;

    Booking(int bookingId, Resource resource, Timeslot timeslot, String bookedBy, Date bookedOn){

        this.bookingId = bookingId;
        this.resource = resource;
        this.timeslot = timeslot;
        this.bookedBy = bookedBy;
        this.bookedOn = bookedOn;
    }

    public boolean isCancelled(){

        return isCancelled;
    }

    public String getBookedBy(){

        return bookedBy;
    }

    public Date getBookedOn(){

        return bookedOn;
    }

    public int getBookingId(){

        return bookingId;
    }

    public Resource getResource(){

        return resource;
    }

    boolean cancel(String cancelRequestBy){

        return true;
    }

    public Timeslot getTimeSlot(){

        return timeslot;
    }
}