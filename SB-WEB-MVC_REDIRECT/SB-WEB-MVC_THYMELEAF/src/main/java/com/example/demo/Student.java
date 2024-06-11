package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private Integer stdid;
	private String stdname;
	private Integer stdmarks;
	private String stdgrade;
	
	
}
