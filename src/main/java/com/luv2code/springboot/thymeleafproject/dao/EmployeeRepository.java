package com.luv2code.springboot.thymeleafproject.dao;

import com.luv2code.springboot.thymeleafproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

    //add a method to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();
    //So here the JpaRepository will read the method name decode it and create a method for the use case
}
