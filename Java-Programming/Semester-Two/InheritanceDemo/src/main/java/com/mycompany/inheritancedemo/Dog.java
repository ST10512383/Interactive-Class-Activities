package com.mycompany.inheritancedemo;

public class Dog extends Pet {

    String breed;

    public Dog() {
        System.out.println("Dog created.");
    }

    public void fetch() {
        System.out.println(name + " fetched the ball!");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
