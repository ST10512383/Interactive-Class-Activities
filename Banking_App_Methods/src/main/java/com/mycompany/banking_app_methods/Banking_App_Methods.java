package com.mycompany.banking_app_methods;

public class Banking_App_Methods {

    public static void main(String[] args) {
        
        // Starting balance in the account
        double balance = 500.00; // Variable to hold the balance amount
        
        double deposit = 200.00;
        
        double withdrawAmount = 150.00;
        
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