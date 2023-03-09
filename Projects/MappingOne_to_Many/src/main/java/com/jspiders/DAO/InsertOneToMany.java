package com.jspiders.DAO;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.DTO.Player;
import com.jspiders.DTO.Team;

public class InsertOneToMany {
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
				Player player1=new Player();
				player1.setId(1);
				player1.setJersyNo(45);
				player1.setName("Rohit Sharma");
				player1.setRole("BaStsman");
				manager.persist(player1);
				
				Player player2=new Player();
				player2.setId(2);
				player2.setJersyNo(93);
				player2.setName("Bumrah");
				player2.setRole("Baller");
				manager.persist(player2);
				
				Player player3=new Player();
				player3.setId(3);
				player3.setJersyNo(63);
				player3.setName("S yadav");
				player3.setRole("Batsman");
				manager.persist(player3);
				
//				Array class use
				List<Player> players = Arrays.asList(player1,player2,player3);
				Team t=new Team();
				t.setId(1);
				t.setName("Mumbai_Indians");
				t.setCity("Mumbai");
				t.setCoach("Zaheer Khan");
				t.setPlayers(players);
				manager.persist(t);
				
			transaction.commit();
		} finally{
			closeConnection();
		}
	}
}
