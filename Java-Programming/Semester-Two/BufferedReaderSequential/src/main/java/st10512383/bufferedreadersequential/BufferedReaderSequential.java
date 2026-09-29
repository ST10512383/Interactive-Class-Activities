package st10512383.bufferedreadersequential;

import java.io.*; // Import BufferedReader + FileReader + IOException

public class BufferedReaderSequential {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {

            String line; // Hold the record from the file to display on the output

            System.out.printf("%-15s %-20s -%10s%n", "Student Number", "Name", "Grade");

            while ((line = reader.readLine()) != null) {

                String[] fields = line.split(",");

                int studentNumber = Integer.parseInt(fields[0]);
                String name = fields[1];
                int mark = Integer.parseInt(fields[2]);

                System.out.printf("%-15s %-20s -%10s%n", studentNumber, name, mark);
            }
        } catch (IOException e) {
            System.out.println("Error Reading File: " + e);
        }
    }
}
