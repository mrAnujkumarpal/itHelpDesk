package com.ngApp.controller;

import com.ngApp.daoImpl.repo.EmployeeRepo;
import com.ngApp.model.Employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class UtilClass {

    @Autowired
    EmployeeRepo employeeRepository;

    public Employee logedInEmployee() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return employeeRepository.findByEmail(authentication.getName());
    }
}
