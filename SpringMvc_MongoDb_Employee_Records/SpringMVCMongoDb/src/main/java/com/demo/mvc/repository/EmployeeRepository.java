package com.demo.mvc.repository;

import com.demo.mvc.Entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {

    Employee findByEmpId(String empId);
}
