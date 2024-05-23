package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CLARunner implements CommandLineRunner {
	@Value("${title}")
	private String title;
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(title);
		//System.out.println(Arrays.asList(args));
		//here we have to pass values at runtime in arguments to print the data 
		
	}

}
