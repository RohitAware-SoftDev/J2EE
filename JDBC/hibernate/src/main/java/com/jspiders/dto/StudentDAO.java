package com.jspiders.dto;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDAO {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager manager;
	private static EntityTransaction entityTransaction;
	
	
	public static void openConnection() {
		entityManagerFactory = Persistence.
				createEntityManagerFactory("hibernate");
		manager = entityManagerFactory.createEntityManager();
		entityTransaction = manager.getTransaction();
	}
	
	private static void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (entityTransaction.isActive()) {
			entityTransaction.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			entityTransaction.begin();
			
			StudentDTO dto=new StudentDTO();
			dto.setId(3);
			dto.setEmail("Rohit@gmail.com");;
			dto.setBranch("Electrical");
			dto.setContact(9921607704L);
			dto.setName("Rohit");
			dto.setPlace("Solapur");
			
			manager.persist(dto);
			entityTransaction.commit();
			
		} finally {
			closeConnection();
		}
	}
}
