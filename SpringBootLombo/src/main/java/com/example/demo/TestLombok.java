package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestLombok implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
	MyRunner mr=new MyRunner();
	mr.setName("Harish");
	mr.setCode(101);
	mr.setSalary(9870.56);
	System.out.println(mr);
	
	MyRunner mr1=new MyRunner();
	mr1.setName("Harish");
	mr1.setCode(101);
	mr1.setSalary(9870.56);
	System.out.println(mr1);
	
	System.out.println(mr.equals(mr1));
	
	
	
	
	
	
	
	MyRunner mr2=new MyRunner();
	MyRunner mr3=new MyRunner("nikki",78,9878.8);
	MyRunner mr4=new MyRunner("nikki");
	
	System.out.println(mr2);
	System.out.println(mr3);

	System.out.println(mr4);
	
	

	}

}
