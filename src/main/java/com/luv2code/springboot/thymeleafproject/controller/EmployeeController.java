package com.luv2code.springboot.thymeleafproject.controller;


import com.luv2code.springboot.thymeleafproject.entity.Employee;
import com.luv2code.springboot.thymeleafproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    //to get a list of employees at /list
    @GetMapping("/list")
    public String listEmployees(Model model){

        //Get Employees from the database
        List<Employee> employees = employeeService.findAll();

        //add it to the model
        model.addAttribute("employees",employees);

        return "employees/list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String showAddForm(Model model){

        //the model attribute to bind form data
        Employee theEmployee = new Employee();

        model.addAttribute("employee",theEmployee);

        return "employees/employee-form";
    }

    @GetMapping("/showFormForUpdate")
    public String updateForm(@RequestParam("employeeId") int id, Model model){

        //Get the Employee
        Employee theEmployee = employeeService.findById(id);

        //Set the model
        model.addAttribute("employee",theEmployee);

        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployees(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);

        return "redirect:/employees/list";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId") int theId){
        //Delete the employee
        employeeService.deleteById(theId);

        //Redirect to /list
        return "redirect:/employees/list";
    }
}
