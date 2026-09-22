package st10512383.filehandlingdemo;

// File package allows for CRUD of files
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandlingDemo {

    public static void main(String[] args) {

        // Creates a Java Object that represents student.txt
        File file = new File("student.txt");

        try {

            // Create student.txt if it does not exist
            if (file.exists()) {
                System.out.println("File already exists");
            } else {
                file.createNewFile();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (FileWriter writer = new FileWriter("student.txt", true)) {
            
            // Write strings to student.txt
            writer.write("Name: Cailen\n");
            writer.write("Course: Computer Science\n");
            writer.write("Language: Java\n");

            System.out.println("Data written to text file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
