package com.hdfc.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping("/account")
	public String getStudentInfo() {
		return "this is test account service. its up and running";
	}
}
