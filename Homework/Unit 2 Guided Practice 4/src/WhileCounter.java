//Program Name: Unit 2 Guided Practice 4
//Date Written: 07-31-2019
//Author: Trevor Hanson
//Maintenance History: 07-31-2019
// Created original program: 07-31-2019

public class WhileCounter {
    public static void main(String[] args)
    {

        int counter = 1; // declare and initialize control variable

        while (counter <= 10)// loop-continuation condition
        {
            System.out.printf("%d ", counter);
            ++counter; // increment control variable
        }
        System.out.println();
    }
} // end class WhileCounter
