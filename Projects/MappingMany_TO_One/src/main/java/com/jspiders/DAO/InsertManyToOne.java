package com.jspiders.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.DTO.Player1;
import com.jspiders.DTO.Team1;

public class InsertManyToOne {
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
			transaction.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			
			transaction.begin();
				Team1 t= new Team1();
				t.setId(1);
				t.setName("Mumbai_Indians");
				t.setCity("Mumbai");
				t.setCoach("Zaheer Khan");
				manager.persist(t);
				
				Player1 player1=new Player1();
				player1.setId(1);
				player1.setJersyNo(45);
				player1.setName("Rohit Sharma");
				player1.setRole("BaStsman");
				player1.setTeam1(t);
				manager.persist(player1);
				
				Player1 player2=new Player1();
				player2.setId(2);
				player2.setJersyNo(93);
				player2.setName("Bumrah");
				player2.setRole("Baller");
				player1.setTeam1(t);

				manager.persist(player2);
				
				Player1 player3=new Player1();
				player3.setId(3);
				player3.setJersyNo(63);
				player3.setName("S yadav");
				player3.setRole("Batsman");
				player1.setTeam1(t);

				manager.persist(player3);
				
			transaction.commit();
		} finally{
			closeConnection();
		}
	}
}
