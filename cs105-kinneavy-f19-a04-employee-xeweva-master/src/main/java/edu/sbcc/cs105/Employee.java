/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Max Dokukin
 */
package edu.sbcc.cs105;

/**
 * This class implements an emplyee which is a person with a name and a salary.
 *
 *///////
public class Employee {

    String name;
    double salary;

    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }

    // Accessors that are obvious and have no side effects don't have to have
    // any documentation unless you are creating a library to be used by other
    // people.

    /**
     * accessor method
     * @return employee name
     */
    public String getName() {
		return name;
    }

    /**
     * accessor method
     * @return employee salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * raises employee salary by percent
     * @param byPercent percent to increase salary
     */
    public void raiseSalary(double byPercent) {
        salary *= (1 + byPercent / 100);
    }
}