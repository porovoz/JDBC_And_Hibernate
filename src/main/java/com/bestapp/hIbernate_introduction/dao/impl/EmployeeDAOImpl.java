package com.bestapp.hIbernate_introduction.dao.impl;

import com.bestapp.hIbernate_introduction.model.Employee;
import com.bestapp.hIbernate_introduction.dao.EmployeeDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.bestapp.hIbernate_introduction.utils.HibernateSessionFactoryUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public Employee create(Employee employee) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }
        return employee;
    }

    @Override
    public Employee readById(Integer id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Employee.class, id);
    }

    @Override
    public List<Employee> readAll() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Employee").list();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
          Transaction transaction = session.beginTransaction();
          session.update(employee);
          transaction.commit();
        }
        return employee;
    }

    @Override
    public Employee deleteEmployee(Employee employee, Integer id) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Employee.class, id);
            session.delete(employee);
            transaction.commit();
        }
        return employee;
    }
}