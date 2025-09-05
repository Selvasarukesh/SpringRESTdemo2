package com.example.SpringRESTdemo2.repo;

import com.example.SpringRESTdemo2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {


    // Custom query method to find employees by technology and salary
    // Assuming 'tech' is a field in Employee entity, adjust as necessary
    @Query("SELECT e FROM Employee e WHERE UPPER(e.department) = UPPER(:tech) AND e.salary >= :salary")
    List<Employee> getEmployeeBySalary(String tech, double salary);

}
