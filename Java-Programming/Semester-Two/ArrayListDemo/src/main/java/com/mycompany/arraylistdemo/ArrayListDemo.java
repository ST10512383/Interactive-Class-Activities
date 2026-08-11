package com.mycompany.arraylistdemo;

import java.util.ArrayList; // Import ArrayList Class
import java.util.Collections; // Import Collections Class

public class ArrayListDemo {

    public static void main(String[] args) {
        // Syntax: ArrayList<Type> arrayListName = new ArrayList();
        ArrayList<String> names = new ArrayList<>();
        
        // arrayName[index] = element; Used to fill the array with data
        // Add in elements to the ArrayList: arrayListName.add(element);
        names.add("Kayla"); // subscript[0]
        names.add("Bob"); // subscript[1]
        names.add("Richie"); // subscript[2]
        names.add("Alex"); // subscript[3]
        
        System.out.println("Initial List of names: " + names);
        
        names.add(1, "Josh");
        System.out.println("Updated List of names: " + names);
        
        // Retrieve an item at an index
        System.out.println("Element at index 3: " + names.get(3));
        
        // Sort an ArrayList in alphabetical order
        Collections.sort(names);
        System.out.println("\nSorted Array List in alphabetcal order");
        System.out.println(names);
        
        // Set a new element in ArrayList
        names.set(4, "Sasha");
        System.out.println("After using set: " + names);
        
        // Remove element from ArrayList
        names.remove("Bob");
        System.out.println("After using remove: " + names);
        
        // Boolean ArrayList: Store only true & false values
        ArrayList<Boolean> attendance = new ArrayList<>();
        attendance.add(true);
        attendance.add(true);
        attendance.add(false);
        attendance.add(true);
        attendance.add(true);
        attendance.add(false);
        attendance.add(false);
        attendance.add(true);
        System.out.println("Attendance List: " + attendance);
        System.out.println("Is student 2 present?: " + attendance.get(2));
    }
}
