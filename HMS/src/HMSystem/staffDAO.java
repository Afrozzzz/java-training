package HMSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
public class staffDAO {
 
    // Method to add a staff member
    public void addStaff(staff staff) throws SQLException {
        String query = "INSERT INTO Staff (name, role, contact_number) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
 
            psmt.setString(1, staff.getName());
            psmt.setString(2, staff.getRole());
            psmt.setString(3, staff.getContact_number());
 
            psmt.executeUpdate();
        }
    }
 
    // Method to get all staff members
    public List<staff> getAllStaff() throws SQLException {
        List<staff> staffList = new ArrayList<>();
        String query = "SELECT * FROM Staff";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query);
             ResultSet rs = psmt.executeQuery()) {
 
            while (rs.next()) {
                staff staff = new staff(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("role"),
                        rs.getString("contact_number")
                );
                staffList.add(staff);
            }
        }
        return staffList;
    }
 
    // Method to update a staff member
    public void updateStaff(staff staff) throws SQLException {
        String query = "UPDATE Staff SET name = ?, role = ?, contact_number = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
 
            psmt.setString(1, staff.getName());
            psmt.setString(2, staff.getRole());
            psmt.setString(3, staff.getContact_number());
            psmt.setInt(4, staff.getId());
 
            psmt.executeUpdate();
        }
    }
 
    // Method to delete a staff member
    public void deleteStaff(int id) throws SQLException {
        String query = "DELETE FROM Staff WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
 
            psmt.setInt(1, id);
            psmt.executeUpdate();
        }
    }
}