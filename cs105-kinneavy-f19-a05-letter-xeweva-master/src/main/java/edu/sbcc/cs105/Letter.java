/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Letter
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */
package edu.sbcc.cs105;

/**
 * This class creates letters in an automated fashion.
 *
 */
public class Letter {

    /**
     * Constructor that sets the letter writer and recipient.
     * 
     * @param from
     *            Person who is writing the letter.
     * @param to
     *            Person to whom the letter is addressed.
     */

    String from = "";
    String to = "";
    String body = "";

    public Letter(String from, String to) {

        this.from = from;
        this.to = to;
    }

    /**
     * Add a line of text to the body of the letter.
     * 
     * @param line
     */
    public void addLine(String line) {

        body += line + "\n";
    }

    /**
     * Creates a letter using the designated sender and recipient. The format of
     * the letter is:
     * 
     * Dear recipient name: blank line first line of the body second line of the
     * body ... last line of the body blank line Sincerely, blank line sender
     * name
     * 
     * @return the formatted letter.
     */
    public String getText() {

        return "Dear ".concat(to).concat(":\n\n").concat(body).concat("\nSincerely,\n\n").concat(from);
    }
}