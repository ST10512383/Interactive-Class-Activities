package com.mycompany.studentgrade;

//Import scanner package
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        
        // Ask user for input
        System.out.println("What was your grade?");
        
        // Instantiate Scanner Object
        Scanner userInput = new Scanner (System.in);
        
        // Assign user input to variable
        int score = userInput.nextInt();
        
        // Check each grade for Highest to Lowest
        if (score >= 80) {
            System.out.println("Grade: A - Distinction!");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade: B - Merit!");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade: C - Pass!");
        } else if (score >= 50 && score <= 59) {
            System.out.println("Grade: D - Borderline!");
        } else {
            System.out.println("Grade: F - Please see lecturer.");
        }
    }
}
