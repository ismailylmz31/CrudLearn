package com.y1forcode.cruddemo.rest;

import com.y1forcode.cruddemo.dao.EmployeeDao;
import com.y1forcode.cruddemo.entity.Employee;
import com.y1forcode.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
   private EmployeeService employeeService;
    // quick and dirty : inject employee dao

    //private EmployeeDao employeeDao;
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    //expose /employee and return a list of employee
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

}
