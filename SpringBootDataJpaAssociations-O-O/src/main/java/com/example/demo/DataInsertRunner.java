package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired 
	private Profilerepo prrepo;
	@Autowired 
	private PersonRepo perrepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Profile pr1 = new Profile(11, "Admin", "Administrator profile");
		Profile pr2 = new Profile(22, "User", "User profile");
		Profile pr3 = new Profile(33, "Manager", "Manager profile");
		
		prrepo.saveAll(Arrays.asList(pr1,pr2,pr3));
		
		Person per1 = new Person(1, "John Doe", "123 Main St", pr1);
		Person per2 = new Person(2, "Alice Smith", "456 Elm St", pr2);
		Person per3 = new Person(3, "Bob Johnson", "789 Oak St", pr3);


		perrepo.saveAll(Arrays.asList(per1,per2,per3));
		System.out.println("Done");
		
		

	}

}
