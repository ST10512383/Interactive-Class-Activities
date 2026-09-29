package st10512383.niodemo;

import java.nio.file.*;
import java.io.IOException;

public class NIODemo {

    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("my_file.txt"); // Defines the file path

            // Creates file
            createFile(filePath);
            
            // Writes to file
            writeToFile(filePath, "Hello World!");
            
            // Deletes file
            deleteFile(filePath);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void createFile(Path filePath) throws IOException {
        Files.createFile(filePath);
    }
    
    static void writeToFile(Path filePath, String content) throws IOException {
        Files.writeString(filePath, content);
        System.out.println("Content written to file.");
    }
    
    static void deleteFile(Path filePath) throws IOException {
        Files.delete(filePath);
        System.out.println("File Delete: " + filePath);
    }
}
