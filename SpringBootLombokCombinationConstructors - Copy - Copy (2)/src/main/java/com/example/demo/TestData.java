package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestData implements CommandLineRunner {

	
	public void run(String... args) throws Exception {
		Product p=new Product(101);
		System.out.println(p);

	}

}
