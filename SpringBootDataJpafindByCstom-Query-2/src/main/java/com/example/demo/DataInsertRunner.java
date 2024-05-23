package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//@Component
public class DataInsertRunner implements CommandLineRunner {
@Autowired
private EmployeeRepository erepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		   erepo.saveAll(Arrays.asList(
		            new Employee(1, "John Doe", 50000.0, "E001"),
		            new Employee(2, "Jane Smith", 60000.0, "E002"),
		            new Employee(3, "Alice Johnson", 55000.0, "E003"),
		            new Employee(4, "Bob Brown", 52000.0, "E004"),
		            new Employee(5, "Carol Williams", 53000.0, "E005")
		        ));

	}

}

