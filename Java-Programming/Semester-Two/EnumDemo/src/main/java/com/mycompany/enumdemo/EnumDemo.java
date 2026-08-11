/*
    enum = Enumeration
    An enum stores a fixed collection of related constants
    
    Syntax:
    accessSpecifier enum EnumName{CONSTANT, CONSTANT, CONSTANT}
 */
package com.mycompany.enumdemo;

import java.util.Scanner;

public class EnumDemo {

    // Enmu declaration
    enum PizzaSize {
        SMALL, MEDIUM, LARGE
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Pizza Size Selection");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");

        System.out.println("\nPlease choose a pizza size (1-3)");

        int choice = userInput.nextInt();

        // Create an emum object to be used with the user input
        PizzaSize size;

        // Convert the user choice into the enum value
        switch (choice) {
            case 1:
                size = PizzaSize.SMALL;
                break;
            case 2:
                size = PizzaSize.MEDIUM;
                break;
            case 3:
                size = PizzaSize.LARGE;
                break;
            default:
                System.out.println("Invalid Selection");
                return; // End the program
        }

        // Use the enum with a switch case
        switch (size) {
            case SMALL:
                System.out.println("Price: R65");
                System.out.println("Perfect size for one");
                break;
            case MEDIUM:
                System.out.println("Price R95");
                System.out.println("Ideal for two");
                break;
            case LARGE:
                System.out.println("Price: R120");
                System.out.println("Great for the whole family");
                break;
        }
        userInput.close();
    }
}
