package com.y1forcode.cruddemo.dao;

import com.y1forcode.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();
}
