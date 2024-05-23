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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name="EmpTable")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="EmpId")
	private Integer empId;
	@Column(name="EmpName")
	@NonNull
	private String EmpName;
	@Column(name="EmpSal")
	@NonNull
	private Double Salary;
}
