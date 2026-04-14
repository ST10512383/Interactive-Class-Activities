package com.mycompany.loopappdemo;

public class LoopAppDemo {

    public static void main(String[] args) {
        // Create an object of the CookieMachine class
        CookieMachine machine = new CookieMachine();
        
        // Bake cookies using a while loop
        machine.bakeCookies();
        System.out.println("--------------------------");
        
        // Taste cookies using a do-while loop
        machine.tasteCookies();
        System.out.println("--------------------------");
        
        // Package cookies using for loop
        machine.packCookies();
    }
}
