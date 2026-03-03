package com.mycompany.constants_demo;

import java.util.Scanner;

public class Constants_Demo {

    public static void main(String[] args) {
        // Constant: A variable whose value cannot change
        // Keyword - final
        // Syntax: final dataType CONSTANT_NAME = FIXEDVALUE;
        
        // Declare a constant of type double
        final double TAX_RATE = 0.15;
        Scanner input = new Scanner(System.in);
        
        // Ask the user for input
        System.out.println("What is the Products Price?: ");
        double productPrice = input.nextDouble();
        
        // Declare a variable of type double and multiply two data types together
        double tax = productPrice * TAX_RATE;
        
        // Declare a variable of type double and sum two data types together
        double finalPrice = productPrice + tax;
        
        // Print the total amount using a declared variable
        System.out.println("Original Price: R" + productPrice);
        System.out.println("Tax Rate: " + TAX_RATE);
        System.out.println("Tax amount: R" + tax);
        System.out.println("The Total amount is: R" + finalPrice);
        
        // Close scanner
        input.close();
    }
}
