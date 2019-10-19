//Program Name: Unit 4 Graded Exercise 1
//Date Written: 08-18-2019
//Author: Trevor Hanson
//Maintenance History: 08-18-2019
// Created original program: 08-18-2019
import java.util.InputMismatchException;
import java.util.Scanner;

public class GradedExercise1 {

    // demonstrates throwing an exception when a number greater than 100 or less than 1 is inputted
    public static void main(String[] args)
    {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your age is: ");
        while(true)
        {
            try{
                age = scanner.nextInt();
                if ( age <1 || age > 100)
                    throw new InputMismatchException("You must enter a valid age.");
                break;

            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println(inputMismatchException);
                System.out.println("Invalid age, Please try again.");
                System.out.print("Please enter your age");
            }
        }
        scanner.close();
    }
}
