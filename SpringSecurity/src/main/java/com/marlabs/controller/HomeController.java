package com.marlabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String showHome() {
		System.out.println("HomeController.showHome()");
		return "Home";
	}

	@GetMapping("/welcome")
	public String showWelcome() {
		System.out.println("HomeController.showWelcome()");
		return "WelcomePage";
	}

	@GetMapping("/admin")
	public String showAdmin() {
		System.out.println("HomeController.showAdmin()");
		return "AdminPage";
	}

	@GetMapping("/emp")
	public String showEmp() {
		System.out.println("HomeController.showEmp()");
		return "EmployeePage";
	}

	@GetMapping("/std")
	public String showStd() {
		System.out.println("HomeController.showStd()");
		return "StudentPage";
	}

	/*
	 * @GetMapping("/denied") public String showDenied() { return "DeniedPage"; }
	 */

}