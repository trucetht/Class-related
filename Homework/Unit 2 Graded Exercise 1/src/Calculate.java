//Program Name: Unit 2 Graded Practice 1
//Date Written: 08-04-2019
//Author: Trevor Hanson
//Maintenance History: 08-04-2019
// Created original program: 08-04-2019
// Task: Write a Java class called Calculate that calculates and prints the sum of the integers from 1 to 10.
// Use a while statement to loop through the calculation and increment statements.
// The program should contain a comment next to each increment statement.
// The loop should terminate when the value of x becomes 11.
// The program should output the final number formatted like this:
// The sum is: (whatever the number is).

public class Calculate {
    public static void main(String[] args) {
        int sum = 0; // integer sum
        int i = 0; // integer i
        while (i <= 10) { // start with 1 and adds numbers 1-10, stops when it gets to 10

            sum = sum + i;
            i++;
        }
        System.out.println("The sum is " + sum); // system prints out the sum
    }
}// end of class Calculate
