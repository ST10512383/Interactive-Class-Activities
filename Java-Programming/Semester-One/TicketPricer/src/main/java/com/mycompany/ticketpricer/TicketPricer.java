package com.mycompany.ticketpricer;

// Import Scanner package
import java.util.Scanner;

public class TicketPricer {

    public static void main(String[] args) {
        
        // Instantiate new Scanner object
        Scanner userInput = new Scanner(System.in);
        
        //Ask user input
        System.out.print("What is your age: ");
        
        // Store the customers age
        int age = userInput.nextInt();
        
        // Decide the price using if else statements
        if (age < 5) { // Under the age of 12 = Free ticket
            System.out.println("Ticket is FREE!");
            
            // Ages 5 to 11 is a child
        } else if (age >= 5 && age <= 11) { // && AND operator!
            System.out.println("Ticket: R50 {Child}");
            
            // Ages 12 to 59 is an Adult
        }  else if (age >= 12 && age <= 59) {
            System.out.println("Ticket: R120 {Adult}");
            
            // Age above 59 is a Senior
        } else {
            System.out.println("Ticket: R80 {Senior}");
        }
    }
}