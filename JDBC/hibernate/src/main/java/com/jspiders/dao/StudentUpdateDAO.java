package com.jspiders.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.dto.StudentDTO;
public class StudentUpdateDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	
	public static void openConnection() {
		factory = Persistence.
				createEntityManagerFactory("hibernate");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction.isActive() &&  transaction!=null) {
			transaction.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			StudentDTO student = manager.find(StudentDTO.class, 1);//(entity class i.e class which made for table)
			student.setEmail("Rohitaware@gmail.com");
			student.setPlace("Solaur");
			manager.persist(student);
			transaction.commit();
		} finally {
			closeConnection();
		}
	}
}
