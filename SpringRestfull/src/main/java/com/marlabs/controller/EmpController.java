package com.marlabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marlabs.entity.Employee;
import com.marlabs.service.IService;

@RestController
public class EmpController {
	@Autowired
	private IService iService;
	@GetMapping("/userlist")
	public List<Employee> fetchEmployee(){
		return iService.fetchEmployees();
	}
	
	@PostMapping("/saveemp")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return iService.saveEmployee(employee);
	}
	
	@GetMapping("/fetch/{id}")
	public Employee getEmpById(@PathVariable Long id) {
		return iService.getEmpById(id);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteEmp(@PathVariable Long id) {
		iService.deleteEmp(id);
		
	}
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable Long id,
								   @RequestBody Employee employee) {
		employee.setEid(id);
		return iService.updateEmployee(employee);
	}
}
