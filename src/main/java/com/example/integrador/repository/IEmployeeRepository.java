package com.example.integrador.repository;

import com.example.integrador.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends MongoRepository<Employee,String> {
}
