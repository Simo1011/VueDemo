package com.Simo.SpringbootBackEnd.repository;

import com.Simo.SpringbootBackEnd.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {


}
