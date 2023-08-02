package com.example.onetomany.controller;

import com.example.onetomany.model.Department;
import com.example.onetomany.model.Employee;
import com.example.onetomany.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> findAllEmployee(){

        return service.getAllEmployee();
    }
    @GetMapping("/department")
    public List<Department> findAllDepartments(){

        return service.getAllDepartment();
    }

    @GetMapping("/employee/{id}")
    public Employee finEmployee(@PathVariable Integer id){

        return service.getEmployeeById(id);
    }
    @PostMapping("/insertEmployee")
    public int insertEmployee(@RequestBody Employee employee){
         service.saveEmployee(employee);
        return employee.getId();
    }

    @PostMapping("/insertEmployees")
    public List<Employee> insertEmployees(@RequestBody List<Employee> employees){
        return service.saveEmployees(employees);
    }

    @PostMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){

        return service.updateEmployee(employee);
    }
}
