package com.mycompany.inheritancedemotwo;

import com.mycompany.inheritancedemotwo.interfaces.Adopt;

public class Cat extends Pet implements Adopt {
    private String color;
    
    public Cat(String name, int age, String color) {
        super.Pet(name, age);
        
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " says Meow!");
    }
    
    public void climb() {
        System.out.println(getName() + " is climbing.");
    }
    
    @Override
    public void prepareForAdoption() {
        System.out.println(getName() + " is being prepared for adoption.");
    }
}
