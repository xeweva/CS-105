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

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Resource{

    int id;
    String name;
    ArrayList<Booking> bookings;
    int [][] resourceSchedule;

    public Resource(int id, String name, List<Booking> bookings){

        this.id = id;
        this.name = name;
        //this.bookings = bookings;
    }

    public Resource(int id, String name){

        this.id = id;
        this.name = name;
        this.bookings = new ArrayList<Booking>();
    }

    boolean cancelBooking(int bookingId, String cancelRequestBy){

        return true;
    }

    public Booking getBooking(int bookingId){

        return null;
    }

    ArrayList<Booking> getBookings(){

        return null;
    }

    public int getId(){

        return id;
    }

    public String getName(){

        return name;
    }

    public boolean isAvailable(Timeslot timeslot){

        return true;
    }

    Booking bookTimeslot(Timeslot timeslot, int bookingId, String bookingRequester){

        return null;
    }

    public void loadBooking(Timeslot timeslot, int bookingId, String bookedBy, Date bookDate){
        
        ;
    }
}