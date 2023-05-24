package com.bestapp.hIbernate_introduction.services;

import com.bestapp.hIbernate_introduction.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee create(Employee employee);
    Employee readById(Integer id);
    List<Employee> readAll();
    Employee updateEmployee(Employee employee);
    Employee deleteEmployee(Employee employee, Integer id);
}
