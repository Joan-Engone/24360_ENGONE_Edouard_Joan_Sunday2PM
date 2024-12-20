package exceptions;

public class ClassNotFoundException {

    public static void main(String[] args) {
        System.out.println("\n--- ClassNotFoundException Example ---");

        try {
            Class.forName("non.existent.ClassName");
        } catch (java.lang.ClassNotFoundException e) {
            // Handle ClassNotFoundException
            System.err.println("ClassNotFoundException occurred: " + e.getMessage());
        } finally {
            System.out.println("ClassNotFoundException handling example complete.");
        }
    }
}

