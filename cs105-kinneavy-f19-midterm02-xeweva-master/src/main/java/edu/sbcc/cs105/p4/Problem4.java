package edu.sbcc.cs105.p4;

import edu.sbcc.cs105.IProblem;

/**
 * Tests areaEstimator class
 */
public class Problem4 implements IProblem {

    public void run(){
        
        AreaEstimator aes = new AreaEstimator(new Algorithm());
        EstimationParameters ep = new EstimationParameters(6, 0, 2);

        System.out.println(aes.calculateArea(ep));
    }
}