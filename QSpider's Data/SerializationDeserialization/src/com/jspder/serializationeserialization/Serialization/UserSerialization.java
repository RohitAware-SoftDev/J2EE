package com.jspder.serializationeserialization.Serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.jspder.serializationeserialization.Object.User;

public class UserSerialization {
	public static void main(String[] args) {
		File file = new File("user.txt");
		if (file.exists()) {
			System.out.println("file already exist");
		}else
		{
			try {
				file.createNewFile();
				System.out.println("File created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
				User user = new User(1,"jethya","tappu.@gamil.com","tappu123","babbitaJi143");
				objectOutputStream.writeObject(user);
				System.out.println("Object written to file");
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
