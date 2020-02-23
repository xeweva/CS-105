/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: InstaFilter
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;

import sbccutils.Instafilter;
/**
 * tests instafilter class
 */
public class Program {

    public static void main(String[] args) {

       Instafilter instafilter = new Instafilter();


       instafilter.addFilter(new Blur());
       instafilter.addFilter(new Sepia());
       instafilter.addFilter(new GrayScale());


        instafilter.run();
    }
}
