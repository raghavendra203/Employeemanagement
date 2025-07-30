package com.example.employee_management.repository;
import com.example.employee_management.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee, Long> {

}