package com.mycompany.inheritancedemo;

import java.util.Scanner;

public class InheritanceDemo {

    public static void main(String[] args) {
        System.out.println("InheritanceDemo");

        Scanner userInput = new Scanner(System.in);

        // Instantiate dog1 object from dog class
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.name = "Mia";
        d1.age = 8;

        d1.eat();
        d1.sleep();

        System.out.println("The name of Dog one is: " + d1.name);
        System.out.println("The age of Dog one is: " + d1.age);
        d1.makeSound();

        c1.name = "Gato";
        c1.age = 6;

        System.out.println("The name of Cat one is: " + c1.name);
        System.out.println("The age of Cat one is: " + c1.age);
        c1.makeSound();
    }
}
