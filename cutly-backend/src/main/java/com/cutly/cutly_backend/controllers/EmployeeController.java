package com.cutly.cutly_backend.controllers;

import com.cutly.cutly_backend.model.Employee;
import com.cutly.cutly_backend.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {

    // Repository
    private EmployeeRepository employeeRepository;

    // JPA Injection

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping
    public Employee EmployeeSave(@RequestBody Employee employee) {

        employeeRepository.save(employee);
        System.out.println("Employee : " + employee.name + " was saved.");
        return employee;
    }
}
