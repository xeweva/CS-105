/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: DocStats
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 *///


package edu.sbcc.cs105;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * analyzes document and gives statistics
 */
public class DocStats{

    File document;

    /**
     * creathes a file reference with entered name in project directory
     * @param documentName
     */
    public DocStats(String documentName){

        document = new File("/Users/xewe/Documents/CS105_filework/cs105-kinneavy-f19-a18-docstats-xeweva/" + documentName);
    }

    /**
     * count the number of character in the file
     * @return number of charecters in the file
     * @throws FileNotFoundException file name was entered wrong
     */
    public int getNumberOfCharacters() throws FileNotFoundException{

        int charC = 0;

        try{
            Scanner s = new Scanner(document);

            s.useDelimiter("");

            for(;s.hasNext(); charC++)
                s.next();            

            s.close();

        } catch(Exception e){

            System.out.println(e);
        }

        return charC;
    }

    /**
     * count the number of lines in the file
     * @return number of lines in the file
     * @throws FileNotFoundException file name was entered wrong
     */
    public int getNumberOfLines() throws FileNotFoundException{

        int lineN = 0;

        try{
            Scanner s = new Scanner(document);

            for(;s.hasNextLine(); lineN++)
                s.nextLine();

            s.close();

        } catch(Exception e){

            System.out.println(e);
        }

        return lineN;
    }

    /**
     * count the number of words in the file
     * @return number of words in the file
     * @throws FileNotFoundException file name was entered wrong
     */
    public int getNumberOfWords() throws FileNotFoundException{

        int wordC = 0;

        try{
            Scanner s = new Scanner(document);

            while(s.hasNextLine())
                wordC += s.nextLine().split(" ").length;
            
            s.close();

        } catch(Exception e){

            System.out.println(e);
        }

        return wordC;
    }

}




