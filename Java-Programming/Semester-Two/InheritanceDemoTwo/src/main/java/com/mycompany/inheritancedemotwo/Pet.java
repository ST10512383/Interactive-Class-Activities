package com.mycompany.inheritancedemotwo;

public abstract class Pet {

    private String rescueID;
    private String name;
    private int age;
    
    public void Pet() {
        
    }
    
    public void Pet(String resID, String name, int age) {
        this.rescueID = resID;
        this.name = name;
        setAge(age);
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
    @Override
    public String toString() { // From the Object class
        return "Pet name: " + name + ", Age: " + age;
    }
    
    @Override
    public boolean equals(Object obj) {
        
        // Check if the references point to the same object
        if (this == obj) {
            return true;
        }
        
        // Check if object is empty
        if (obj == null) {
            return false;
        }
        
        // Check if object is an instance of Pet
        if (!(obj instanceof Pet)) {
            return false;
        }
        
        Pet other = (Pet) obj;
        
        return rescueID.equals(other.rescueID);
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
    
    public String getRescueID() {
        return rescueID;
    }
}
