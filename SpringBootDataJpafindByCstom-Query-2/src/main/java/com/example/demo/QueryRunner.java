package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class QueryRunner implements CommandLineRunner {
	@Autowired EmployeeRepository erepo;
	@Override
	public void run(String... args) throws Exception {
		//------------@Query-------------------
		
		// TODO Auto-generated method stub
		//erepo.getAllemps().forEach(System.out::println);
		//erepo.getAllempBysal(50000.0).forEach(System.out::println);
		//erepo.getAllempInfo(50000.0,"John Doe").forEach(System.out::println);
		//erepo.getAllempInfo2(60000.0,"John Doe").forEach(System.out::println);
		//erepo.getAllempInfo3(1,4).forEach(System.out::println);
		//erepo.getAllempInfo4().forEach(System.out::println);
		//erepo.getAllempInfo5(4,1).forEach(System.out::println);
		//erepo.getAllempInfo6(Arrays.asList(1,3,5)).forEach(System.out::println);
		
		//--------------@Query using projections-----------
		
		//erepo.getAllemp1().forEach(System.out::println);
		/*List<Object[]> list=erepo.getAllemp2();
		for(Object[] ob:list) {
			System.out.println(ob[0]+"--"+ob[1]);
		}*/
		
		//erepo.getAllemp3(1).forEach(System.out::println);
		
		//--------------@Query using projections only one row printed-----------
		Employee e= erepo.getAllemp4(1);
				System.out.println(e);
				
		Object[] o=(Object [])erepo.getAllemp5(1);
		System.out.println(o[0]+"-----"+o[1]);
		
	}

}
