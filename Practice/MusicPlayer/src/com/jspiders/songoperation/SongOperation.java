package com.jspiders.songoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.jspiders.musicPlayer.MusicPlayer;

public class SongOperation {
	static Scanner scanner= new Scanner(System.in); 
	private static Connection connection;
	private static Statement statement;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	private static int result;
	private static boolean flag = true;
	
	
	public static void openConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer?user=root&password=root");
			statement=connection.createStatement();
		}catch (Exception e) {
			System.out.println("");
		}
	}

	public static void closeConnection() {
		try {
			
			if (connection != null) {
				connection.close();
			}
			if (preparedStatement != null) {
				preparedStatement.close();
			}if(scanner!=null) {
				scanner.close();
			}
		} catch (Exception e) {
			System.out.println();
		}
	}
	//	FOR CHOOSE SONG OPTION CREATED playSong() :
	
	public void playSong() {
		try {			
			while(flag) {
				System.out.println(" 1. Choose\n 2. Random\n 3. All Song\n 4. Go Back");
				openConnection();
				
				switch (scanner.nextInt()) {
				case 1:
				{
					System.out.println(" 1. Kesariya Tera Ishq Hai Piya\n "
							+ "2. Chittiyaan Kalaiyaan\n "
							+ "3. The Disco Song\n "
							+ "4. Sooraj Dooba Hain\n "
							+ "5. Go Back");
					boolean flag=true;
					while(flag) {
						
						switch (scanner.nextInt()) {
						case 1:
						{
							query="select * from musicplayer "
									+ "where id=1";
							resultSet=statement.executeQuery(query);
							while(resultSet.next()) {
								System.out.println("Playing  :\n"
										+"Song Number : "+ resultSet.getInt(1)+ "\n"  
										+ "Song Name : "+resultSet.getString(2)+ "\n1"
										+ "Singer : "+ resultSet.getString(3)+ "\n"
										+ "Movie Name : "+ resultSet.getString(4)+ "\n"
										+ "Duration : "+ resultSet.getFloat("duration") + " Min\n"
										+ "Album Name : "+ resultSet.getString(6)+ "\n");
							}
							break;
						}
					
						
						case 2:
						{
							
							query="select * from musicplayer "
									+ "where id=2";
							resultSet=statement.executeQuery(query);
							while(resultSet.next()) {
								System.out.println("Playing  :\n"
										+"Song Number : "+ resultSet.getInt(1)+ "\n"  
										+ "Song Name : "+resultSet.getString(2)+ "\n"
										+ "Singer : "+ resultSet.getString(3)+ "\n"
										+ "Movie Name : "+ resultSet.getString(4)+ "\n"
										+ "Duration : "+ resultSet.getFloat("duration") + " Min\n"
										+ "Album Name : "+ resultSet.getString(6)+ "\n");
							}
							break;
						}
						
						
						case 3:
						{
						
							query="select * from musicplayer "
									+ "where id=3";
							resultSet=statement.executeQuery(query);
							while(resultSet.next()) {
								System.out.println("Playing  :\n"
										+"Song Number : "+ resultSet.getInt(1)+ "\n"  
										+ "Song Name : "+resultSet.getString(2)+ "\n"
										+ "Singer : "+ resultSet.getString(3)+ "\n"
										+ "Movie Name : "+ resultSet.getString(4)+ "\n"
										+ "Duration : "+ resultSet.getFloat("duration") + " Min\n"
										+ "Album Name : "+ resultSet.getString(6)+ "\n");
							}
							break;
						}
					
						
						case 4:
						{
							
							query="select * from musicplayer "
									+ "where id=4";
							resultSet=statement.executeQuery(query);
							while(resultSet.next()) {
								System.out.println("Playing  :\n"
										+"Song Number : "+ resultSet.getInt(1)+ "\n"  
										+ "Song Name : "+resultSet.getString(2)+ "\n"
										+ "Singer : "+ resultSet.getString(3)+ "\n"
										+ "Movie Name : "+ resultSet.getString(4)+ "\n"
										+ "Duration : "+ resultSet.getFloat("duration") + " Min\n"
										+ "Album Name : "+ resultSet.getString(6)+ "\n");
							}
							break;
						}
						case 5:
						{
							flag=false;
						}
						break;
						}
					}
				}
				case 2:
					{
						int no=(int) (Math.random()*5);
						
						switch (no) {
							case 1:
							{
								query="select * from musicplayer "
										+ "where id=1";
								resultSet=statement.executeQuery(query);
								while(resultSet.next()) {
									System.out.println("Playing  :\n"
											+"Song Number : "+ resultSet.getInt(1)+ "\n"  
											+ "Song Name : "+resultSet.getString(2)+ "\n1"
											+ "Singer : "+ resultSet.getString(3)+ "\n"
											+ "Movie Name : "+ resultSet.getString(4)+ "\n"
											+ "Duration : "+ resultSet.getFloat("duration") + " Min\n"
											+ "Album Name : "+ resultSet.getString(6)+ "\n");
//									wait(99);
								}
								break;
							}
						
							
							case 2:
							{
								
								query="select * from musicplayer "
										+ "where id=2";
								resultSet=statement.executeQuery(query);
								while(resultSet.next()) {
									System.out.println("Playing  :\n"
											+"Song Number : "+ resultSet.getInt(1)+ "\n"  
											+ "Song Name : "+resultSet.getString(2)+ "\n"
											+ "Singer : "+ resultSet.getString(3)+ "\n"
											+ "Movie Name : "+ resultSet.getString(4)+ "\n"
											+ "Duration : "+ resultSet.getFloat("duration") + " Min\n"
											+ "Album Name : "+ resultSet.getString(6)+ "\n");
								}
								break;
							}
							
							
							case 3:
							{
							
								query="select * from musicplayer "
										+ "where id=3";
								resultSet=statement.executeQuery(query);
								while(resultSet.next()) {
									System.out.println("Playing  :\n"
											+"Song Number : "+ resultSet.getInt(1)+ "\n"  
											+ "Song Name : "+resultSet.getString(2)+ "\n"
											+ "Singer : "+ resultSet.getString(3)+ "\n"
											+ "Movie Name : "+ resultSet.getString(4)+ "\n"
											+ "Duration : "+ resultSet.getFloat("duration") + " Min\n"
											+ "Album Name : "+ resultSet.getString(6)+ "\n");
								}
								break;
							}
						
							
							case 4:
							{
								
								query="select * from musicplayer "
										+ "where id=4";
								resultSet=statement.executeQuery(query);
								while(resultSet.next()) {
									System.out.println("Playing  :\n"
											+"Song Number : "+ resultSet.getInt(1)+ "\n"  
											+ "Song Name : "+resultSet.getString(2)+ "\n"
											+ "Singer : "+ resultSet.getString(3)+ "\n"
											+ "Movie Name : "+ resultSet.getString(4)+ "\n"
											+ "Duration : "+ resultSet.getFloat("duration") + " Min\n"
											+ "Album Name : "+ resultSet.getString(6)+ "\n");
								}
								break;
							}
						}
					}
				case 3:
				{ 
						query="select * from musicplayer ";
					resultSet=statement.executeQuery(query);
					while(resultSet.next()) {
						System.out.println("Playing  :\n"
								+"Song Number : "+ resultSet.getInt(1)+ "\n"  
								+ "Song Name : "+resultSet.getString(2)+ "\n"
								+ "Singer : "+ resultSet.getString(3)+ "\n"
								+ "Movie Name : "+ resultSet.getString(4)+ "\n"
								+ "Duration : "+ resultSet.getFloat("duration") + " Min\n"
								+ "Album Name : "+ resultSet.getString(6)+ "\n");
					}
					break;
				}
				case 4:{
//					flag=false;
					MusicPlayer.Music();
					break;
				}
				default:
					{
						System.out.println("Invalid Option");
						System.out.println();
					}
					break;
				}
			}
		} catch (Exception e) {
			System.out.println();

		}finally {
		closeConnection();
	}
}	
		
