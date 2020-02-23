package edu.sbcc.cs105.p4;

/**
 * Parameters for area estimation
 */
public class EstimationParameters{

    int numberOfIntervals = 0;
    double startX, endX;

    /**
     * class vars value assignment
     * @param numberOfIntervals 
     * @param startX x to start 
     * @param endX x to emd
     */
    public EstimationParameters(int numberOfIntervals, double startX, double endX){

        this.numberOfIntervals = numberOfIntervals;
        this.startX = startX;
        this.endX = endX;
    }

    /**
     * accessor method for number of intervals
     * @return number of intervals
     */
    public int getNumberOfIntervals(){

        return numberOfIntervals;
    }

    /**
     * accessor method for start x
     * @return start x
     */
    public double getStartX(){

        return startX;
    }

    /**
     * accessor method for end x
     * @return end x
     */
    public double getEndX(){

        return endX;
    }
}