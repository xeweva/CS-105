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

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		ReverseWord r = new ReverseWord();

		System.out.print("Enter word to reverse :");

		r.setWord(s.nextLine());

		System.out.printf("Reversed %s is %s\n", r.getWord(), r.getReversedWord());
	}

}
