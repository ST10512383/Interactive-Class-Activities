package com.mycompany.resturantordersystem;

import java.util.Scanner;

public class ResturantOrderSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.println("=== Restaurant Order System ===");
 
        // Input
        System.out.print("Enter customer name: ");
        String name = input.nextLine();
 
        System.out.print("Enter order amount: ");
        int amount = input.nextInt();
 
        System.out.print("Are you a member? (true/false): ");
        boolean isMember = input.nextBoolean();
        input.nextLine();
 
        System.out.print("Enter meal type (veg/non-veg/vegan): ");
        String meal = input.nextLine();
 
        // Create object using constructor
        Order order = new Order(name, amount, isMember, meal);
 
        // Use separate service class
        KitchenService service = new KitchenService();
        service.processOrder(order);
 
        input.close();
    }
}
