package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    @Query("SELECT e.ename, e.esal, p.budget FROM Employee e INNER JOIN e.pro p WHERE p.pid = ?1")
    List<Object[]> getByEmpid(Integer  pid);
}
