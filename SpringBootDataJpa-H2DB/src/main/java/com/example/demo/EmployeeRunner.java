package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*repo.save(new Employee(101,"neelu",7869.0));
		repo.save(new Employee(102,"nikki",6569.0));
		repo.save(new Employee(103,"hari",7659.0));
		repo.save(new Employee(104,"meghana",8969.0));
		repo.save(new Employee(105,"vamis",2369.0));
		repo.save(new Employee(106,"sam",8979.0));*/
		
		
		/*repo.save(new Employee("neelu",7869.0));
		repo.save(new Employee("nikki",6569.0));
		repo.save(new Employee("hari",7659.0));
		repo.save(new Employee("meghana",8969.0));
		repo.save(new Employee("vamis",2369.0));
		repo.save(new Employee("sam",8979.0));*/
		
		
		
		
		repo.saveAll(Arrays.asList(new Employee("neelu",7869.0),
								new Employee("nikki",7869.0),
								new Employee("nimbu",7869.0),
								new Employee("neeli",7869.0),
								new Employee("drum",7869.0),
								new Employee("sana",7869.0),
								new Employee("pattu",7869.0),
								new Employee("nillu",7869.0)
				));
		
		System.out.println(repo.count());
		
		/*Iterable<Employee> data=repo.findAll();
		
		//using for each
		for(Employee e:data){
			System.out.println(e);
		}
		
		//using lambda expression
		data.forEach(e->System.out.println(e));
		  
		// using method reference
		System.out.println("Result is:");
		repo.findAll().forEach(System.out::println);  
			
		// using iterator 
		Iterator<Employee> itrs =data.iterator();
		while(itrs.hasNext()) {
			Employee e=itrs.next();
			System.out.println(e);
		}*/
		
		/*Optional<Employee> opt=repo.findById(309);
		if(opt.isPresent()) {
			Employee e=opt.get();
			System.out.println(e);
		}
		else {
			System.out.println("Data Not Found");
			
		}*/
		
		
		/*boolean result=repo.existsById(12);
		System.out.println(result);*/
		
		
		Iterable<Employee> data=repo.findAllById(Arrays.asList(1,5,3,7));
		data.forEach(System.out::println);
		System.exit(0);
		
	}

}
