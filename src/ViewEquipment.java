import java.sql.*;

public class ViewEquipment {
    public static void show() {
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM equipment");

            System.out.println("\n=== -EQUIPMENT LIST- ===");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("equip_id"));
                System.out.println("Name: " + rs.getString("equip_name"));
                System.out.println("Status: " + rs.getString("equip_status"));
                System.out.println("Condition: " + rs.getString("equip_condition"));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}