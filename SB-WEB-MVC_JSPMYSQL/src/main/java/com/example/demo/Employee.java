package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Nimbu")
public class Employee {
	@Id
	@GeneratedValue
	private Integer eid;
	private String ename;
	private Double esal;
	private String edept;
	private Double hra;
	private Double da;
	
}
