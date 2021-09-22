package com.marlabs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marlabs.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
