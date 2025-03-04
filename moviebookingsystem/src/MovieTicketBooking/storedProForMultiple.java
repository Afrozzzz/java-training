package MovieTicketBooking;
 
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
 
// out -> 1, 2
//fetch multiple rows -> returns resultset
//based on username -> fetch all bookings -> IN username
//xyz -> atleast 2 bookings
//create procdure -> no out variable
 
//test the procedure
//csmt -> one placeholder -> ?
//setString(1,username)
//ResultSet rs = csmt.csmt.executeQuery()
//while(rs.next()) -> display all booking details
 
public class storedProForMultiple {
	public static void StoredProcedure() throws SQLException {
		Connection conn = DatabaseConnection.getConnection();
		if(conn==null) {
			System.out.println("Database Connection Failed");
			return;
		}
		String procedure = "CREATE PROCEDURE FetchMultipleRows ("
				+ "	IN name_input VARCHAR(20))"
				+ "	BEGIN"
				+ "	     SELECT * FROM Bookings "
				+ "	     Where user_name = name_input;"
				+ "	END;";
		Statement smt = conn.createStatement();
		smt.execute(procedure);
		System.out.println("Procedure created");
	}
	public static void main(String[] args) throws SQLException { 
		StoredProcedure();
	}
}