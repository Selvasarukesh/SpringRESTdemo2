package com.example.SpringRESTdemo2.controller;

import com.example.SpringRESTdemo2.model.Employee;
import com.example.SpringRESTdemo2.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v2/")
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;


    @PostMapping("addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        employeeRepo.save(employee);
        return "Employee added successfully";
    }

    @GetMapping("getEmployees")
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    @GetMapping("getEmployee/{id}")
    public List<Employee> getEmployee(@PathVariable int id) {
        return  employeeRepo.findAllById(Collections.singleton(id));
    }

    @GetMapping("getEmployee/{tech}/{salary}")
    public List<Employee> getEmployeeBySalary(@PathVariable("tech") String tech ,@PathVariable("salary") double salary) {
        return  employeeRepo.getEmployeeBySalary(tech,salary);
    }

}
