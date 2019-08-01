package com.service.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entity.Employee;

public class EmployeeService {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Crud");
		EntityManager entityManager = emFactory.createEntityManager();
		//entityManager.getTransaction().begin();
		
		//for insert...
		/*
		Employee emp = new Employee();
		emp.setEname("Manisha");
		emp.setDeg("Proof Reader");
		emp.setSalary(40000);
		
		entityManager.persist(emp);
		*/
		//for update...
		/*
		Employee emp = entityManager.find(Employee.class, 1);
		emp.setSalary(20000);
		*/
		
		//for delete...
		/*
		Employee emp = entityManager.find(Employee.class, 1);
		entityManager.remove(emp);
		*/
		
		//entityManager.getTransaction().commit();
		
		//for retriving multiple data...
		Query query = entityManager.createQuery("select UPPER(e.ename) from Employee e");
		List<String> names = query.getResultList();
		for (String name : names){
			System.out.println("Employee name : " + name);
		}
		
		//for retriving single data...
		Query query2 = entityManager.createQuery("select MAX(e.salary) from Employee e");
		Double maxSalary = (Double) query2.getSingleResult();
		System.out.println("Maximum salary is : " + maxSalary);
		
		//NamedQuery
		Query query3 = entityManager.createNamedQuery("find employee by id");
	    query3.setParameter("id", 2);
	    List<Employee> list = query3.getResultList();
	    for( Employee e:list ){
	    	System.out.print("Employee ID :" + e.getEid( ));
	        System.out.println("\t Employee Name :" + e.getEname( ));
	    }
		
		//System.out.println(emp.toString());
		entityManager.close();
		emFactory.close();
	}

}
