package com.marlabs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlabs.entity.Department;
import com.marlabs.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	private DepartmentService dService;
	
	public Department saveDept(Department dpt) {
		return dService.saveDepartment(dpt);
	}
}
