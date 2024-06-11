package com.example.demo.model;

import java.util.List;

import lombok.Data;

@Data
public class Employee {
	
private Integer empId;
private String empName;
private Double empSal;
private String empPwd;
private String empGen;
private String empDep;
private String empAdd;

private List<String> empLang;
private List<String> empProj;
}
