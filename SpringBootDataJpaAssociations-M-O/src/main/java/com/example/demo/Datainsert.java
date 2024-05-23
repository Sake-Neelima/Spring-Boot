package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Datainsert implements CommandLineRunner {
	@Autowired
	private EmployeRepository erepo;
	@Autowired
	private DeptRepository drepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Dept dept1 = new Dept(1, "Engineering", "Headquarters");
		Dept dept2 = new Dept(2, "Marketing", "Branch Office");
		Dept dept3 = new Dept(3, "Finance", "Branch Office");
		
		Employe e1=new Employe(101,"neelu",3456.8,dept1);
		Employe e2=new Employe(102,"nikkilu",4456.8,dept1);
		Employe e3=new Employe(103,"vamsi",6678.8,dept2);
		Employe e4=new Employe(104,"nimbu",4567.8,dept2);
		Employe e5=new Employe(105,"meghana",7845.8,dept3);
		Employe e6=new Employe(106,"hari",84567.8,dept3);
		
		drepo.saveAll(Arrays.asList(dept1,dept2,dept3));

		erepo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
		
		

	}

}
