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

/**
 * stores pin
 * can verify it
 * locks account if the pin was entered incorrect 3 times
 */
public class AtmPin{

    String actualPin;

    int failedAttempts = 0;

    boolean accountBlocked, lastAttemptFailed;

    public AtmPin(String actualCode){

        actualPin = actualCode;
    }

    /**
     * checks if the given pin is correct and account is not locked
     * @param code entered pin
     * @return true /false whether pin correct and account is not locked whether pin is incorrect or account is locked
     */
    public boolean verifyPinCode(String code){

        lastAttemptFailed = !(!isAccountLocked() && actualPin.equals(code) ? true : false);

        if(lastAttemptFailed)
            failedAttempts++;

        return !lastAttemptFailed;
    }

    /**
     * @return true/false whether the last attempt was approved or failed
     */
    public boolean lastAttemptFailed(){

        return lastAttemptFailed;
    }

    /**
     * @return true/false whether the account is locked/unlocked
     */
    public boolean isAccountLocked(){

        return failedAttempts > 3 ? true : false;
    }

    /**
     * resets the failedAttempt counter
     */
    public void resetFailedAttemptCounter(){

        failedAttempts = 0;
    }
}