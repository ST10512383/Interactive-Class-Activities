package com.mycompany.resturantordersystem;

// 1. Order class (Encapsulation + Constructor)
public class Order {
    
    // Private Variables
    private String name;
    private int amount;
    private boolean isMember;
    private String meal;
    
    // Constructor
    public Order(String name, int amount, boolean isMember, String meal) {
        this.name = name;
        this.amount = amount;
        this.isMember = isMember;
        this.meal = meal;
    }
    
    // Getters
    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isIsMember() {
        return isMember;
    }

    public String getMeal() {
        return meal;
    }
}
