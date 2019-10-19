//Program Name: Unit 1 Graded Exercise 2
//Date Written: 07-31-2019
//Author: Trevor HAnson
//Maintenance History: ?
// Created original program: 07-26-2019

import java.util.Scanner;

public class EmployeeTest{
    public static void main( String[] args ){
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        Scanner scan = new Scanner(System.in);
        String first;
        String last;
        double salary;

        System.out.println("Enter First Name of First Employee: "); // user inputs the first name of the first employee
        first=scan.next();
        employee1.setfirstName(first);

        System.out.println("Enter Last Name of First Employee: "); // user inputs the ;ast name of the first employee
        last=scan.next();
        employee1.setlastName(last);

        System.out.println( "Enter Monthly Salary of First Employee: " ); // user enters monthly salary of first employee
        salary=scan.nextDouble();
        employee1.setSalary(salary);

        System.out.println("Enter First Name of Second Employee: "); // user enters the first name of the second employee
        first=scan.next();
        employee2.setfirstName(first);

        System.out.println("Enter Last Name of Second Employee: "); // user enters the last name fo the second employee
        last=scan.next();
        employee2.setlastName(last);

        System.out.println( "Enter Monthly Salary of Second Employee: " ); // user enters the monthly salary of second employee
        salary=scan.nextDouble();
        employee2.setSalary(salary);

        System.out.println("First Employee's Full Name and Yearly Salary.\n"); // program displays the first employees first and last name as well as yearly salary
        System.out.println( employee1.getfirstName() + " " + employee1.getlastName() + "  " + employee1.getSalary() * 12 + "\n" );

        System.out.println("Second Employee's Full Name and Yearly Salary.\n"); // program displays the second employees first and last name  as well as yearly salary
        System.out.println( employee2.getfirstName() + " " + employee2.getlastName() + "  " + employee2.getSalary() * 12 + "\n" );


    } // end of class EmployeeTest
} // end of EmployeeTest.java