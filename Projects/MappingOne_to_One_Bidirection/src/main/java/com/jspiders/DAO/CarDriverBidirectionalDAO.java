package com.jspiders.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.DTO.Car;
import com.jspiders.DTO.Driver;

public class CarDriverBidirectionalDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	public static void openConnection() {
	factory=Persistence.createEntityManagerFactory("hibernate");
	manager=factory.createEntityManager();
	transaction=manager.getTransaction();
	}
	
	public static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			
			transaction.begin();
//			Driver Details 
				Driver driver= new Driver();
				driver.setName("Harish");
				driver.setId(4);
				driver.setContact(9932434834L);
//				driver.setCar(car); //If we do this it will throw error because we created object of Car after declaration hence 
//				take both statement and put it at the end 
//				manager.persist(driver);				
				
//				Car Details
				Car car= new Car();
				car.setBrand("Tata");
				car.setId(4);
				car.setModel("Nexon");
				car.setRegNo("MH14 22WEWE2");
				
				
				driver.setCar(car);
				manager.persist(driver);
				
				car.setDriver(driver);
				manager.persist(car);
			transaction.commit();
		} finally {
			closeConnection();
		}
	}
}
