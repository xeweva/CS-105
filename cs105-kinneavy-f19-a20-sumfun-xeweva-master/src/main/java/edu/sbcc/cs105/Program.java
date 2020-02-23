/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: SumFun
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */


package edu.sbcc.cs105;

public class Program {

    public static void main(String[] args) {

		SumFun sf = new SumFun();

		for(int i = 0; i <= 100; i++)
			sf.addToList(i);

		System.out.printf("Sum of all odds : %d\nSum of all even : %d\nSum of odds from 0 to 10 : %d\nSumm of evens from 0 to 10 : %d\nSumm of 99 odd digits is : %d\n", 
						sf.sumOfAllOddNumbers(), sf.sumOfAllEvenNumbers(), sf.sumOfOddNumbers(0, 10), sf.sumOfEvenNumbers(0, 10), sf.sumOfOddDigitsForItem(99));
		
	}

}
