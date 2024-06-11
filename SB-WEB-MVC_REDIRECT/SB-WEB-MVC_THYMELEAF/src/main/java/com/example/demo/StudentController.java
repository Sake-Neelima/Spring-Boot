package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

	@GetMapping("/std")
	public String showFormWithData(Model model) {
		Student std=new Student();
		std.setStdid(101);
		std.setStdname("nimbu");
		std.setStdmarks(99);
		std.setStdgrade("A");
		model.addAttribute("Data", std);
		return "StudentReg";
	}
	
	@GetMapping("/show")
	public String show(Model model) {
		model.addAttribute("student", new Student());
		return "Login";
	}
	
	
	@PostMapping("/save")
	public String ShowData(@ModelAttribute Student student,Model model) {
		
		model.addAttribute("sob", student);
		return "StdData";
	}
}
