package com.mycompany.inheritancedemotwo;

public class Dog extends Pet {

    public Dog() {
        
    }

    public Dog(String name, int age) {
        super.Pet(name, age);
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }
}
