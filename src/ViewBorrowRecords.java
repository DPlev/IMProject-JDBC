import java.sql.*;

public class ViewBorrowRecords {
    public static void show() {
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT e.borrow_records_id, u.Fname, u.Lname, eq.equip_name, e.status " +
                            "FROM eborrowedrecords e " +
                            "JOIN users u ON e.User_id = u.User_id " +
                            "JOIN equipment eq ON e.equip_id = eq.equip_id"
            );

            System.out.println("\n=== -BORROW RECORDS- ===");

            while (rs.next()) {
                System.out.println("Record ID: " + rs.getInt("borrow_records_id"));
                System.out.println("Borrower: " + rs.getString("Fname") + " " + rs.getString("Lname"));
                System.out.println("Equipment: " + rs.getString("equip_name"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}