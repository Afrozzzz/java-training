package MovieTicketBooking;
 
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class StoredProCallable {
	public static void StoredProcedure() throws SQLException {
		Connection conn = DatabaseConnection.getConnection();
		if(conn==null) {
			System.out.println("Database Connection Failed");
			return;
		}
 

		String procedure = ""
				+ "	CREATE PROCEDURE GetmovieTitleGenre ("
				+ " IN movie_id_input INT,"
				+ " OUT title_output VARCHAR(30),"
				+ " OUT genre_output VARCHAR(20)"
				+ "	)"
				+ "	BEGIN"
				+ "	  SELECT title, genre INTO title_output, genre_output FROM Movies WHERE movie_id = movie_id_input; "
				+ "	END;";
		Statement smt = conn.createStatement();
		smt.execute(procedure);
	}
	public static void main(String[] args) throws SQLException { 
		StoredProcedure();
	}
}
































