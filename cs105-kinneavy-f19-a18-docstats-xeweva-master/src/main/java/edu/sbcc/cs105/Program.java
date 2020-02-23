/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: DocStats
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */


package edu.sbcc.cs105;

import java.io.*;
import java.util.*;

public class Program {
	/*
	 * Write a program that asks the user for a file name and prints the number
	 * of characters, words, and lines in that file.
	 */

	 /**
	  * tests DocStats class
	  * @param args
	  * @throws IOException file not found
	  */
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter filename: ");
		String infilename = s.next();
		s.close();
		DocStats ds = new DocStats(infilename);
		// DocStats ds = new DocStats("goblin.txt");
		System.out.printf("Number of characters: %d\n", ds.getNumberOfCharacters());
		System.out.printf("Number of words: %d\n", ds.getNumberOfWords());
		System.out.printf("Number of lines: %d\n", ds.getNumberOfLines());
	}

}
