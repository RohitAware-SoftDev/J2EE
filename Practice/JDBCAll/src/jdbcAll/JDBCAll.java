package jdbcAll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCAll {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static int result;
	private static String query;
	
	public static void main(String[] args) {
		try {
//			1. Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2 Make Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=root");
			
//			3. Prepare Statement
			statement=connection.createStatement();
			
//			Task ! Content 1. Insert 5 Records
			query="insert into student values "
					+ "(4,'Vaibhav','vaibhva@gmail.com','Solapur'),"
					+ "(5,'Shrikant','Shrikant@gmail.com','solapur'),"
					+ "(6,'Ranjeet','Ranjeet@gmsil.com','Popali'),"
					+ "(7,'Raj','Raj@gmail.com','Wadala'),"
					+ "(8,'Pranay','pranay@gmail.com','Nagpur');";
			result=statement.executeUpdate(query);
			
			System.out.println("---------------------------------------------");

			System.out.println
			("Query OK, " + result + " row(s) affected");
			
			System.out.println("---------------------------------------------");
			
//			4. process the result
			
//			Task ! Content 1. Print Records
			query="select * from student;";
			resultSet=statement.executeQuery(query);
			while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + " || "
					+ resultSet.getString(2) + " || "
					+ resultSet.getString(3) + " || "
					+ resultSet.getString(4) + " || ");
			}
			System.out.println("---------------------------------------------");
			
//			Task ! Content 2. Update 2 rows
			query=  "update student "
					+ "set name='PranayBhende' "
					+ "where id=8;";
			result=statement.executeUpdate(query);
			
			System.out.println("---------------------------------------------");
			
			System.out.println
			("Query OK, " + result + " row(s) affected");
			
			System.out.println("---------------------------------------------");
			
			query="select * from student;";
			resultSet=statement.executeQuery(query);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " || "
						+ resultSet.getString(2) + " || "
						+ resultSet.getString(3) + " || "
						+ resultSet.getString(4) + " || ");
			}
			
//			Task ! Content 3. Delete 1 rows	
			
			query="delete from student "
					+ "where id=9";
			result=statement.executeUpdate(query);
			
			System.out.println("---------------------------------------------");

			System.out.println("Query ok, "+result+ " Row(s) affected");
			
			System.out.println("---------------------------------------------");

			query="select * from student";
			resultSet=statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " || "
						+ resultSet.getString(2) + " || "
						+ resultSet.getString(3) + " || "
						+ resultSet.getString(4) + " || ");
			}
			
			
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
				if(resultSet!=null) {
					resultSet.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}	
