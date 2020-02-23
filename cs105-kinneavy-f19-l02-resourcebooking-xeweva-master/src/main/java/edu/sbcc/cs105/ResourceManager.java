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
import java.util.HashMap; 

public class ResourceManager{

    HashMap<Integer, Resource> resourceMap = new HashMap<>();

    public ResourceManager(){

        ;
    }

    public void loadBookingData(ResourceBookingFileDataSource dataSource){

        ;
    }

    public BookingRequestResult bookResource(BookingRequest request){

        return null;
    }

    public boolean cancelBooking(int bookingId, String cancelRequestBy){

        return true;
    }

    public Resource getResourceByName(String name){

        return null;
    }

    public boolean isAvailable(int resourceId, Timeslot timeslot){

        return true;
    }
}