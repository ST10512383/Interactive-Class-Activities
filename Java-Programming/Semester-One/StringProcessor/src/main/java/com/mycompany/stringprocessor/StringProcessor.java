package com.mycompany.stringprocessor;

public class StringProcessor {
    
    // Convert input to uppercase
    public String toUppercase(String text) {
        // StringBuilder holds our result as we build it
        StringBuilder result = new StringBuilder();
        
        // Loop through every character in the input string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            // Character.toUpperCase() handles conversation for us
            result.append(Character.toUpperCase(currentChar));
        }
        
        // Convert the StringBuilder back to a regular string before returning
        return result.toString();
    }
    
    // Reverse the character in the input string
    // StringBuilder has a built in reverse () method
    public String reverse(String text) {
        
        // Step 1: Wrap the input string in a StringBuilder
        StringBuilder sb = new StringBuilder();
        
        // Step 2: Call in the reverse method(sb.reverse())
        sb.reverse();
        
        // Step 3
        return sb.toString(); // StringBuilder always needs to return toString!
    }
    
    // Count how many vowels are in the String input
    public int countVowels(String text) {
        int count = 0;
        
        // Covert to lowercase to catch both upper and lowercase
        String lowerText = text.toLowerCase();
        
        for(int i = 0; i < lowerText.length(); i++) {
            char c = lowerText.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
    
    // Report to show how many times a character appears
    public String characterFrequency(String text) {
        // Step 1: Count frequencies
        int [] frequency = new int [256];
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c]++;
        }
        
        // Step 2: Build report using StringBuilder
        
        StringBuilder report = new StringBuilder();
        
        report.append("\n--- Character Frequency Report --- \n");
        
        // Loop through all 256 possible chars
        for (int i = 0; i < frequency.length; i++) {
            
            if (frequency[i] > 0) {
                
                // Converts the index back to a char
                char character = (char) i;
                
                // Build one line
                report.append(" ");
                report.append(character);
                report.append("' ---> ");
                report.append(frequency[i]);
                report.append("\n");
            }
        }
        report.append("-------------------------------");
        
        return report.toString();
    }

    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        
        String testString = "Hello Mr. NetBeans";
        System.out.println("Original String: " + testString);
        System.out.println("UpperCase: " + processor.toUppercase(testString));
        System.out.println("Reverse: " + processor.reverse(testString));
        System.out.println("Vowel count: " + processor.countVowels(testString));
        System.out.println("Character frequency: " + processor.characterFrequency(testString));
    }
}
