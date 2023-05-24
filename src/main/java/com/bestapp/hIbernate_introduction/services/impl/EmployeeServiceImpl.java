package com.bestapp.hIbernate_introduction.services.impl;

import com.bestapp.hIbernate_introduction.dao.EmployeeDAO;
import com.bestapp.hIbernate_introduction.model.Employee;
import com.bestapp.hIbernate_introduction.services.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public Employee create(Employee employee) {
        employeeDAO.create(employee);
        return employee;
    }

    @Override
    public Employee readById(Integer id) {
        return employeeDAO.readById(id);
    }

    @Override
    public List<Employee> readAll() {
        return employeeDAO.readAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
        return employee;
    }

    @Override
    public Employee deleteEmployee(Employee employee, Integer id) {
        employeeDAO.deleteEmployee(employee, id);
        return employee;
    }
}
