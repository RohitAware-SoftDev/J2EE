package com.jspiders.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.dto.Infosys;


public class CompanyInsert {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void openConnection() {
		factory=Persistence.createEntityManagerFactory("hibernate");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
	}
	
	public static void closeConnection() {
		if(factory!=null) {
			factory.close();
		}
		if(manager!=null) {
			manager.close();
		}
		if(transaction.isActive()) {
			transaction.rollback();;
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
				Infosys infosys=new Infosys();
				infosys.setId(1);
				infosys.setBranch("Hadapsar");
				infosys.setCompany_Name("infosys");
				infosys.setLocatin("MagarPatta");
				
				manager.persist(infosys);
			transaction.commit();
		} finally {
			closeConnection();
		}
	}
}
