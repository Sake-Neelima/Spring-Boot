package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired ProductRepository prepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		prepo.saveAll(Arrays.asList(new Product("erty","neelu"),
				new Product("asd","nikki"),
				new Product("iuyiu","neeli"),
				new Product("mno","nimbu"),
				new Product("lmo","neeli"),
				new Product("oiu","drum")
			
));
		 
		/*Sort sort=Sort.by(Direction.DESC,"pname");
		Iterable<Product> result=prepo.findAll(sort);
		result.forEach(System.out::println);*/

		Pageable page=PageRequest.of(1,2);
		prepo.findAll(page).forEach(System.out::println);
		
		
		Product p=new Product();
		p.setPorder("neeli");
		Example<Product> ex=Example.of(p);
		prepo.findAll(ex).forEach(System.out::println);
		
	}

}
