package com.service.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.inheritance.jointable.NonTeachingStaff1;
import com.inheritance.jointable.TeachingStaff1;

public class StaffServiceJT {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Crud");
		EntityManager entityManager = emFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		TeachingStaff1 ts1= new TeachingStaff1(1, "Gopal", "MSc MEd", "Maths");
		TeachingStaff1 ts2= new TeachingStaff1(2, "Manisha", "BSc BEd", "English");
		
		NonTeachingStaff1 ns1= new NonTeachingStaff1(3, "Satish", "Accounts");
		NonTeachingStaff1 ns2= new NonTeachingStaff1(4, "Krishna", "Office Admin");
		
		entityManager.persist(ts1);
		entityManager.persist(ts2);
		entityManager.persist(ns1);
		entityManager.persist(ns2);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		emFactory.close();
	}

}
