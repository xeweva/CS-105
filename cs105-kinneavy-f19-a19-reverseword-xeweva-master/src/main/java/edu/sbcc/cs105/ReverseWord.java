/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: ReverseWord
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */


package edu.sbcc.cs105;

/**
 * stores a word, can reverse it
 */
public class ReverseWord {

    String word = "";

    /**
     * sets the word to reverse
     * @param word
     */
    public void setWord(String word){

        this.word = word;
    }

    /**
     * sord accessor method
     * @return
     */
    public String getWord(){

        return word;
    }

    /**
     * reverses word
     * @return reversed word
     */
    public String getReversedWord(){

        String revWord = "";

        for(int i = word.length() - 1; i >= 0; i--)
            revWord += word.charAt(i);

        return revWord;
    }
}