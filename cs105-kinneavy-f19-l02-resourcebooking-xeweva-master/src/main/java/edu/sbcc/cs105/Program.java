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

public class Program {

    public static void main(String[] args) {
        
        ResourceManager resMgr = new ResourceManager();

        // Load some existing data - we'll do a file, but could be from a database.
        ResourceBookingFileDataSource dataSource = new ResourceBookingFileDataSource("BookingData.csv");
        resMgr.loadBookingData(dataSource);


        // Make a booking request for Monday at 10am for 30 minutes
        Timeslot timeslot = new Timeslot('M', "10:00", 30);
        String bookedBy = "James";
        BookingRequest request = new BookingRequest(1, timeslot, bookedBy);

        BookingRequestResult result = resMgr.bookResource(request);
        int bookingId = result.getBooking().getBookingId();
        if (result.isBooked()){
            System.out.printf("Your booking request was successfully created. Your booking ID is %d%n", bookingId);
        } else{
            System.out.println("Your booking request was not available.");			
        }

        String cancelBy = "Joe";
        boolean isCancelled = resMgr.cancelBooking(bookingId, cancelBy);
        if (!isCancelled){
            System.out.printf("Cancel booking failed as resource was booked by %s, not %s%n", result.getBooking().getBookedBy(), cancelBy);

            System.out.printf("Now attempting to cancel by %s%n", bookedBy);
            isCancelled = resMgr.cancelBooking(bookingId, bookedBy);
            System.out.printf("Cancellation was %s%n", isCancelled ? "succesful" : "not successful");
            System.out.println(".");
        } else{
            System.out.printf("Booking cancelled by %s", bookedBy);
        }
    }
}
