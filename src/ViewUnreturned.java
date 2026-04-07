import java.sql.*;

public class ViewUnreturned {
    public static void show() {
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM eborrowedrecords " +
                            "WHERE status != 'Returned' OR return_notes IS NOT NULL"
            );

            System.out.println("\n=== -UNRETURNED / ISSUES- ===");

            while (rs.next()) {
                System.out.println("Record ID: " + rs.getInt("borrow_records_id"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("Notes: " + rs.getString("return_notes"));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}