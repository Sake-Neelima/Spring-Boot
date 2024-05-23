package com.nit.naresh;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(90)
public class MessageRunnerC implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Message-C");

	}

}
