package com.ngApp.controller;

import com.ngApp.model.Employee.Employee;
import com.ngApp.service.Emp.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@RestController
public class EmployeeController  extends UtilClass {

    Date currentDate = new Date();
    @Autowired
    private EmpService empService;

    @PostMapping(value = "/addNewEmployee")
    public Employee addNewEmployee(@RequestBody Employee employee) {

        employee.setJoinedOn(currentDate);
        return empService.createNewEmployee(employee);
    }

    @RequestMapping(value = "/default", method = RequestMethod.GET)
    public ModelAndView deafultAfterLogin() {
        System.out.println(" ------------------------------ ");
        ModelAndView mv = new ModelAndView();

        Employee emp = logedInEmployee();

        String url = "";
        System.out.println("employeeID " + emp.getEmpId());
        if (emp.getEmpId() != 0) {
            System.out.println("Inside IF of default method");
           mv.setViewName("common/home");
            System.out.println("url ::" + url);
        } else {
            System.out.println("Inside else of default method");
            mv.setViewName("common/wrongAccess");

            System.out.println("url ::" + url);
        }
        System.out.println("Now return ");
        return mv;
    }
}
