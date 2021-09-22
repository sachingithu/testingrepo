package com.marlabs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlabs.entity.Employee;
import com.marlabs.repo.EmployeeRepo;
@Service
public class ServiceImpl implements IService {
	@Autowired
	private EmployeeRepo eRepo;
	@Override
	public List<Employee> fetchEmployees() {
		// TODO Auto-generated method stub
		return eRepo.findAll();
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return eRepo.save(employee);
	}
	@Override
	public Employee getEmpById(Long eid) {
		
	Optional<Employee>emp=eRepo.findById(eid);
	if(emp.isPresent()) {
		return emp.get();
	}else {
		throw new IllegalArgumentException("Employee Not Present For Id :"+eid);
	}
		
	}
	@Override
	public void deleteEmp(Long eid) {
		 eRepo.deleteById(eid);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return eRepo.save(employee);
	}

}
