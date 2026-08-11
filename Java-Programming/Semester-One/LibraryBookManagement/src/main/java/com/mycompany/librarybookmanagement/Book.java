package com.mycompany.librarybookmanagement;

public class Book {
    private String title;
    private String author;
    private String isbn;
    
    // Default constructor
    public Book()
    {
        
    }
    
    // Parameterized constructor
    public Book(String title, String author, String isbn)
    {
        this.title = title; // this prevents ambiguous assignment
        this.author = author;
        this.isbn = isbn;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    
    public void displayBook()
    {
        System.out.println("\n---Display Book---");
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("ISBN of the book: " + isbn);
    }
}
