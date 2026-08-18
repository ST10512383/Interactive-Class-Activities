package com.mycompany.inheritancedemotwo;

import com.mycompany.inheritancedemotwo.interfaces.Adoptable;

public class Dog extends Pet implements Adoptable{

    private String breed;

    public Dog(String name, int age, String breed) {
        super.Pet(name, age);
        this.breed = breed;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    @Override // Override Pet class
    public void makeSound() {
        System.out.println(getName() + "says Woof!");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }

    // Interface method
//    @Override // Override Pet class
    public void prepareForAdoption() {
        System.out.println(getName() + " is being prepared for adoption");
    }

// Old code
    //
    //    public Dog() {
    //        
    //    }
    //
    //    public Dog(String name, int age) {
    //        super.Pet(name, age);
    //    }
    //    
    //    public void makeSound() {
    //        super.makeSound();
    //    }
}
