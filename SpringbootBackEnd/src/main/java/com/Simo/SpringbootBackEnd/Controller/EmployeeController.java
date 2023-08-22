package com.Simo.SpringbootBackEnd.Controller;

import com.Simo.SpringbootBackEnd.entity.Employee;
import com.Simo.SpringbootBackEnd.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @RequestMapping("/employees")
    public List<Employee> fetchEmployee()
    {


        return employeeRepository.findAll();
    }

}
