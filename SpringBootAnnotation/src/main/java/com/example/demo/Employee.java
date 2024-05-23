package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("Nit")
	private String code;
	@Value("101")
	private int number;
	@Override
	public String toString() {
		return "Employee [code=" + code + ", number=" + number + "]";
	}
	
	

}
