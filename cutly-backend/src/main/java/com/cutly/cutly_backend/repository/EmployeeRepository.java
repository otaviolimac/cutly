package com.cutly.cutly_backend.repository;

import com.cutly.cutly_backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
