package com.st10512383.tuckshopseq;

import java.io.*;
import java.util.Scanner;

public class TuckShopSeq {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String fileName = "sales.txt"; // Text file where information will be stored

        System.out.println("----SCHOOL TUCK SHOP----");
        // PART 1: Wrtiting to a sequential file

        try { // Tries contents in score
            FileWriter fw = new FileWriter(fileName, true); // 2nd parameter APPENDS new records
            BufferedWriter bw = new BufferedWriter(fw); // BufferedWriter makes writing effecient

            System.out.print("Enter Product Name: ");
            String product = userInput.nextLine();

            System.out.println("");

            System.out.print("Enter Product Price: ");
            Double price = userInput.nextDouble();

            bw.write(product + " | " + price); // Write the record to the file
            bw.newLine(); // Each write will be on a new line
            bw.close(); // Closes the file
            System.out.println("Sale Saved Successfully");
        } catch (IOException e) { // If try fails catch the exception
            System.out.println("Error: " + e.getMessage());
        }

        // PART 2: Reading a sequential file
        System.out.println("\n===SAVED SALES===");

        try {
            FileReader fr = new FileReader(fileName); // Open the file sales.txt and read from it
            BufferedReader br = new BufferedReader(fr); // Reads one line at a time

            // Variable to hold each record from the file
            String record;
            while ((record = br.readLine()) != null) {
                // Split the record back into two variables (product & price)
                String[] details = record.split("\\|");
                String product = details[0];
                String price = details[1];

                // Display back to the output
                System.out.println("Product: " + product + " | Price: R" + price);

            }
            br.close();
        } catch (IOException e) {
            System.out.print("Error reading file");
        }
    }
}
