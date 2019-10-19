//Program Name: Unit 2 Graded Practice 2
//Date Written: 08-07-2019
//Author: Trevor Hanson
//Maintenance History: 08-07-2019
// Created original program: 08-07-2019
//Task: (Find the Smallest Value) Write an application that finds the smallest of several integers.


import java.util.Scanner;

public class Small {
    // finds the smallest integer
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int smallest = 0; // smallest number
        int number = 0; // number entered by user
        int integers; // number of integers

        System.out.print("Enter number of integers ");
        integers = input.nextInt();

        for(int counter = 1; counter <= integers; counter++)
        {
            System.out.print("Enter integer ");
            number = input.nextInt();

            if ( counter == 1 )
                smallest = number; // Determine if number entered before is smaller than next number
            else
            if ( number < smallest ) // if new number is smallest than last, that number is new smallest number
                smallest = number;
        }

        System.out.printf("Smallest Integer is %d%n", smallest);
    }
} // end class Small
