package com.hdfc.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {
 
	
	@GetMapping("/student")
	public String getStudentInfo()
	{
       return  "Sandeep Sable";		
	}
}
