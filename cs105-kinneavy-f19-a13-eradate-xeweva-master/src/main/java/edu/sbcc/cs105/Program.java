/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: EraDate
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;


public class Program {

    public static void main(String[] args) {

        EraDate date = new EraDate(497, 12, 31);		
		System.out.println(date.getJapaneseEraName());

	
		date = new EraDate(498, 01, 01);
		System.out.println(date.getJapaneseEraName());

		date = new EraDate(1868, 01, 24);		
		System.out.println(date.getJapaneseEraName());
    }
}