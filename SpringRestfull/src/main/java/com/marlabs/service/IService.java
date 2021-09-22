package com.marlabs.service;

import java.util.List;

import com.marlabs.entity.Employee;

public interface IService {

	List<Employee> fetchEmployees();
	
	Employee saveEmployee(Employee employee);
	Employee getEmpById(Long eid);
	void deleteEmp(Long eid);
	Employee updateEmployee(Employee employee);
}
