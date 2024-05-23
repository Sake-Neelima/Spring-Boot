package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class profiles implements CommandLineRunner {
	@Value("${database}")
	private String db;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(db);

	}

}
