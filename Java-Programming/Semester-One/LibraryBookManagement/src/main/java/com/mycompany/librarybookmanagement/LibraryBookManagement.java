package com.mycompany.librarybookmanagement;

import java.util.Scanner;

public class LibraryBookManagement {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Welcome to the Library Management System");
        
        Book bookObjOne = new Book();
        
        System.out.println("\nEnter details for the new book: ");
        
        System.out.println("Enter Title: ");
        String title = userInput.nextLine();
        
        System.out.println("Enter Author: ");
        String author = userInput.nextLine();
        
        System.out.println("Enter ISBN: ");
        String isbn = userInput.nextLine();
        
        bookObjOne.setTitle(title);
        bookObjOne.setAuthor(author);
        bookObjOne.setIsbn(isbn);
        
        Book bookObjTwo = new Book("Java Programming", "Joyce Farrell", "2413579");
        
        // Display Both Objects
        System.out.println("\nDisplaying Book Records: ");
        bookObjOne.displayBook();
        bookObjTwo.displayBook();
        
        userInput.close();
        
        /*
        1. Create a book object
        2. Promp the user to provide a book title, author, ISBN
        3. Call the set method to set the book values
        4. Create book object 2 using a parameterized constructor
        5. Display both book objects
        */
    }
}
