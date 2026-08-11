package com.mycompany.loopappdemo;

// This class represents a cookie machine in a bakery
public class CookieMachine {
    // Declare variable to store number of ingredients available
    int ingredients = 5; // Loop Control Variable
    
    // 1. While Loop: The method bakes cookies while ingredients are available
    public void bakeCookies() {
        System.out.println("Starting baking process...");
        
        while (ingredients > 0) {
            System.out.println("Baking a cookie..."); // Print a msg each time a cooking is baked
            ingredients--; // Minus the variable each time the loop runs example: ingredients = ingredients - 1;
            System.out.println("Ingredients left: " + ingredients);
        } 
        System.out.println("No more ingredients! Baking machine has stopped baking"); // When ingredients reach 0, loops stops and output is printed
    }
    
    // 2. Do-While Loop: This method tastes cookies at least once
    public void tasteCookies() {
        System.out.println("Starting tasting process...");
        int tasteCount = 1; // Counter to track the number of tastings
        // do-while runs the code first then checks the condition
        do {
            System.out.println("Taste Round: " + tasteCount);
            tasteCount++; // Increase the variable after each loop by 1
        } while (tasteCount <= 3); // Condition checked AFTER execution
        
        System.out.println("Tasting completed"); // Loop ends after tasting 3 times
    }
    
    // 3. For Loop: This method packs a fixed number of cookies
    public void packCookies() {
        System.out.println("Starting packing process...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Packing Cookie #" + i);
        }
        System.out.println("Packing completed."); // Loop ends after 5 packaged cookies
    }
}

/*
How a loop structure works
1. Loop Control Variable (LCV): Used to control the structure & iterations of the loop block
2. Test condition
3. Altering of LCV to check if you are still in the condition to run the loop code block

Declare & Initialize the LCV
Test the Condition against the LCV
Alter/Update the LCV
==========================================================================================
While Loop Syntax:
while (condition)
    {condition to repeat}
==========================================================================================
Do-While Loop Syntax:
Do {
    code
} while (condition);
Even if the condition is false it always runs once
==========================================================================================
For loop syntax:
for (initialization; condition; update) {
code
}
*/