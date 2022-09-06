package com.hdfc.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
 
	
	@GetMapping("/loan")
	public String getStudentInfo()
	{
       return  "this is test loan service. its up and running";		
	}
}
