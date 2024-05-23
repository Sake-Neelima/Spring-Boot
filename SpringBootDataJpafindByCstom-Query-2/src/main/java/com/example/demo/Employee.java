package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	private Integer empid;
	private String empname;
	private Double empsal;
	private String empcode;
}
