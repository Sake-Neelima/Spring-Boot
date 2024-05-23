package com.example.demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	private Integer stid;
	private String stname;
	private String stcode;
	private Integer Marks;
	private String Grade;
	
	
	@ElementCollection
	@CollectionTable(name="project" ,joinColumns=@JoinColumn(name="stid"))
	@Column(name="pelem")
	@OrderColumn(name="Lpos")
	List<String> projs;
	
	@ElementCollection
	@CollectionTable(name="Tasks" ,joinColumns=@JoinColumn(name="stid"))
	@Column(name="Telem")
	Set<String> Tasks;
	 
	@ElementCollection
	@CollectionTable(name="Modules" ,joinColumns=@JoinColumn(name="stid"))
	@Column(name="Melem")
	@MapKeyColumn(name="Mpos")
	Map<Integer,String> Modules;
	
}
