package com.jspder.serializationeserialization.DeSerialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.jspder.serializationeserialization.Object.User;

public class UserDeserialization {
		public static void main(String[] args) {
			File file=new File("user.txt");
			if (file.exists()) {
				try {
					FileInputStream fileInputStream = new FileInputStream(file);
					ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
					System.out.println("Reading object from file");
					User user =(User)objectInputStream.readObject();//it is required to create instant of user
					//we accessing file of user class since we created object for object class so downcast to user
					System.out.println(user);// it will print data present inside the file
					fileInputStream.close();
					objectInputStream.close();
;				} catch (IOException | ClassNotFoundException  e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("File DOes not exist");
			}
		}
}
