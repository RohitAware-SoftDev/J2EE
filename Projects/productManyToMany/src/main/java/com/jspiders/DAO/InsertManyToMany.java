package com.jspiders.DAO;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.DTO.Customer;
import com.jspiders.DTO.Product;

public class InsertManyToMany {

	private static EntityManagerFactory factory;
	private static EntityManager manager ;
	private static EntityTransaction transaction;
	
	public static void openConnection() {
		factory=Persistence.createEntityManagerFactory("ManyToMany");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
	}
	
	public static void closeConnection() {
		if (factory!=null) {
			factory.close();
		}
		if (manager!=null) {
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
			
			Customer customer1= new Customer();
			customer1.setId(1);
			customer1.setName("Rohan");
			customer1.setContact(8550963893L);
			customer1.setCity("Nashik");
			manager.persist(customer1);
			
			Customer customer2= new Customer();
			customer2.setId(2);
			customer2.setName("Rohit");
			customer2.setContact(9527886101L);
			customer2.setCity("Solapur");
			manager.persist(customer2);
			
			Customer customer3= new Customer();
			customer3.setId(3);
			customer3.setName("Rahul");
			customer3.setContact(9527886102L);
			customer3.setCity("Solapur");
			manager.persist(customer3);
			
			
			List<Customer> customers1 = Arrays.asList(customer1,customer2);
			
			Product product1= new Product();
			product1.setId(1);
			product1.setName("Jeans");
			product1.setPrice(2000.0);
			product1.setCategary("Cloathing");
			product1.setCustomers(customers1);
			manager.persist(product1);
			
			List<Customer> customers2 = Arrays.asList(customer2,customer3);

			Product product2= new Product();
			product2.setId(2);
			product2.setName("Biscuits");
			product2.setPrice(10.0);
			product2.setCategary("Food");
			product2.setCustomers(customers2);
			manager.persist(product2);
			
			List<Customer> customers3 = Arrays.asList(customer1,customer3);

			Product product3= new Product();
			product3.setId(3);
			product3.setName("Shoes");
			product3.setPrice(80000.0);
			product3.setCategary("Footwear");
			product3.setCustomers(customers3);
			manager.persist(product3);
			
			transaction.commit();
		} finally {
			closeConnection();
		}
		
	}

}
