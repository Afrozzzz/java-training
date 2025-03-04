package MovieTicketBooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class TicketCancellation {
    public static void cancelTicket(Scanner scanner) {
        Connection conn = DatabaseConnection.getConnection();
        if (conn == null) {
            System.out.println("Database connection failed.");
            return;
        }
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Booking ID to cancel: ");
        int bookingId = scanner.nextInt();
 

        String query = "SELECT Bookings.show_id, Bookings.seats_booked, Shows.available_seats " +
                       "FROM Bookings " +
                       "INNER JOIN Shows ON Bookings.show_id = Shows.show_id " +
                       "WHERE Bookings.user_name = ? AND Bookings.booking_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, username);
            pstmt.setInt(2, bookingId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {  
                int showId = rs.getInt("show_id");
                int seatsBooked = rs.getInt("seats_booked");
                int availableSeats = rs.getInt("available_seats");
 
                String updateSeatsQuery = "UPDATE Shows SET available_seats = ? WHERE show_id = ?";
                try (PreparedStatement updateStmt = conn.prepareStatement(updateSeatsQuery)) {
                    updateStmt.setInt(1, availableSeats + seatsBooked);
                    updateStmt.setInt(2, showId);
                    updateStmt.executeUpdate();
                }
 

                String deleteBookingQuery = "DELETE FROM Bookings WHERE booking_id = ?";
                try (PreparedStatement deleteStmt = conn.prepareStatement(deleteBookingQuery)) {
                    deleteStmt.setInt(1, bookingId);
                    deleteStmt.executeUpdate();
                }
                System.out.println("Booking successfully canceled.");
            } else {
                System.out.println("No booking found with the given details.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}