package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {

    public static void main(String[] args) {
        System.out.println("\n--- IOException Example ---");

        File file = new File("non_existent_file.txt"); // A file that does not exist

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle the IOException
            System.err.println("IOException occurred: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to read the file.");
        }
    }
}