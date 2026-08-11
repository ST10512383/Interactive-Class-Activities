package com.mycompany.variables_demo;

// Step 1 - Import Scanner
import java.util.Scanner;

public class Variables_Demo {
    
    public static void main(String[] args) {
        String name = "Cailen";
        int age = 26;
        double height = 1.78;
        boolean isStudent = true;
        char exit = 'Y';
        
        // Step 2 - Create Scanner Object
        Scanner input = new Scanner(System.in); // System.in means keyboard input.
        System.out.println("Enter your name: "); // Prompt the user to enter their name
        name = input.nextLine();
        
        System.out.println("Enter your age: ");
        age = input.nextInt();
        
        System.out.println("Hello " + name);
        System.out.println("Next year you will be: " + (age + 1));
        input.close();
    }
}
