package com.mycompany.inheritancedemotwo;

import java.util.Scanner;

public class InheritanceDemoTwo {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Pet Rescue System");

        Dog d1 = new Dog("Mia", 8);
        System.out.println(d1.getAge());

        Dog d3 = new Dog();
        System.out.print("Enter the dog's name >>> ");
        String name = userInput.nextLine();
        d3.setName(name);
    }
}
