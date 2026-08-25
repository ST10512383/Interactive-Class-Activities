package com.mycompany.inheritancedemotwo;

import java.util.Scanner;

public class InheritanceDemoTwo {

    public static void main(String[] args) {

        Pet petOne; // Declare petOne object (empty box in memory)

        petOne = new Dog("PET001", "Mia", 8, "Dachshund"); // Instantiate petOne object (filled box in memory)

        petOne.makeSound(); // Call the overridden Dog classes makeSound method

        // Create an array op subclass objects
        Pet[] pets = new Pet[3];

        // Populate the array
        pets[0] = new Dog("PETS001", "Gindo", 6, "Husky");
        pets[1] = new Cat("PETS002", "Catto", 3, "Ginger");
        pets[2] = new Dog("PETS003", "Chokkie", 9, "Dachshund");

        for (Pet pet : pets) {
            pet.makeSound();
        }

        Dog dog = new Dog("PET002", "Buddy", 4, "Labrador");
        System.out.println(dog);

        // Method of class's equals() method
        Dog d1 = new Dog("RES001", "Kate", 5, "Doberman");
        Dog d2 = new Dog("RES001", "Kate", 5, "Doberman");
        
        System.out.println(d1.equals(d2)); // Compares object references so its false because memory block is different

        // Old code
//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("Pet Rescue System");
//
//        Dog d1 = new Dog("Mia", 8);
//        System.out.println(d1.getAge());
//
//        Dog d3 = new Dog();
//        System.out.print("Enter the dog's name >>> ");
//        String name = userInput.nextLine();
//        d3.setName(name);
//        System.out.println("The Dog's name is: " + d3.getName());
//        
//        System.out.println("Enter the dog's age >>> ");
//        int age = userInput.nextInt();
//        d3.setAge(age);
//        System.out.println("The Dog's age is: " + d3.getAge());
    }
}
