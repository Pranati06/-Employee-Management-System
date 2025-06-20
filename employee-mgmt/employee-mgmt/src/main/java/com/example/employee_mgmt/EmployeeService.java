package com.example.employee_mgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public Employee save(Employee e) { return repo.save(e); }
    public List<Employee> findAll() { return repo.findAll(); }
    public Optional<Employee> findById(Long id) { return repo.findById(id); }
    public void delete(Long id) { repo.deleteById(id); }
}

