package com.ngApp.daoImpl.Emp;

import com.ngApp.daoImpl.repo.EmployeeRepo;
import com.ngApp.model.Employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpDaoImpl {

@Autowired
    EmployeeRepo empRepo;

    public Employee createEmployee(Employee emp) {
        return    empRepo.save(emp);
    }


    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }

}
