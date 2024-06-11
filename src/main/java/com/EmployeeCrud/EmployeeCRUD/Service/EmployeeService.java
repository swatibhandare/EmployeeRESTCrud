package com.EmployeeCrud.EmployeeCRUD.Service;

import com.EmployeeCrud.EmployeeCRUD.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int Id);

    Employee save(Employee employee);

    void delete(int id);
}
