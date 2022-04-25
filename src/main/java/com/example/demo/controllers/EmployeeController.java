package com.example.demo.controllers;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.IRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
    private final IRepository<Employee> EmployeeRepository = new EmployeeRepository();

    @GetMapping("/employees")
    public String allEmployees(Model model) {
        model.addAttribute("employees", EmployeeRepository.getAllEntities());
        return "employees";
    }

    @GetMapping("/employee")
    public String oneEmployees(Model model, @RequestParam("id") int id) {
        model.addAttribute("employee", EmployeeRepository.getSingleById(id));
        return "employee";
    }

    @GetMapping("/addEmployee")
    public String addEmployee() {
        return "addEmployee";
    }

    @PostMapping("/employeeAdd")
    public String employeeAdd(@RequestParam("id") int ID, @RequestParam("name") String Name,
                              @RequestParam("job") String job, @RequestParam("manager") int Manager,
                              @RequestParam("hire_date") String hire_date, @RequestParam("salary") int salary,
                              @RequestParam("commission") int commission, @RequestParam("departmentno") int department) {
        Employee emp = new Employee(ID, Name, job, Manager, hire_date, salary, commission, department);
        EmployeeRepository.create(emp);
        return "redirect:/employees";
    }
}
