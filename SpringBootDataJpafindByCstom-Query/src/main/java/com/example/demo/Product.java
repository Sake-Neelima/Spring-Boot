package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	private Integer prodid;
	private String prodname;
	private String prodcode;
	private Double prodcost;
	private String prodgrade;
}
