package com.service.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mapping.one2many.Department1;
import com.mapping.one2many.Emp1;

public class One2ManyDemo {

	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Crud");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		// Create Employee1 Entity
		Emp1 employee1 = new Emp1();
		employee1.setEname("Satish");
		employee1.setSalary(45000.0);
		employee1.setDeg("Technical Writer");

		// Create Employee2 Entity
		Emp1 employee2 = new Emp1();
		employee2.setEname("Krishna");
		employee2.setSalary(45000.0);
		employee2.setDeg("Technical Writer");

		// Create Employee3 Entity
		Emp1 employee3 = new Emp1();
		employee3.setEname("Masthanvali");
		employee3.setSalary(50000.0);
		employee3.setDeg("Technical Writer");

		// Store Employee
		entitymanager.persist(employee1);
		entitymanager.persist(employee2);
		entitymanager.persist(employee3);

		// Create Employeelist
		List<Emp1> emplist = new ArrayList<Emp1>();
		emplist.add(employee1);
		emplist.add(employee2);
		emplist.add(employee3);

		// Create Department Entity
		Department1 department = new Department1();
		department.setName("Development");
		department.setEmpList(emplist);

		// Store Department
		entitymanager.persist(department);

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

}
