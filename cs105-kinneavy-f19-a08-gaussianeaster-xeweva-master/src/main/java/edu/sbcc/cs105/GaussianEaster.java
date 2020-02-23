/**
 * CS 105 Theory and Practice I
 * CRN: 38066
 * Assignment: GaussianEaster
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;


 public class GaussianEaster{

    private int n, p;

    public GaussianEaster(int year){

        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        /*   ORIGINAL ALGORYTM WAS
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int j = c / 4;
        int k = c % 4;
        int m = (a + 11 * h) / 319;
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;

        this.n = (h - m + r + 90) / 25;
        this.p = (h - m + r + n + 19) % 32;*/

        //WORKING ALGORYTM 
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;

        this.n = (h + l - 7 * m + 114) / 31;
        this.p = ((h + l - 7 * m + 114) % 31) + 1;
    }

    /**
     * get monht of the easter 
     * @return monht of the easter 
     */
    public int getMonth(){

        return n;
    }

    /**
     * get day of the easter
     * @return day of the easter
     */
    public int getDay(){

        return p;
    }




 }