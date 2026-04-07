import java.sql.*;

public class ViewUsers {
    public static void show() {
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            System.out.println("\n=== -USERS- ===");

            while (rs.next()) {
                System.out.println("Name: " + rs.getString("Fname") + " " + rs.getString("Lname"));
                System.out.println("Email: " + rs.getString("user_email"));
                System.out.println("Role: " + rs.getString("role"));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}