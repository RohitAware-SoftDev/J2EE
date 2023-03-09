package jdbcUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {
	private static Statement statement;
	private static Connection  connection;
	private static int result;
	private static String query;
	
	public static void main(String[] args) {
//		1 load driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//		2 make Connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=root");
//		3 prepare statement
			statement=connection.createStatement();
			query="delete from student "
					+ "where id=4 ";
			result=statement.executeUpdate(query);
			
			System.out.println
			("Query OK, " + result + " row(s) affected");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
