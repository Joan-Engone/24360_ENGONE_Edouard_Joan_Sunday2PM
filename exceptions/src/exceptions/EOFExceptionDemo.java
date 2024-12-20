package exceptions;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class EOFExceptionDemo {

    public static void main(String[] args) {
        System.out.println("\n--- EOFException Example ---");

        try (DataInputStream dis = new DataInputStream(new FileInputStream("test.dat"))) {
            while (true) {
                System.out.println(dis.readInt());
            }
        } catch (EOFException e) {
            // Handle EOFException
            System.err.println("EOFException occurred: Reached the end of the file unexpectedly.");
        } catch (IOException e) {
            // Handle any other IOExceptions
            System.err.println("IOException occurred: " + e.getMessage());
        } finally {
            System.out.println("EOFException handling example complete.");
        }
    }
}

