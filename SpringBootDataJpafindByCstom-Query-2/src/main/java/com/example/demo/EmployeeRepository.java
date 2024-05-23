package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//---------------@Query---------		
	
	@Query("SELECT s FROM Employee s")
	List<Employee> getAllemps();
	
	@Query("SELECT s FROM Employee s WHERE empsal>=?1")
	List<Employee> getAllempBysal(Double empsal);
	
	@Query("SELECT s FROM Employee s WHERE empsal>=?1 and empname=?2")
	List<Employee> getAllempInfo(Double empsal,String empname);
	
	@Query("SELECT s FROM Employee s WHERE empsal>=?1 or empname=?2")
	List<Employee> getAllempInfo2(Double empsal,String empname);
	
	@Query("SELECT s FROM Employee s WHERE empid between ?1 and ?2")
	List<Employee> getAllempInfo3(Integer empid1,Integer empid2);
	
	@Query(nativeQuery=true, value="SELECT * from Employee")
	List<Employee> getAllempInfo4();
	
	@Query("SELECT s FROM Employee s WHERE empid between :id1 and :id2")
	List<Employee> getAllempInfo5(Integer id2,Integer id1);
	
	@Query("SELECT s FROM Employee s WHERE empid in (:inputs)")
	List<Employee> getAllempInfo6(List<Integer> inputs);

	
	//--------------@Query using gprojections-----------------
	
	@Query("SELECT s FROM Employee s")
	List<Employee> getAllemp1();
	
	@Query("SELECT s.empid,s.empsal FROM Employee s ")
	List<Object[]> getAllemp2();
	
	@Query("SELECT s.empname FROM Employee s WHERE empid=?1 ")
	List<String> getAllemp3(Integer empid);
	
	//--------------@Query using gprojections only one row printed-----------------
	
	@Query("SELECT s FROM Employee s WHERE empid=?1")
	Employee getAllemp4(Integer empid);
	
	@Query("SELECT s.empname,s.empsal FROM Employee s WHERE empid=?1")
	Object getAllemp5(Integer empid);
	
	
	
	
	
}
