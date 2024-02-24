package com.y1forcode.cruddemo.service;

import com.y1forcode.cruddemo.dao.EmployeeDAOJpaImpl;
import com.y1forcode.cruddemo.dao.EmployeeDao;
import com.y1forcode.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao theEmployeeDAO){
        employeeDao =theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {

        return employeeDao.findAll();
    }
}
