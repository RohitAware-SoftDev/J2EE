package JdbcInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {
	private static Connection connection;
	private static Statement statement;
	private static int result;	
	private static String query;
	private static String url="jdbc:mysql://localhost:3306/student?user=root&password=root";
	
	public static void main(String[] args) {
		try {
//			1. Load Drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2. Make Connection 
			connection=DriverManager.getConnection(url);
			
//			3. Prepare Statement
			statement=connection.createStatement();
			query="insert into student values "
					+"(4,'Digambar','digu4141@gmail.com',09876543)";
			result=statement.executeUpdate(query);
			
			System.out.println("Query Ok, "+result +"Row(s) affected ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
//			4.close the connection
			try {
				if(connection!=null) {
					connection.close();
				}
				if(statement!=null) {
					statement.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
