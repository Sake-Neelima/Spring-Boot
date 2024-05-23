package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DataRunner implements CommandLineRunner {
	@Value("${title}")
	private String title;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DONE"+title);
	}

}
