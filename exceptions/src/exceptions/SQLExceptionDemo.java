package exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLExceptionDemo {

    public static void main(String[] args) {
        System.out.println("\n--- SQLException Example ---");

        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/auca_library_db")) {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INVALID SQL QUERY");
        } catch (SQLException e) {
            // Handle SQLException
            System.err.println("SQLException occurred: " + e.getMessage());
        } finally {
            System.out.println("SQLException handling example complete.");
        }
    }
}
