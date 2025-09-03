package com.example.SpringRESTdemo2.controller;

import com.example.SpringRESTdemo2.model.Employee;
import com.example.SpringRESTdemo2.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
