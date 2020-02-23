/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Grade
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */

package edu.sbcc.cs105;

/**
 * can calculate GPA from letter grade
 */
public class Grade{

    String grade = "";

    public Grade(String grade){

        this.grade = grade;
    }

    /**
     * @return letter grade
     */
    public String getLetterGrade(){

        return grade;
    }

    /**
     * calculates GPA of stored letter grade
     * @return GPA
     */
    public double getNumericGrade(){

        double gpa = grade.charAt(0) == 'F' ? 0 : 4 - (grade.charAt(0) - 65);      

        if(grade.contains("-") && gpa != 0)
            gpa -= 0.3;        
        if(grade.contains("+") && gpa != 0 && gpa != 4)
                gpa += 0.3;

        return gpa;      
    }
}