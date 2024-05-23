package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired ProductRepository prepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		prepo.saveAll(Arrays.asList(new Product(101,"S-TV","QWE",8987.45,"A"),
				new Product(102,"R-TYU","MKI",8737.45,"D"),
				new Product(103,"t-KG","RTY",2345.45,"C"),
				new Product(104,"U-Mo","WERT",8756.45,"B"),
				new Product(105,"M-TV","CVBN",8907.87,"T"),
				new Product(106,"ERIUV","LOP",3456.45,"A")
				));
		
		prepo.findAll().forEach(System.out::println);
		
	}

}
