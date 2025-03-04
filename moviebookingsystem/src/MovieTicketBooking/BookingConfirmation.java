package MovieTicketBooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BookingConfirmation {

	public static void confirmBooking(Scanner scanner) {
		System.out.println("Enter your username:");
		String username = scanner.nextLine();

		Connection conn = DatabaseConnection.getConnection();
		if (conn == null) {
			System.out.println("Database connection failed.");
			return;
		}

		String query = "SELECT b.booking_id, m.title, s.show_time, b.seats_booked " + "FROM Bookings b "
				+ "JOIN Shows s ON b.show_id = s.show_id " + "JOIN Movies m ON s.movie_id = m.movie_id "
				+ "WHERE b.user_name = ?";

		try (PreparedStatement psmt = conn.prepareStatement(query)) {
			psmt.setString(1, username);
			try (ResultSet rs = psmt.executeQuery()) {
				System.out.println("Booking Confirmation:");
				while (rs.next()) {
					int bookingId = rs.getInt("booking_id");
					String movieTitle = rs.getString("title");
					String showTime = rs.getTimestamp("show_time").toString();
					int seatsBooked = rs.getInt("seats_booked");

					System.out.println("Booking ID: " + bookingId + ", Movie: " + movieTitle + ", Show Time: "
							+ showTime + ", Seats Booked: " + seatsBooked);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
