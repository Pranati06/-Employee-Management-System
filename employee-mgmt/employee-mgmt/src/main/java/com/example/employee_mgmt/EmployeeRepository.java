package com.example.employee_mgmt;

import org.springframework.data.jpa.repository.JpaRepository;

import java.net.InterfaceAddress;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
