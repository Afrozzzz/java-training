package MovieTicketBooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
 
public class InsertData {
 
    public static void insertMovies() {
        Connection conn = DatabaseConnection.getConnection();
        if (conn == null) {
            System.out.println("Database connection failed");
            return;
        }
        String insertMovieSQL = "INSERT INTO Movies (title, genre, duration) VALUES (?, ?, ?)";
        try (PreparedStatement psmt = conn.prepareStatement(insertMovieSQL)) {
            // Inserting first movie
            psmt.setString(1, "War");
            psmt.setString(2, "Action");
            psmt.setInt(3, 150);
            psmt.executeUpdate();
            // Inserting second movie
            psmt.setString(1, "DJ Tillu");
            psmt.setString(2, "Comedy");
            psmt.setInt(3, 140);
            psmt.executeUpdate();
            // Inserting third movie
            psmt.setString(1, "Animal");
            psmt.setString(2, "Action");
            psmt.setInt(3, 180);
            psmt.executeUpdate();
            // Inserting fourth movie
            psmt.setString(1, "Gully Boys");
            psmt.setString(2, "Action");
            psmt.setInt(3, 50);
            psmt.executeUpdate();
            System.out.println("Movies data inserted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    public static void insertShows() {
        Connection conn = DatabaseConnection.getConnection();
        if (conn == null) {
            System.out.println("Database connection failed");
            return;
        }
        String insertShowSQL = "INSERT INTO Shows (movie_id, show_time, available_seats) VALUES (?, ?, ?)";
        try (PreparedStatement psmt = conn.prepareStatement(insertShowSQL)) {
            // Inserting shows for movie_id 1
            insertShow(psmt, 1, LocalDateTime.of(2025, 2, 13, 18, 30), 100);
            insertShow(psmt, 1, LocalDateTime.of(2025, 2, 13, 20, 30), 100);
            insertShow(psmt, 1, LocalDateTime.of(2025, 2, 13, 22, 30), 100);
            // Inserting shows for movie_id 2
            insertShow(psmt, 2, LocalDateTime.of(2025, 2, 13, 18, 30), 75);
            insertShow(psmt, 2, LocalDateTime.of(2025, 2, 13, 20, 30), 75);
            insertShow(psmt, 2, LocalDateTime.of(2025, 2, 13, 22, 30), 75);
            // Inserting shows for movie_id 3
            insertShow(psmt, 3, LocalDateTime.of(2025, 2, 13, 18, 30), 150);
            insertShow(psmt, 3, LocalDateTime.of(2025, 2, 13, 20, 30), 150);
            insertShow(psmt, 3, LocalDateTime.of(2025, 2, 13, 22, 30), 150);
 
            // Inserting shows for movie_id 4
            insertShow(psmt, 4, LocalDateTime.of(2025, 2, 13, 18, 30), 150);
            insertShow(psmt, 4, LocalDateTime.of(2025, 2, 13, 20, 30), 150);
            insertShow(psmt, 4,
                       LocalDateTime.of(2025,
                                        2,
                                        13,
                                        22,
                                        30),
                       150);
            System.out.println("Shows data inserted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
	public static void insertMovie(String title,
                                   String genre,
                                   int duration) throws SQLException {
        Connection conn = DatabaseConnection.getConnection();
        if (conn == null) {
            throw new SQLException("Database connection failed");
        }
        String insertMovieSQL = "INSERT INTO Movies (title,genre,duration) VALUES (?, ?, ?)";
        try (PreparedStatement psmt = conn.prepareStatement(insertMovieSQL)) {
            psmt.setString(1,
                           title);
            psmt.setString(2,
                           genre);
            psmt.setInt(3,
                        duration);
            psmt.executeUpdate();
        }
    }
 
    public static void insertShow(int movieId,
                                  LocalDateTime showTime,
                                  int availableSeats) throws SQLException {
        Connection conn = DatabaseConnection.getConnection();
        if (conn == null) {
            throw new SQLException("Database connection failed");
        }
        String insertShowSQL = "INSERT INTO Shows (movie_id, show_time,available_seats) VALUES (?, ?, ?)";

        try (PreparedStatement psmt = conn.prepareStatement(insertShowSQL)) {
            psmt.setInt(1,
                        movieId);
            psmt.setTimestamp(2,
                              Timestamp.valueOf(showTime));
            psmt.setInt(3,
                        availableSeats);
            psmt.executeUpdate();
        }
    }
 
    private static void insertShow(PreparedStatement psmt,
                                   int movieId,
                                   LocalDateTime showTime,
                                   int availableSeats) throws SQLException {
        psmt.setInt(1,
                    movieId);
        psmt.setTimestamp(2,
                          Timestamp.valueOf(showTime));
        psmt.setInt(3,
                    availableSeats);
        psmt.executeUpdate();
    }
 
    public static void main(String[] args) {
        insertMovies();
        insertShows();
    }
}