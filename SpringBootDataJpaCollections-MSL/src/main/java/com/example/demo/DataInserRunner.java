package com.example.demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DataInserRunner implements CommandLineRunner {
	@Autowired 
	private StudentRepository srepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		srepo.save(new Student(10,"neelu","s001",98,"A",
					List.of("p1","p2"),
					Set.of("T1","T2"),
					Map.of(101,"M1",102,"M2")
			));
		System.out.println("Done");
		

	}

}
