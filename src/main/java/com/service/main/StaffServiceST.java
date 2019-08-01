package com.service.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.inheritance.singletable.NonTeachingStaff;
import com.inheritance.singletable.TeachingStaff;

public class StaffServiceST {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Crud");
		EntityManager entityManager = emFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		TeachingStaff ts1= new TeachingStaff(1, "Gopal", "MSc MEd", "Maths");
		TeachingStaff ts2= new TeachingStaff(2, "Manisha", "BSc BEd", "English");
		
		NonTeachingStaff ns1= new NonTeachingStaff(3, "Satish", "Accounts");
		NonTeachingStaff ns2= new NonTeachingStaff(4, "Krishna", "Office Admin");
		
		entityManager.persist(ts1);
		entityManager.persist(ts2);
		entityManager.persist(ns1);
		entityManager.persist(ns2);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		emFactory.close();
		
	}

}
