package com.example.employee_mgmt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
    public class EmployeeController {
        @Autowired
        private EmployeeService service;

        @GetMapping("/")
        public String home(Model model) {
            List<Employee> emplist= service.findAll();
            System.out.println( emplist);
            model.addAttribute("employees",emplist );
//            return "viewEmployees";
            return "viewEmployees";
        }

        @GetMapping("/add")
        public String addForm(Model model) {
            model.addAttribute("employee", new Employee());
            return "addEmployee";
        }

        @PostMapping("/save")
        public String save(Employee employee) {
            service.save(employee);
            return "redirect:/";
        }

        @GetMapping("/edit/{id}")
        public String editForm(@PathVariable Long id, Model model) {
            model.addAttribute("employee", service.findById(id).orElse(new Employee()));
            return "addEmployee";
        }

        @GetMapping("/delete/{id}")
        public String delete(@PathVariable Long id) {
            service.delete(id);
            return "redirect:/";
        }
    }
