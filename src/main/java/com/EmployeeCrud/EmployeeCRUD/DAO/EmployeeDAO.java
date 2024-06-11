package com.EmployeeCrud.EmployeeCRUD.DAO;

import com.EmployeeCrud.EmployeeCRUD.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void delete(int id);
}
