package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController{
	@GetMapping("/param")
	public String Show(
			
			//---------for Integer alternatives--------------
				//@RequestParam("sid") int sId,
//--Here default value is null then null value cant stroe in integer type so we can convert into Integer type or provide default value
				//@RequestParam(value="sid", required=false) Integer sId,
				@RequestParam(value="sid", required=false,defaultValue = "-1") int sId,
				
			
				
			//----------for String alternatives----------
			//@RequestParam(value="sname", required=false) String sName,
			//@RequestParam(value="sname", required=false,defaultValue = "nimbu") String sName,
			@RequestParam("sname") String sName,
			
			
			@RequestParam("proj") List<String> Proj,
			
			Model model
			) 
	{
		System.out.println(sId+""+sName);
		model.addAttribute("SID",sId);
		model.addAttribute("SNAME",sName);
		model.addAttribute("SPROJ",Proj);
		
		return "StdData";
	}

}