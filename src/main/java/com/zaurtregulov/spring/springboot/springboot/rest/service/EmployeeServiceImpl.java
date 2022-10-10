package com.zaurtregulov.spring.springboot.springboot.rest.service;


import com.zaurtregulov.spring.springboot.springboot.rest.dao.EmployeeDAO;
import com.zaurtregulov.spring.springboot.springboot.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
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

//    @Transactional
//    public void saveEmployee(Employee employee) {
//        employeeDAO.saveEmployee(employee);
//    }
//
//    @Transactional
//    public Employee getEmployee(int id) {
//        return employeeDAO.getEmployee(id);
//    }
//
//    @Transactional
//    public void deleteEmployee(int id) {
//        employeeDAO.deleteEmployee(id);
//
//    }
}
