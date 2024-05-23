package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="Studtable")
public class Student {
	@Id
	@GeneratedValue
	@Column(name="SId",unique=true)
	private Integer SId;
	@NonNull
	@Column(name="SName",length=20,nullable=false)
	private String SName;
	@NonNull
	@Column(name="SDep",unique=true)
	private String Dept;
	

}
