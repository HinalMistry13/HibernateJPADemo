package com.service.main;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mapping.many2many.ClassRoom;
import com.mapping.many2many.Teacher;

public class Many2ManyDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Crud");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		// Create ClassRoom Entity
		ClassRoom clas1 = new ClassRoom(0, "1st", null);
		ClassRoom clas2 = new ClassRoom(0, "2nd", null);
		ClassRoom clas3 = new ClassRoom(0, "3rd", null);

		// Store ClassRoom
		entitymanager.persist(clas1);
		entitymanager.persist(clas2);
		entitymanager.persist(clas3);

		// Create ClassRoom Set1
		Set<ClassRoom> classSet1 = new HashSet<ClassRoom>();
		classSet1.add(clas1);
		classSet1.add(clas2);
		classSet1.add(clas3);

		// Create ClassRoom Set2
		Set<ClassRoom> classSet2 = new HashSet<ClassRoom>();
		classSet2.add(clas3);
		classSet2.add(clas1);
		classSet2.add(clas2);

		// Create ClassRoom Set3
		Set<ClassRoom> classSet3 = new HashSet<ClassRoom>();
		classSet3.add(clas2);
		classSet3.add(clas3);
		classSet3.add(clas1);

		// Create Teacher Entity
		Teacher teacher1 = new Teacher(0, "Satish", "Java", classSet1);
		Teacher teacher2 = new Teacher(0, "Krishna", "Adv Java", classSet2);
		Teacher teacher3 = new Teacher(0, "Masthanvali", "DB2", classSet3);

		// Store Teacher
		entitymanager.persist(teacher1);
		entitymanager.persist(teacher2);
		entitymanager.persist(teacher3);

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

}
