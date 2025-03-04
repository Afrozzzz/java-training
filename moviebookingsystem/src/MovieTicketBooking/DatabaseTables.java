package MovieTicketBooking;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
 
public class DatabaseTables {
	public static void createTables() {
		Connection conn = DatabaseConnection.getConnection();
		if (conn == null) {
			System.out.println("database connection failed");
			return;
		}
		try {
			Statement smt = conn.createStatement();
			String createUsersTable = "CREATE TABLE IF NOT EXISTS Users (" +
                    "user_id INT AUTO_INCREMENT PRIMARY KEY," +
                    "username VARCHAR(60) NOT NULL," +
                    "password VARCHAR(60) NOT NULL," +
                    "is_admin BOOLEAN NOT NULL)";
smt.executeUpdate(createUsersTable);
System.out.println("Users table created");
			String createMovieTable = "create table if not exists Movies (" + "movie_id INT Auto_increment Primary Key,"
					+ "title varchar(60) not null," + "genre varchar(20)," + "duration INT not null)";
			smt.executeUpdate(createMovieTable);
			System.out.println("movies table created");
			String createShowsTable = "CREATE TABLE IF NOT EXISTS Shows (" + "show_id INT AUTO_INCREMENT PRIMARY KEY,"
					+ "movie_id INT ," + "show_time DATETIME NOT NULL," + "available_seats INT NOT NULL,"
					+ "FOREIGN KEY (movie_id) REFERENCES Movies(movie_id)" + ");";
 
			smt.executeUpdate(createShowsTable);
 
			System.out.println("Shows table created");
 
			String createBookingTable = "CREATE TABLE IF NOT EXISTS Bookings ("
					+ "booking_id INT AUTO_INCREMENT PRIMARY KEY," + "user_name VARCHAR(60) NOT NULL,"
					+ "show_id INT NOT NULL," + "seats_booked INT NOT NULL,"
					+ "booking_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,"
					+ "FOREIGN KEY (show_id) REFERENCES Shows(show_id)" + ");";
 
			smt.executeUpdate(createBookingTable);
 
			System.out.println("Booking table created");
			smt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
 
		}
	}
 
	public static void main(String args[]) {
		createTables();
	}
}