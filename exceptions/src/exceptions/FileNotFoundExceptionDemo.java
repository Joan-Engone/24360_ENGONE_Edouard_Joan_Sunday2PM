package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionDemo {

    public static void main(String[] args) {
        System.out.println("\n--- FileNotFoundException Example ---");

        try {
            FileInputStream fileInputStream = new FileInputStream("non_existent_file.txt");
            System.out.println("File opened successfully.");
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException
            System.err.println("FileNotFoundException occurred: The file does not exist.");
        } catch (IOException e) {
            // Handle any other IOExceptions
            System.err.println("IOException occurred: " + e.getMessage());
        } finally {
            System.out.println("FileNotFoundException handling example complete.");
        }
    }
}