//	METHOD FOR ADD/ REMOVE SONG addSong() :
	public void addSong() {
	
			try {
				System.out.println("    Menu\n 1. ADD Song\n 2. Remove Song\n 3. Exit ");
				openConnection();
				while(flag) {
					query="insert into musicplayer values "
							+ "(?,?,?,?,?,?)";
					preparedStatement=connection.prepareStatement(query);
					
					int choice=scanner.nextInt();
					switch (choice) {
					case 1:{

						System.out.println("Fill the details of song");
						
						System.out.println("Enter the  : Id");
						preparedStatement.setInt(1, scanner.nextInt());
						
						scanner.nextLine();
						System.out.println("Enter the  : song name");
						preparedStatement.setString(2, scanner.nextLine());
						
						System.out.println("Enter the  : Singer Name");
						preparedStatement.setString(3, scanner.nextLine());
						
						System.out.println("Enter the  : Movie Name");
						preparedStatement.setString(4, scanner.nextLine());
						
						System.out.println("Enter the  :  Duration in 0.0");
						preparedStatement.setFloat(5, scanner.nextFloat());
						
						
						scanner.nextLine();
						System.out.println("Enter the  : Album Name");
						preparedStatement.setString(6, scanner.nextLine());
						
						result=preparedStatement.executeUpdate();
						
						System.out.println("Successfully Added"
								+ "Query Ok, "+result +" Row(s) Affected");
						break;
					}
					case 2:{
//						query="select id "
//								+ "from musicplayer "
//								+ "order by id desc limit 1";
//						resultSet=statement.executeQuery(query);
//						while (resultSet.next()) {
//							System.out.println(resultSet);
//						}
						
//						System.out.println("--------------------------------\n");
						
						
						
						query="delete from musicplayer "
								+ "where name = ? ";
						preparedStatement=connection.prepareStatement(query);
						
						System.out.println("Enter Name Of The Song You Want To Delete ");
						
						scanner.nextLine();
						preparedStatement.setString(1, scanner.nextLine());
						
						
						result=preparedStatement.executeUpdate();

						System.out.println("Query Ok, "+result +" Row(s) Affected");
						break;
					}
					case 3:{
						flag=false;
//						addSong();
						break;
					}
					default:
//					{
						System.out.println("Invalid Statement / Input");
						break;
					}
					
				}
			} catch (Exception e) {
				System.out.println();
//				e.printStackTrace();
			}finally {
				closeConnection();
		}
	}
	
