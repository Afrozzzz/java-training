package MovieTicketBooking;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetApplication {

    public static void main(String[] args) {
        try {
           
            Connection conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false); // Set autocommit to false

            // Create a JdbcRowSet
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/movie_booking");
            rowSet.setUsername("root");
            rowSet.setPassword("Genpact@123456789");

            // Set the SQL query
            rowSet.setCommand("SELECT * FROM movies");
            rowSet.execute();

            // Iterate through the result set
            while (rowSet.next()) {
                System.out.println("ID: " + rowSet.getInt("movie_id"));
            }

            
            while (rowSet.previous()) {
                System.out.println("ID: " + rowSet.getInt("movie_id"));
            }
            rowSet.close();

            // Create a CachedRowwSet
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setCommand("SELECT * FROM movies");
            cachedRowSet.execute(conn);

            // Iterate through     CachedRowSet
            cachedRowSet.beforeFirst();
            while (cachedRowSet.next()) {
                System.out.print("ID: " + cachedRowSet.getInt("movie_id"));
                System.out.print(", Title: " + cachedRowSet.getString("title"));
                System.out.println();
            }

            conn.commit(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
