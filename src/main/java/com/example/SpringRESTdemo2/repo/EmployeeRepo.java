package com.example.SpringRESTdemo2.repo;

import com.example.SpringRESTdemo2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
