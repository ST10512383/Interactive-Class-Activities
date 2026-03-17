package com.mycompany.banking_app_methods;

// Import scanner package
import java.util.Scanner;

public class BankingAppMethods2 {
    
    // Instantiate Scanner and assign it to variable
    static Scanner input = new Scanner(System.in);
    
    static double balance = 2000.00;
    
    public static void main(String[] args) {

        // Instantiate BankingAppMethods2
        BankingAppMethods2 bank = new BankingAppMethods2();
        
        // Display options for the user
        System.out.println("1. Display Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        
        // Ask the user to select a choice
        System.out.print("Choose an option: ");
        int choice = input.nextInt();
        
        if (choice == 1) {
            bank.displayBalance(balance);
        }
        
        else if (choice == 2) {
            balance = bank.deposit(balance);
            System.out.println("Your new bank balance is: R"+balance);
        }
        
        else if (choice == 3){
            balance = bank.withdraw(balance);
            System.out.println("Your new bank balance is: R"+balance);
        }
        
        else {
            System.out.println("Choice not selectable option");
        }
        
        input.close();
    }
    
    // Displays the users bank balance
    public void displayBalance(double balance) {
        System.out.println("Here is your balance: R" + balance);
    }
    
    // Takes balance, adds user deposit  and returns the balance to the global balance variable
    public double deposit(double balance) {
        System.out.print("Enter the amount you would like to deposit: ");
        double deposit = input.nextDouble();
        balance = deposit + balance;
        return balance;
    }
    
    // Takes the balance, subtracts user withdrawn amount and assigns balance back to global variable
    public double withdraw(double balance){
        System.out.print("Enter the amount you would like to withdraw: ");
        double withdraw = input.nextDouble();
        balance = balance - withdraw;
        return balance;
    }
}
