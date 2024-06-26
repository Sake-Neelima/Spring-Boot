package com.example.demo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService {
	Integer saveEmployee(Employee e) ;
	List<Employee> getAllEmployees();
	void deleteEmployee(Integer id);
	Employee getOneEmployee(Integer id);
	 void UpdateEmployee(Employee e);
	 Page<Employee> getAllEmployees(Pageable pageable);
	 
	 
}