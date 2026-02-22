import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class JDBC {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/Java_test"; // Database details
        String username = "root"; // MySQL credentials
        String password = "rajeev0146";
        String query = "select * from students"; // Query to be run

        // Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");

        // Create a statement
        Statement st = con.createStatement();

        // Execute the query
        ResultSet rs = st.executeQuery(query);

        // Process the results
        while (rs.next()) {
            String name = rs.getString("name"); // Retrieve name from db
            System.out.println(name); // Print result on console
        }

        // Close the statement and connection
        st.close();
        con.close();
        System.out.println("Connection Closed....");
    }
}