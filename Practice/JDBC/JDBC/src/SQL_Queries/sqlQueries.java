package SQL_Queries;

import java.sql.Statement;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

public class sqlQueries {
    private static Connection connection;
    private static Statement statement;
    private static String url="jdbc:mysql//localhost:3306/student";
    private String query="select * from student";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection= DriverManager.getConnection(url, "root", "root");
            statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("query");
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
