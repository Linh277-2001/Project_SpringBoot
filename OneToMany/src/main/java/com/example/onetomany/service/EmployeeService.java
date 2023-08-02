package com.example.onetomany.service;

import com.example.onetomany.model.Department;
import com.example.onetomany.model.Employee;
import com.example.onetomany.repository.DepartmentRepository;
import com.example.onetomany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository EmployeeRepository;
    @Autowired
    private DepartmentRepository DepartmentRepository;
    public List<Employee> getAllEmployee(){

        return EmployeeRepository.findAll();
    }
    public List<Department> getAllDepartment(){

        return DepartmentRepository.findAll();
    }
    public Employee getEmployeeById(int id){

        return EmployeeRepository.findById(id).orElse(null);
    }

    public void saveEmployee(Employee employee) {

        EmployeeRepository.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees) {
        return EmployeeRepository.saveAll(employees);
    }

    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee= EmployeeRepository.findById(employee.getId()).orElse(null);
        existingEmployee.setName(employee.getName());
        existingEmployee.setGender(employee.getGender());
        existingEmployee.setProvince(employee.getProvince());
        existingEmployee.setSalary(employee.getSalary());
        return EmployeeRepository.save(existingEmployee);

    }
}
