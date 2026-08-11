package com.mycompany.arrayclassdemo;

import java.util.Arrays;

public class ArrayClassDemo {

    public static void main(String[] args) {
        
        // Store five students test marks in an array
        int [] marks = {78, 56, 91, 69, 84};
        
        // Display the original grades
        System.out.println("Original Grades");
        System.out.println(Arrays.toString(marks));
        
        // Sort array in ascending order using Arrays
        Arrays.sort(marks);
        System.out.println("\nSorted Marks");
        System.out.println(Arrays.toString(marks));
        
        System.out.println("\nDescending Order");
        for(int i = marks.length -1; i >= 0; i--){
            System.out.print(marks[i] + " ");
        }
        
        // Create a copy of the sorted array
        int[] copiedArray = Arrays.copyOf(marks, marks.length); // Copies the whole array
        System.out.println("\nCopied Array (copyOf)");
        System.out.println(Arrays.toString(copiedArray));
        
        
        int[] rangedCopy = Arrays.copyOfRange(marks, 1, 3); // Copy based on the index
        System.out.println("\nRange Copy Array (copyOfRange)");
        System.out.println(Arrays.toString(rangedCopy));
        
        int[] cloneMarks = marks.clone();
        System.out.println("\nCloned Array (Clone)");
        System.out.println(Arrays.toString(cloneMarks));
        
        copiedArray[0] = 100;
        System.out.println("\nAfter changing copiedArray");
        System.out.println("Org Marks: " + Arrays.toString(marks));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
        System.out.println("Clone Array: " + Arrays.toString(cloneMarks));
    }
}
