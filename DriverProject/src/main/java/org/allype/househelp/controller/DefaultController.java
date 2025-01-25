package org.allype.househelp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

	@GetMapping("/api/v1/home")
	public String defaultLanding() {
		System.out.println("request received");
		return "Welcome to HouseHelp our services will be available soon";
	}
}
