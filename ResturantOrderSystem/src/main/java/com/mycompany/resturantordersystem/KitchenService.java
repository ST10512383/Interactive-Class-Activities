package com.mycompany.resturantordersystem;

// 2, Service Class (Separate Logic)
public class KitchenService {
    
    public void processOrder(Order order)
    {
        System.out.println("\n--- Order Processing ---");
        
        // Simple if Statement
        if(order.getAmount() > 200) {
            System.out.println("Free dessert included!");
        }
        
        // if-else
        if(order.isIsMember()) {
            System.out.println("You get a discount.");
        } else {
            System.out.println("No discount.");
        }
        
        // Decision - Compound statement (multiple conditions)
        if (order.getAmount() > 100 && order.isIsMember()) {
            System.out.println("Priority Order.");
        } else {
            System.out.println("Normal Order.");
        }
        
        // Switch
        switch (order.getMeal().toLowerCase()) {
            case "veg":
                System.out.println("Preparing vegetatian meal.");
                break;
            case "non-veg":
                System.out.println("Preparing non-vegetarian meal.");
                break;
            case "vegan":
                System.out.println("Preparing vegan meal.");
                break;
                
            default:
                System.out.println("Invalid meal type.");
        }
        
    }
}
