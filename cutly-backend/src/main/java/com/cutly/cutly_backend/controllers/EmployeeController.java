package com.cutly.cutly_backend.controllers;

import com.cutly.cutly_backend.model.Employee;
import com.cutly.cutly_backend.repository.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {

    // Repository
    private final EmployeeRepository employeeRepository;

    // JPA Injection
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;

    }

    // Done: 30/08/25
    // To add new employees
    @PostMapping
    public Employee EmployeeSave(@RequestBody Employee employee) {

        //UUID = Universal Unique ID
        var id = UUID.randomUUID().toString();

        //  id in String format
        employee.setId(id);

        employeeRepository.save(employee);
        System.out.println("Employee : " + employee.name + " was saved.");
        return employee;
    }

    // Search by id
    @GetMapping("{id}")
    public Employee searchById(@PathVariable String id){
        Optional<Employee> byId = employeeRepository.findById(id);
        return employeeRepository.findById(id).orElse(null);
    }

    // Search by Param
    @GetMapping
    public List<Employee> searchEmployee(@RequestParam("name") String name) {
        return employeeRepository.findByName(name);

    }

    // to change informations about the employee
    @PutMapping("{id}")
    public void updateEmployee (@PathVariable("id") String id,
                                @RequestBody Employee employee){

        employee.setId(id);
        employeeRepository.save(employee);

    }

    // Delete by id
    @DeleteMapping("{id}")
    public void deleteEmpolyee(@PathVariable("id") String id){
        employeeRepository.deleteById(id);
    }

}
