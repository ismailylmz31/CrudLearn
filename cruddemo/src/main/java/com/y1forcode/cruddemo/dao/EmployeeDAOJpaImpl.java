package com.y1forcode.cruddemo.dao;

import com.y1forcode.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDao {
// define field for entity manager
private EntityManager entityManager;



    //set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager){
        entityManager =theEntityManager;
    }
    @Override
    public List<Employee> findAll() {
        // create query
        TypedQuery<Employee> theQuery =entityManager.createQuery("FROM Employee ", Employee.class);


        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();
        //return results
        return employees;
    }
}
