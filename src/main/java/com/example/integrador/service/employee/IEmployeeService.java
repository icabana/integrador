package com.example.integrador.service.employee;

import com.example.integrador.model.Employee;

public interface IEmployeeService {
     Iterable<Employee> getAll();
     Employee save(Employee employee);
}
