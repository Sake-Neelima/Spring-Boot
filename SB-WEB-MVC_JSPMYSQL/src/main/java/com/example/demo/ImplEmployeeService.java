package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public  class ImplEmployeeService implements IEmployeeService {
	@Autowired
	private EmployeeRepository erepo;
	
	@Autowired
	private EmployeePagingAndSortingRepository epageRepo;
	
	
	
	@Override
	public Integer saveEmployee(Employee e) {
		double esal=e.getEsal();
		double hra=esal*20/100.0;
		double da=esal*10/100.0;
		e.setHra(hra);
		e.setDa(da);
		e=erepo.save(e);
		return e.getEid();
		
	}
	@Override
	public  List<Employee> getAllEmployees(){
		return erepo.findAll();
	}
	

	public void deleteEmployee(Integer id) {
	     erepo.deleteById(id);
	}

	/*public void deleteEmployee(Integer id) {
		Employee e=getOneEmployee(id);
			erepo.delete(e);
		
		
//	    if(erepo.existsById(id)) {
//	    	erepo.deleteById(id);
//	    }
//	    else {
//	    	throw new EmployeeNotFoundException("Unable to Find" +id);
//	    }
	}*/

	
	
	
	
	public Employee getOneEmployee(Integer id) {
//		Employee e=erepo.findById(id).orElseThrow(()-> new EmployeeNotFoundException("Employee"+ id +"Not Exist"));
//		return e;
		
	Optional<Employee> opt=erepo.findById(id);
	if(opt.isPresent()) {
		Employee e=opt.get();
		return e;
	}else {
		throw new EmployeeNotFoundException("Unable to Find" +id);
	}
	}
  
	
	public void UpdateEmployee(Employee e) {
		if(erepo.existsById(e.getEid())) {
		double esal=e.getEsal();
		double hra=esal*20/100.0;
		double da=esal*10/100.0;
		e.setHra(hra);
		e.setDa(da);
		e=erepo.save(e);
		}else {
		return ;
	}
	}
	
	@Override
	public Page<Employee> getAllEmployees(Pageable pageable) {
		Page<Employee> page=erepo.findAll(pageable);
		return page;
	}
	
	
}
