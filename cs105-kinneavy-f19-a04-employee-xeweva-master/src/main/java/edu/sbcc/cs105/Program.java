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
 * This class provides first level testing the Employee object.
 *
 *//////
public class Program {

    /**
     * Create an employee and test that the proper name has been created. Test
     * the initial salary amount and then give the employee a raise. Then check
     * to make sure the salary matches the raised salary.
     * 
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
        Employee e = new Employee("John", 100000);

        System.out.println(e.getName() + "'s salary is : '" + e.getSalary());

        e.raiseSalary(30);

        System.out.println(e.getName() + "'s salary after year : '" + e.getSalary());

    }
}