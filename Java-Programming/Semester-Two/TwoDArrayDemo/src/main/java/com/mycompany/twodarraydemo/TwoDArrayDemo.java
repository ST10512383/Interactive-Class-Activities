package com.mycompany.twodarraydemo;

import javax.swing.JOptionPane; // JOptionPane import for GUI

public class TwoDArrayDemo {

    public static void main(String[] args) {
        int [][] rental = {
            {400, 800, 1000},
            {550, 950, 1100},
            {600, 1000, 1250},
            {750, 1250, 1500}
        };
        
        String userEntry; // Variable that stores user prompt
        int floors; // Stores the floor that the user chose
        int bedrooms; // Stores the bedroom choice of the user
        
        // Prompt the user to request floor & bedroom choice
        userEntry = JOptionPane.showInputDialog(null, "Enter which floor you would like to rent on (1-4): ");
        floors = Integer.parseInt(userEntry); // Convert the string input into an integer
        
        userEntry = JOptionPane.showInputDialog("How many bedrooms would you like to rent (1-3): ");
        bedrooms = Integer.parseInt(userEntry);
        
        // Access the combined Row & Column choice & display the result back
        JOptionPane.showMessageDialog(null, "The rend for a " + bedrooms + " bedrooms apartment on Floor " + floors + " is R" + rental[floors-1][bedrooms-1]);
    }
}
