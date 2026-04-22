import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/student_db"; 
        String user = "root";
        String password = "rajeev0146";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter roll number to search: ");
            long rollno = scanner.nextLong();

            String query = "SELECT * FROM Student WHERE rollno = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setLong(1, rollno);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    System.out.println("\nStudent Details:");
                    System.out.println("Roll No: " + rs.getLong("rollno"));
                    System.out.println("Name: " + rs.getString("name")); 
                } else {
                    System.out.println("\nStudent not found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}