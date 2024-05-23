package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="my.app")
public class MyRunner implements CommandLineRunner {
	private DbConn con;
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(con);
	}
	public DbConn getCon() {
		return con;
	}
	public void setCon(DbConn con) {
		this.con = con;
	}

}
