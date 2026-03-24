package com.mycompany.oopdemo2;

// Import Scanner Package
import java.util.Scanner;

public class OOPDemo2 {

    public static void main(String[] args) {
        
        // Instantiate Scanner
        Scanner userInput = new Scanner(System.in);
        
        // Ask user for their Pool Length and Width
        System.out.print("Enter the pool's length in meters: ");
        double pLength = userInput.nextDouble();
        
        System.out.print("Enter the pool's width in meters: ");
        double pWidth = userInput.nextDouble();
        
        
        // Instanciate 3 objects of the Rect class
        Rect poolOne = new Rect(); // using the default constructor
        
        Rect poolTwo = new Rect(pLength, pWidth); // Parameterized constructor with values that come from the user
        
        Rect poolThree = new Rect(30, 10); // Parameterized constructor with given values
        
        // Display the current pool dimensions for all 3 objects
        System.out.println("Customer One's pool dimentions are: " + poolOne.toString());
        System.out.println("Customer Two's pool dimentions are: " + poolTwo.toString());
        System.out.println("Customer Three's pool dimetions are: " + poolThree.toString());
        
        // Set poolOne variables
        poolOne.setLength(15);
        poolOne.setWidth(5);
        
        // Display Calculations
        System.out.print("Customer One's pool dimentions are: " + poolOne.toString());
        
        System.out.println("The Perimeter for Customer One's Pool is: " + poolOne.calcPerimeter());
        System.out.println("The Perimeter for Customer Two's Pool is: " + poolTwo.calcPerimeter());
        System.out.println("The Perimeter for Customer Three's Pool is: " + poolThree.calcPerimeter());
        
        System.out.println("The Area for Customer One's Pool is: " + poolOne.calcArea());
        System.out.println("The Area for Customer Two's Pool is: " + poolTwo.calcArea());
        System.out.println("The Area for Customer Three's Pool is: " + poolThree.calcArea());
        
        userInput.close();
    }
}
