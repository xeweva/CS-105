/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Dedup
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */


package edu.sbcc.cs105;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * reads integers from file
 * can compute how many times particular number contsins in file
 * can find unique numbers 
 */
public class Dedup {

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    /**
     * reads data from file and stores it in ArrayList numbers
     * @param filename file name
     * @throws FileNotFoundException if file was not found
     */
    public Dedup(String filename) throws FileNotFoundException{
        
        try{
            Scanner s = new Scanner(new File("/Users/xewe/Documents/CS105_filework/cs105-kinneavy-f19-a21-dedup-xeweva/" + filename));

            while(s.hasNextInt())       //reading all integers
                numbers.add(s.nextInt()); //adding integer in arraylist
            
            s.close();
            
        } catch(Exception e){

            throw e;
        }
    }

    /**
     * computes how many times number was found in the file
     * @param ofThisValue value to find how many times it was found in the file
     * @return how many times given number was found in the file
     */
    public int howMany(int ofThisValue){
        
        int wordCount = 0;

        for(int a : numbers)
            if(a == ofThisValue)
                wordCount++;

        return wordCount;
    }

    /**
     * finds all the unique numbers
     * @return ArrayList of the unique numbers in ascending order
     */
    public ArrayList<Integer> returnUnique(){

        int numCnt = numbers.size();
        int numArr[] = new int[numCnt];  

        for(int i = 0; i < numCnt; i++)        //write data from arraylist to array
            numArr[i] = numbers.get(i);

        Arrays.sort(numArr);        //sort numbers in array

        ArrayList<Integer> uniqNumbers = new ArrayList<Integer>(); //arraylist for uniq numbers

        for(int i = 0; i < numCnt; i++)         //extract uniq numbers
            if(!uniqNumbers.contains(numArr[i]))
                uniqNumbers.add(numArr[i]);

        return uniqNumbers;
    }
}
