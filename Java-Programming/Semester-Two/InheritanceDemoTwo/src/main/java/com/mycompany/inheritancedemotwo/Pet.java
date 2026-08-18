package com.mycompany.inheritancedemotwo;

public abstract class Pet {

    private String name;
    private int age;
    
    public void Pet() {
        
    }

    public void Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Abstract method
    public abstract void makeSound();

    // Final Method
    public final void registerPet() {
        System.out.println(name + " has been registered.");
    }

    // Overriden method
    public String toString() { // From the Object class
        return "Pet name: " + name + ", Age: " + age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
