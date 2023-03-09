package JdbcInsert;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import JdbcInsert.Entitiy.Student;

public class StudentInsert {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static FileReader fileReader;
	private static Properties properties;
	private static int result;	
	private static String filePath="C:\\WEJE3\\Resource\\db_info.properties";
	private static String query;
	
	
	public static void main(String[] args) {
		try {
			fileReader= new FileReader(filePath);
			properties=new Properties();
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("driver"));
			
			connection=DriverManager.getConnection
					(properties.getProperty("dburl"),properties);
			
			query="insert into student "
					+ "values (?,?,?,?)";
			preparedStatement=connection.prepareStatement(query);
			
			Student s=new Student();
			s.setId(9);
			s.setName("Jagdhish");
			s.setEmail("Jagdhish@gmail.com");
			s.setPlace("Udgir");
			
			preparedStatement.setInt(1, s.getId());
			preparedStatement.setString(2, s.getName());
			preparedStatement.setString(3, s.getEmail());
			preparedStatement.setString(4, s.getPlace());

			result=preparedStatement.executeUpdate();
			
			System.out.println("Query ok, "+result +"row(s) affected");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (connection!=null) {
					connection.close();
				}
				if (preparedStatement!=null) {
					preparedStatement.close();
				}
				if (fileReader!=null) {
					fileReader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
