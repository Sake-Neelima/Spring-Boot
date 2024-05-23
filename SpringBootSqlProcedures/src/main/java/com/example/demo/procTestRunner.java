package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//@Component
public class procTestRunner implements CommandLineRunner {
@Autowired
private EmployeeRepo erepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//erepo.getAllemp().forEach(System.out::println);
		erepo.getAllempbydept("software").forEach(System.out::println);
		
		
	}

}
