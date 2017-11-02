import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
public class db_config {
	private static Connection conn = null;
	private static String db_username = "root";
	private static String db_password = "";
	private static String db_name = "hostel_management";
	private static String db_host = "localhost";
	
	public static void connect_to_database(){
		try{
			conn = DriverManager.getConnection("jdbc:mysql://"+ db_host +"/"+ db_name +"", db_username, db_password);
			System.out.println("connection success");
		}catch(SQLException e){
			System.out.println("connection to the Database failed "+e);
		}
	}
	
	public ResultSet execute_query(String query){
		ResultSet rs = null;
		try{
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
		}catch(SQLException e){
			System.out.println("Failed to execute the query "+e);
		}
		return rs;
	}
	
	public void insert_data(String query, HashMap<Integer, String> data)throws SQLException{
		PreparedStatement preparedStmt = conn.prepareStatement(query);
		for (int i=1;i<=data.size();i++){
			try{
				/* If parameter is integer */
				preparedStmt.setInt (i, Integer.parseInt(data.get(i)));
			}catch(NumberFormatException e)
			{
				/* If parameter is not String */
				preparedStmt.setString (i, data.get(i));
			}
		}
		preparedStmt.execute();
	}
}
