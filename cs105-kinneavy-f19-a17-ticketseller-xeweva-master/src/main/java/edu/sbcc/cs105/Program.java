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
 * sales tickets to customers
 */
public class Program {

    public static void main(String[] args) {

        TicketSeller t = new TicketSeller(20);

        System.out.println(t.requestTickets(4));
        System.out.println(t.requestTickets(4));
        System.out.println(t.requestTickets(4));
        System.out.println(t.requestTickets(5));
        System.out.println(t.requestTickets(3));
        System.out.println(t.requestTickets(3));
        System.out.println(t.requestTickets(1));
        System.out.println(t.requestTickets(2));
        System.out.println(t.requestTickets(1));
        
        System.out.println(t.getNumberOfBuyers());

    }
}