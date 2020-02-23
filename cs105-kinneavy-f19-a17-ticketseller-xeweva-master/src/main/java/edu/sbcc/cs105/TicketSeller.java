/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: TicketSeller
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;

/**
 * Sales tickets to customer if there are enought tickets and 
 * customer does not request more than the ticket limit
 */
public class TicketSeller {

    int ticketAmount = 0;

    final int MAXIMUM_TICKETS_ALLOWED = 4;

    int numberOfbuyers = 0;

    public static int TOO_MANY_TICKETS_REQUESTED = -1;

    /**
     * assigns total ticket number
     * @param initialTicketAllotment
     */
    public TicketSeller(int initialTicketAllotment){

        ticketAmount = initialTicketAllotment;
    }

    /**
     * Sells tickets if there are tickets left and if 
     * request is not bigger than limit.
     * @param ticketRequest number of tickets to sale
     * @return number of tickets remaining if tickets were sold or TOO_MANY_TICKETS_REQUESTED if tickets were not sold
     */
    public int requestTickets(int ticketRequest){

        if(ticketRequest <= MAXIMUM_TICKETS_ALLOWED && ticketAmount - ticketRequest >= 0){

            ticketAmount -= ticketRequest;

            numberOfbuyers++;

            return ticketAmount;
        }
        else    
            return TOO_MANY_TICKETS_REQUESTED;
    }

    /**
     * acsessor method for number of customers
     * @return number of successful ticket sales
     */
    public int getNumberOfBuyers(){

        return numberOfbuyers;
    }

}