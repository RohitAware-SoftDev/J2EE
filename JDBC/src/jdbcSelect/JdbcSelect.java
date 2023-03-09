package jdbcSelect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	public static void main(String[] args) {

		try {
//			1 load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2 make connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=root");
			
			statement=connection.createStatement();
			
//			3process the result
			resultSet=statement.executeQuery("select * from student");
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1)+ " || "
						+ resultSet.getString(2) + " || "
						+ resultSet.getString(3) + " || "
						+ resultSet.getString(4) + " || ");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
