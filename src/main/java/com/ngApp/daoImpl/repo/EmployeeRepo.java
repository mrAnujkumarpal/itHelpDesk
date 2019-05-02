package com.ngApp.daoImpl.repo;

import com.ngApp.model.Employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    Employee findByEmail(String email);
}
