package edu.sbcc.cs105.p4;


/**
 * estimates area of the function
 */
public class AreaEstimator{

    public Algorithm algorithm = new Algorithm();//stores function

    /**
     * class vars value assignment
     * @param algorithm
     */
    public AreaEstimator(Algorithm algorithm){

        this.algorithm = algorithm;
    }

    /**
     * calculates area with the given parameters
     * @param estimationParameters param to calculate area
     * @return area
     */
    public double calculateArea(EstimationParameters estimationParameters){
        
        int intNum = estimationParameters.getNumberOfIntervals();
        double stX = estimationParameters.getStartX();
        double step = (estimationParameters.getEndX() - stX) / intNum;
        double area = 0;

        for(int i = 0; i < intNum; i++)
            area += step * algorithm.getY(stX + step * i);

        return area;
    }
}