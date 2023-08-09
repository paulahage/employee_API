package com.example.employeemanagement.service;

import com.example.employeemanagement.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployees();
    Optional<EmployeeEntity > findById(Long id);
    EmployeeEntity saveEmployee(EmployeeEntity employee);
    EmployeeEntity updateEmployee(EmployeeEntity employee);
    void deleteEmployee(Long id);
}
