package com.satyaaddala.Employee_Management_Application.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.satyaaddala.Employee_Management_Application.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
