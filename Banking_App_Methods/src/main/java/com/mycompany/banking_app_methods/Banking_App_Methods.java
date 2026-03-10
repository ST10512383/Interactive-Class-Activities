package com.mycompany.banking_app_methods;

public class Banking_App_Methods 
{

    // Method: Deposit
    public static double deposit(double balance, double amount) // Set parameters
    {
        double newBalance = balance + amount;
        return newBalance;
    }
    
    // Method: Display balance(parameter but no return)
    public static void displayBalance(double balance)
    {
        System.out.println("Current Balance " + balance);
    }
    
    // Method: Withdra (method with parameters + return)
    public static double withdraw(double balance, double amount)
    {
        double newBalance = balance - amount;
        return newBalance;
    }
    
    // Method overloading - Same method name but different parameters
    public static void displayTransaction(String type, double amount)
    {
        System.out.println("Transaction: " + type + "| Amount: R " + amount);
    }
    
    // Method overloading - Same method name but with a different set of parameters & instructions
    public static void displayTransaction(String type, double amount, double balance)
    {
        System.out.println("Transaction: " + type + "| Amount: R " + amount + "| Balance: R " + balance);
    }
    
    public static void main(String[] args) 
    {
        
        // Starting balance in the account
        double balance = 500.00; // Variable to hold the balance amount
        double deposit = 200.00;
        double withdrawAmount = 150.00;
        
        // To use the method, we hate to call/invoke the method by its name
        // Syntax: method();
        displayInfo();
        
        // Call deposit method(Shares 2 pieces of information)
        balance = deposit(balance, deposit); // Pass arguements
        
        // Print balance in output
        displayBalance(balance);
        
        // Call withdraw method
        balance = withdraw(balance, withdrawAmount);
        
        // Print Balance
        displayBalance(balance);
    } // closing brace for the main method
    
    // Method with no parameters & no return
    public static void displayInfo()
    {   
        System.out.println("ABC BANK");
        System.out.println("123 Happy Place");
        System.out.println("Welcome to your app!");
    }
    
}

/*
    A method is a block of code that performs a specific task.
    Think of it like a mini-program inside your program.
 
    A method has 3 parts 
    1. Method Signature / Header - Contains info about the method
        - 4 pieces of data 
            - Access Specifier (public / private)
            - Version (static / non-Static) 
            - void / dataType of the return value being shared
            - methodName(parameterList) 
            - Parameter List: (dataType parameterName, dataType parameterName, dataType parameterName) 
    2. Method Body {}
            - contain all the code / instructions that method will complete
    3. Method Return 
            - A keyword (return) that sits within the {} & will indicate what the method is sharing / return back 
            - The datatype used for the return will match the dataType seen in the method header
*/