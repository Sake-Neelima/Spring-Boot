package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DataInserRunner implements CommandLineRunner {
	@Autowired
	private VendorRepository vrepo;
	
	@Autowired
	private ContractRepository crepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Contract c1=new Contract(1001,"house","c001");
		Contract c2=new Contract(1002,"bridge","c002");
		Contract c3=new Contract(1003,"Road","c003");
		
	

		Vendor v1=new Vendor(101,"neelu",8976.78,Arrays.asList(c1));
		Vendor v2=new Vendor(102,"nikki",8976.78,Arrays.asList(c2,c3));
		
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
	
		vrepo.save(v1);
		vrepo.save(v2);
		
		
	}

}
