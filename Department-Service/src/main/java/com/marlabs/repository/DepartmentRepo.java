package com.marlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marlabs.entity.Department;
@Repository
public interface DepartmentRepo extends JpaRepository<Long, Department> {

}
