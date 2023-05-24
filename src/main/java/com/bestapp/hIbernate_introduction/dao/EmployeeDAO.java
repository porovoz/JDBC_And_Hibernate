package com.bestapp.hIbernate_introduction.dao;

import com.bestapp.hIbernate_introduction.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    Employee create(Employee employee);
    Employee readById(Integer id);
    List<Employee> readAll();
    Employee updateEmployee(Employee employee);
    Employee deleteEmployee(Employee employee, Integer id);
}
