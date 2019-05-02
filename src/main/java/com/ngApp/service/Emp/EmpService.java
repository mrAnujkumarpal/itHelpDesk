package com.ngApp.service.Emp;

import com.ngApp.model.Employee.Employee;

import java.util.List;

public interface EmpService {

    public Employee createNewEmployee(Employee emp);

    public List<Employee> getAllEmployees();
}
