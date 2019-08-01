package com.service.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.inheritance.tableperclass.NonTeachingStaff2;
import com.inheritance.tableperclass.TeachingStaff2;

public class StaffServiceTPC {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Crud");
		EntityManager entityManager = emFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		TeachingStaff2 ts1= new TeachingStaff2(1, "Gopal", "MSc MEd", "Maths");
		TeachingStaff2 ts2= new TeachingStaff2(2, "Manisha", "BSc BEd", "English");
		
		NonTeachingStaff2 ns1= new NonTeachingStaff2(3, "Satish", "Accounts");
		NonTeachingStaff2 ns2= new NonTeachingStaff2(4, "Krishna", "Office Admin");
		
		entityManager.persist(ts1);
		entityManager.persist(ts2);
		entityManager.persist(ns1);
		entityManager.persist(ns2);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		emFactory.close();
		
	}

}
