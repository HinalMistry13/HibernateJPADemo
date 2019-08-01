package com.service.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mapping.one2one.Department2;
import com.mapping.one2one.Emp2;

public class One2OneDemo {

	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Crud");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		// Create Department Entity
		Department2 department = new Department2();
		department.setName("Development");

		// Store Department
		entitymanager.persist(department);

		// Create Employee Entity
		Emp2 employee = new Emp2();
		employee.setEname("Satish");
		employee.setSalary(45000.0);
		employee.setDeg("Technical Writer");
		employee.setDepartment(department);

		// Store Employee
		entitymanager.persist(employee);

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

}
