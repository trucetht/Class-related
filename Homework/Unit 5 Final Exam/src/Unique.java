//Program Name: Unit 5 Final Exam
//Date Written: 08-24-2019
//Author: Trevor Hanson
//Maintenance History: 08-24-2019
// Created original program: 08-24-2019
import java.util.Scanner;

//This program reads in 5 unique numbers.
public class Unique {


    public static void main (String args[]) {
        int arr[] = new int [5];
        Scanner input = new Scanner(System.in);
        int count = 0;

        while (count < arr.length) {
            System.out.println("Enter number: ");
            int temp = input.nextInt();

// Ensure the input is within the valid range
            if (temp >= 10 && temp <= 100) {
                boolean flag = false; // flag to indicate whether the number was read already.

// compare the current number with the numbers in the array
                for (int i = 0; i < count; i++) {
// if the number duplicate, set the flag
                    if (temp == arr[i]) {
                        flag = true;
                    }
                }

                if (!flag) { // add number to the array if it's not a duplicate
                    arr[count] = temp;
                    count ++;
                    System.out.print("That number was stored \n");
                }
                else {
                    System.out.println(temp + " has been entered.");
                }
            }
            else {
                System.out.println("Numbers have be between 10 and 100");
            }

// displaying all numbers currently in the array.
            System.out.println("The numbers currently in the array are:");
            for (int i = 0; i < count; i++ ) {
                System.out.print(arr[i] + " ");
            }

            System.out.println("\n");
        }
    }
}
