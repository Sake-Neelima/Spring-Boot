package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DatainserRunner implements CommandLineRunner {
	@Autowired 
	private BookRepo brepo;
	@Autowired 
	private AuthorRepo arepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Author a1 = new Author(11, "Author 1", "Nationality 1");
		Author a2 = new Author(22, "Author 2", "Nationality 2");
		Author a3 = new Author(33, "Author 3", "Nationality 3");
		
		arepo.saveAll(Arrays.asList(a1,a2,a3));
		
		Book b1 = new Book(1, "Book 1", "Author 1", 29.99,Arrays.asList(a1,a3));
		Book b2 = new Book(2, "Book 2", "Author 2", 19.99,Arrays.asList(a1,a2));
		Book b3 = new Book(3, "Book 3", "Author 3", 24.99,Arrays.asList(a2,a3));
		
		brepo.saveAll(Arrays.asList(b1,b2,b3));

	}

}
