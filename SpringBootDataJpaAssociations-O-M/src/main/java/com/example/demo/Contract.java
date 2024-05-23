package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Contract {
	@Id
	private Integer cid;
	private String cname;
	private String ccode;
	
	

}
