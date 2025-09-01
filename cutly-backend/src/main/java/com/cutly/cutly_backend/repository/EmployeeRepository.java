package com.cutly.cutly_backend.repository;

import com.cutly.cutly_backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByName(String name);

    Optional<Employee> findById(String id);

    void deleteById(String id);
}
