//package MovieTicketBooking;
// 
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.SQLException;
// 
//public class ResultSetMetaDataApplication {
// 
//    public static void main(String[] args) {
//        try (Connection conn = DatabaseConnection.getConnection()) {
//            if (conn == null) {
//                System.out.println("Database connection failed.");
//                return;
//            }
// 
//            java.sql.Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM shows");
//            ResultSetMetaData rsmd = rs.getMetaData();
//            int colCount = rsmd.getColumnCount();
//            System.out.println("Number of Columns: " + colCount);
// 
//            for (int i = 1; i <= colCount; i++) { 
//            	System.out.println("Column: " + i);
//                System.out.println("Column Label: " + rsmd.getColumnLabel(i));
//                System.out.println("Column Name: " + rsmd.getColumnName(i));
//                System.out.println("Column Type: " + rsmd.getColumnTypeName(i));
//System.out.println("Column Class Name: " + rsmd.getColumnClassName(i));
//                int nullable = rsmd.isNullable(i);
//                String isNullable = (nullable == ResultSetMetaData.columnNullable) ? "YES" : "NO";
//                System.out.println("Is Nullable: " + isNullable);
//                System.out.println("Table Name: " + rsmd.getTableName(i));
//                System.out.println("Schema Name: " + rsmd.getSchemaName(i));
//                System.out.println("Column Display Size: " + rsmd.getColumnDisplaySize(i));
//                boolean isAutoIncrement = rsmd.isAutoIncrement(i);
//                System.out.println("Is Auto Increment: " + (isAutoIncrement ? "YES" : "NO"));
//                System.out.println();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}