package com.example.demo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity

@AllArgsConstructor
@NoArgsConstructor
public class Vendor {
	@Id
	private Integer vid;
	private String vname;
	private Double vsal;
	
	
	
	@OneToMany
	@JoinColumn(name="vidfk")
	List<Contract>  Con;
}


