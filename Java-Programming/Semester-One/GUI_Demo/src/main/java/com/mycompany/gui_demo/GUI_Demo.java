package com.mycompany.gui_demo;

import javax.swing.JOptionPane;

public class GUI_Demo {

    public static void main(String[] args) {
        
        // Ask for name (String)
        String name = JOptionPane.showInputDialog("Enter your name:");
        
        // Display string that was saved into the variable name
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }
}
