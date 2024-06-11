package com.EmployeeCrud.EmployeeCRUD.DAO;

import com.EmployeeCrud.EmployeeCRUD.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // no need to write methods to DB calls

}
