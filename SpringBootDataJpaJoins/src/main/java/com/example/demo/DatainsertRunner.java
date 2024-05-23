package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//@Component
public class DatainsertRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepo erepo;
	@Autowired
	private ProjectsRepo prepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Projects proj1 = new Projects(11, "Project 1", 100000.0);
		Projects proj2 = new Projects(22, "Project 2", 150000.0);
		Projects proj3 = new Projects(33, "Project 3", 120000.0);
		Projects proj4 = new Projects(44, "Project 4", 110000.0);
		Projects proj5 = new Projects(55, "Project 5", 135000.0);
		Projects proj6 = new Projects(66, "Project 6", 125000.0);

		prepo.saveAll(Arrays.asList(proj1,proj2,proj3,proj4,proj5,proj6));
		
		Employee emp1 = new Employee(1, "John Doe", 50000.0,null);
		Employee emp2 = new Employee(2, "Alice Smith", 60000.0,Arrays.asList(proj6));
		Employee emp3 = new Employee(3, "Bob Johnson", 70000.0,null);
		Employee emp4 = new Employee(4, "Emily Brown", 55000.0, Arrays.asList(proj5));
		Employee emp5 = new Employee(5, "Michael Wilson", 62000.0, null);
		Employee emp6 = new Employee(6, "Sophia Martinez", 72000.0, Arrays.asList(proj3,proj2));
		
		erepo.saveAll(Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6));
	}

}
