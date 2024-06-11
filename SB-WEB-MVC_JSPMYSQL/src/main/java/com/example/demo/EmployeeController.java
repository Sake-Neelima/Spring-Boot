package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
	@GetMapping("/value")
	public String Register() {
	return "Register";
	}
	
	@PostMapping("/add")
	public String Registeradd(@ModelAttribute Employee employee,
			Model model
			) {
	
		Integer eid=service.saveEmployee(employee);
		System.out.println(eid);
		String message="Employee " + eid + " saved";
		model.addAttribute("msg", message);
		return "Register";
	}
	
	/*@GetMapping("/all")
	public String showAll(Model model) {
	List<Employee> list=service.getAllEmployees();
	model.addAttribute("data", list);
	return "EmpData";
	}*/
	
	@GetMapping("/delete")
	public String Remove(@RequestParam Integer eid,Model model) {
	service.deleteEmployee(eid);
	String message="Employee "+ eid +" Deleted";
	System.out.println(message);
	model.addAttribute("msg", message);
	return "redirect:all";
	}
	
	/*@GetMapping("/delete")
	public String Remove(@RequestParam Integer eid,Model model) {
		service.deleteEmployee(eid);
	return "redirect:all";
}*/
	
	
	
	
	@GetMapping("/Bupdate")
	public String Update(@RequestParam Integer eid,Model model)
	{
	Employee e=service.getOneEmployee(eid);
	model.addAttribute("employee", e);
	return "EmpEdit";
	
	}
	
	/*@GetMapping("/Bupdate")
	public String Update(@RequestParam Integer eid,Model model)
	{
		try {
			Employee e=service.getOneEmployee(eid);
			
			}	
		catch(EmployeeNotFoundException e){
				throw e;
			}
	
	return "EmpEdit";
	
	}*/
	
	
	
	
	
	@PostMapping("/Aupdate")
	public String Modify(@ModelAttribute Employee employee) 
			 {
		service.UpdateEmployee(employee);
	
		return "redirect:all";
	}
	
	
	/*@ExceptionHandler(value = EmployeeNotFoundException.class)
	public String handleEmpNotFound(Exception excp,Model model) {
		model.addAttribute("errorMsg", excp.getMessage());
		return "Error";
	}*/
	
	//-Pagintaion-----
	
	@GetMapping("/all")
	public String showAll(
			@PageableDefault(page=0,size=3) Pageable pageable,Model model) {
	Page<Employee> page=service.getAllEmployees(pageable);
	List<Employee> list=page.getContent();
	model.addAttribute("List",list);
	System.out.println(list);
	model.addAttribute("page",page);

	return "EmpData";
	}
	
	
	
	
	
	
	
	
	
	
	}

