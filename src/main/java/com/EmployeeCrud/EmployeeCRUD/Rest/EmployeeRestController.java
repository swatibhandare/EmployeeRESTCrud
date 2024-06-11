package com.EmployeeCrud.EmployeeCRUD.Rest;

import com.EmployeeCrud.EmployeeCRUD.Entity.Employee;
import com.EmployeeCrud.EmployeeCRUD.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employee/{id}")
    public Employee findById(@PathVariable int id){
        return employeeService.findById(id);
    }

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        employeeService.delete(id);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
       Employee updatedEmployee = employeeService.save(employee);
       return updatedEmployee;
    }


}
