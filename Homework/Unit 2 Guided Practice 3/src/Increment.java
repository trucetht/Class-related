//Program Name: Unit 2 Guided Practice 3
//Date Written: 07-31-2019
//Author: Trevor Hanson
//Maintenance History: 07-31-2019
// Created original program: 07-31-2019

public class Increment {
    public static void main(String[] args)
    {
        // demonstrate postfix increment operator
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c); //prints 5
        System.out.printf("    postincrementing c: %d%n", c++); // prints 5
        System.out.printf("  c after postincrement: %d%n", c) ; // prints 6

        System.out.println(); // skip an line

        // demonstrate prefix increment operator
        c = 5;
        System.out.printf("c before preincrement: %d%n", c); //prints 5
        System.out.printf("    preincrementing c: %d%n", ++c); // prints 6
        System.out.printf("  c after preincrement: %d%n", c) ; // prints 6
    }
} // end class Increment
