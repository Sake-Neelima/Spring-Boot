package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository srepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		srepo.save(new Student("neelu","cse"));
		srepo.save(new Student("nikki","Ece"));
		srepo.save(new Student("hari","chem"));
		srepo.save(new Student("meghana","MMe"));
		srepo.save(new Student("vamis","civil"));
		srepo.save(new Student("sam","Mech"));

	}

}
