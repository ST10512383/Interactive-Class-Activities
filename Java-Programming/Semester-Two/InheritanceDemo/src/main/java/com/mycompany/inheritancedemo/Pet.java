package com.mycompany.inheritancedemo;

public class Pet {

    String name;
    int age;

    public Pet() {
        System.out.println("Pet created.");
    }

    public Pet(String name) {

    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void makeSound() {
        System.out.println(name + " says");
    }
}
