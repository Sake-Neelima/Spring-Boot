package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employee;

@Controller
public class EmployeeController {
	@GetMapping("/showreg")
	public String ShowReg() {
		
		return "Register";
	}
	
	@PostMapping("/data")
	public String ShowData(@ModelAttribute Employee employee, Model model) {
		System.out.println(employee);
		model.addAttribute("Emp",employee);
		return "Data";
	}
}
