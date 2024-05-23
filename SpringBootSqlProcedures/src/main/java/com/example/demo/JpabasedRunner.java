package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Component
public class JpabasedRunner implements CommandLineRunner {
@Autowired
private EntityManager em;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	/*Employee e=em.find(Employee.class, 101);
	System.out.println(e);*/
		  
		
		//-------------NO-IN_NO-OUT PARAM-------------
		/*
		StoredProcedureQuery qu=em.createStoredProcedureQuery("GETALLEMPS",Employee.class);
		
		List<Employee> em=qu.getResultList();
		
		em.forEach(System.out::println);*/
		
		//-------------IN parameter-----
		
		/*StoredProcedureQuery qu=em.createStoredProcedureQuery("GETEMPBYDEPT",Employee.class);
		
		qu.registerStoredProcedureParameter("dept",String.class,ParameterMode.IN);
		
		qu.setParameter("dept", "software");
		
		List<Employee> ems=qu.getResultList();
		
		ems.forEach(System.out::println);*/
		
		
		//-------------IN parameter and OUT parameter-----
		
		StoredProcedureQuery qu=em.createStoredProcedureQuery("GETEMPBYINOUT",Employee.class);
		
		qu.registerStoredProcedureParameter("des",String.class,ParameterMode.IN);
		qu.registerStoredProcedureParameter("dcount",String.class,ParameterMode.OUT);
		
		qu.setParameter("des", "los angeles");
		
		qu.execute();
		
		String countString = (String) qu.getOutputParameterValue("dcount");
		int count = Integer.parseInt(countString);

		
		
		
		System.out.println("Count: "+ count);
		
		
		
	}

}
