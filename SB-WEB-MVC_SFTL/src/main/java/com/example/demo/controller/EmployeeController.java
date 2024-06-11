package com.example.demo.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employee;

@Controller
public class EmployeeController {
	@GetMapping("/update")
	public String Data(Model model) {
		Employee e=new Employee();
		e.setEmpId(98);
		e.setEmpName("vamsi");
		e.setEmpSal(345.76);
		e.setEmpPwd("sprinboot");
		e.setEmpGen("female");
		e.setEmpDep("civil");
		e.setEmpAdd("geethanagr");
		
		e.setEmpLang(Arrays.asList("maths,science"));
		e.setEmpProj(Arrays.asList("WT,SE"));
		
		model.addAttribute(e);	
		return "Home";
	}
	
	@PostMapping("/show")
	public String Datashow(@ModelAttribute Employee employee,Model model) {
		
		model.addAttribute("emp",employee);	
		return "EmpData";
	}
	
}
