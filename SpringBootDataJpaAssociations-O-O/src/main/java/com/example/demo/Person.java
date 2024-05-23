package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
	@Id
	private Integer pid;
	private String pname;
	private String padd;
	
	@ManyToOne
	@JoinColumn(name="profidfk",unique=true)
	private Profile pr;
}
