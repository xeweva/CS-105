/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: AtmPin
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;


public class Program {

    public static void main(String[] args) {

		AtmPin a = new AtmPin("2283");

		System.out.println(a.verifyPinCode("1111"));
		System.out.println(a.lastAttemptFailed());
		System.out.println(a.isAccountLocked());
		System.out.println(a.verifyPinCode("2283"));
		System.out.println(a.lastAttemptFailed());
		System.out.println(a.isAccountLocked());
		System.out.println(a.verifyPinCode("1111"));
		System.out.println(a.lastAttemptFailed());
		System.out.println(a.isAccountLocked());
		System.out.println(a.verifyPinCode("1111"));
		System.out.println(a.lastAttemptFailed());
		System.out.println(a.isAccountLocked());
		System.out.println(a.verifyPinCode("2283"));
		System.out.println(a.lastAttemptFailed());
		System.out.println(a.isAccountLocked());
    }
}