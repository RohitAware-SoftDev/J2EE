package serialization;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import SerializationDeserialization.Object.User;
public class UserSerialization {
	public static void main(String[] args) {
		File file= new File("Rohit.txt");
		
		if(file.exists()) {
			System.out.println("Filer already exist");
		}else {
			try {
				file.createNewFile();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			try {
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
				User user =new User(1, "Rohit", "awarerohit@gmail.com", "RohitAware", "992130484");
				objectOutputStream.writeObject(user);
				fileOutputStream.close();
				objectOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
			
		
	}
}
