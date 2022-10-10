package com.zaurtregulov.spring.springboot.springboot.rest.dao;


import com.zaurtregulov.spring.springboot.springboot.rest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    public List<Employee> getAllEmployees() {
        Session session = entityManager.unwrap(Session.class);

        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public Employee getEmployee(int id) {
        return null;
    }

    @Override
    public void deleteEmployee(int id) {

    }

//    public void saveEmployee(Employee employee) {
//        Session session = sessionFactory.getCurrentSession();
//
//
//            session.saveOrUpdate(employee);
//
//    }
//
//    public Employee getEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//
//        Employee employee = session.get(Employee.class, id);
//        return employee;
//    }
//
//    public void deleteEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Query<Employee> query = session.createQuery("delete from Employee " + "where id =:employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();
//    }
}
