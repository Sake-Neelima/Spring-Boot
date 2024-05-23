package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//@Component
public class DataInsert implements CommandLineRunner {
	@Autowired 
	private EmployeeRepo erepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		erepo.saveAll(Arrays.asList(new Employee(101,"neelu",2000.0,"software","banglore"),
				new Employee(102, "John", 2500.0, "marketing", "New York"),
				new Employee(103, "Alice", 2200.0, "finance", "London"),
				new Employee(104, "Michael", 2300.0, "sales", "Los Angeles"),
				new Employee(105, "Sophia", 2100.0, "human resources", "Paris")
				));
	}

}