//	METHOD FOR EDIT SONGS editSong() :
	public void editSong() {
		try {
			openConnection();
			query="select * from musicplayer";
			resultSet=statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)  +" || "
						+ resultSet.getString(2)+ " || "
						+resultSet.getString(3)+ " ||"
						+ resultSet.getString(4)+" || "
						+ resultSet.getFloat(5)+" || "
						+ resultSet.getString(6)+" || ");
			}
			
		System.out.println("--------------------------------------------------\n");
		query="update musicplayer "
					+ "set name=?,singer=?,movie=?,duration=?,album=? "
					+ "where id= ? ";
			
		preparedStatement=connection.prepareStatement(query);	
		System.out.println("Enter the new name of song you want to Change");
		preparedStatement.setString(1, scanner.nextLine());
		
		System.out.println("Enter the new name of Singer you want to Change");
		preparedStatement.setString(2, scanner.nextLine());
		
		System.out.println("Enter the new name of Movie you want to Change");
		preparedStatement.setString(3, scanner.nextLine());
		
		System.out.println("Enter the new Durattion time of song  you want to Change");
		preparedStatement.setFloat(4, scanner.nextFloat());
		
		scanner.nextLine();
		System.out.println("Enter the album name  of song that you have updated to Change");
		preparedStatement.setString(5, scanner.nextLine());
		
		System.out.println("Enter the Number of song that you have updated to Change");
		preparedStatement.setInt(6, scanner.nextInt());
		
		result=preparedStatement.executeUpdate();
		System.out.println("Successfully updated "+result);
		
		
		} catch (Exception e) {
			System.out.println();
		}finally {
			closeConnection();
		}
	}
}
