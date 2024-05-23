package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="procdures")
public class Employee {
	@Id
	 private Integer eid;
	    private String ename;
	    //@Column(name="esal",nullable=true)
	    private Double sal;
	    private String dep;
	    private String desig;
}
