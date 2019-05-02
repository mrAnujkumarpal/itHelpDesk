package com.ngApp.service.Emp;

import com.ngApp.daoImpl.Emp.EmpDaoImpl;
import com.ngApp.model.Employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImlp implements EmpService {

    @Autowired
    private EmpDaoImpl empDao;

    @Override
    public Employee createNewEmployee(Employee emp) {
     return    empDao.createEmployee(emp);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empDao.getAllEmployees();
    }
}
