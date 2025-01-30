package com.springweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springweb.dao.EmployeeDao;
import com.springweb.model.Employee;

@Service
@Transactional
public class EmployeeService {
	@Autowired
    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDAO) {
        this.employeeDao = employeeDAO;
    }

    public void saveEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
}