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

import java.util.Scanner;
import java.util.ArrayList;

/**
 * tests dedup class
 */
public class Program {

    public static void main(String[] args) {

        Dedup d;
        
        try{
            Scanner s = new Scanner(System.in);
            System.out.print("Enter file name : ");
            d = new Dedup(s.nextLine());
            s.close();

            System.out.println("Number 19 found " + d.howMany(19) + " times");

            ArrayList<Integer> u = d.returnUnique();
            System.out.println("Unique numbers : ");
            for(int a : u)
                System.out.print(a + " ");
            System.out.println();
            
        } catch(Exception e){

            System.out.println("Something went wrong!\n"+ e + "\n");
        }
	}
}
