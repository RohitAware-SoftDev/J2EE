package JdbcSelect;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSelect {
		public class sqlQueries {
	    private static Connection connection;
	    private static Statement statement;
	    private static String url="jdbc:mysql//localhost:3306/student";
	    private static String query="select * from student";

	    public static void main(String[] args) {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            connection= DriverManager.getConnection(url, "root", "root");
	            statement=connection.createStatement();
	             ResultSet resultSet=statement.executeQuery(query);
	             while(resultSet.next()) {
	            	 for (int i = 0; i < 3; i++) {
	     				String a="";
	     				a+=resultSet.getString(i)+" || ";
	     				System.out.println(a);
	     			}
	             }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

}
