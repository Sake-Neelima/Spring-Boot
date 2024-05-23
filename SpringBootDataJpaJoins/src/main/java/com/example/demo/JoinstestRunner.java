package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class JoinstestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepo repo;
	@Autowired
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Object[]> list=repo.getByEmpid(33);
		for(Object[] ob:list) {
			System.out.println(ob[0]+"---"+ob[1]+"--"+ob[2]);
		}
	}

}
