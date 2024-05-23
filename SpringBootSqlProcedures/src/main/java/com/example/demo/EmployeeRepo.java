package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
		
	@Query(value="CALL GETALLEMPS()",nativeQuery=true)
	List<Employee> getAllemp();
	
	@Query(value="CALL GETEMPBYDEPT(?)",nativeQuery=true)
	List<Employee> getAllempbydept(String dept);
	
	
}
