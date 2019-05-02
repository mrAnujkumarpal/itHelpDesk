package com.ngApp.model.Employee;

import com.ngApp.model.Ticket.TicketStatus;
import com.ngApp.model.common.Location;
import com.ngApp.model.common.Project;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Employees")
public class Employee implements Serializable {

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "Employee_Project",
            joinColumns = {@JoinColumn(name = "EMP_ID")},
            inverseJoinColumns = {@JoinColumn(name = "PRO_ID")}
    )
    Set<Project> projects = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_ID", unique = true, nullable = false)
    private Long empId;
    @Column(name = "EMP_NAME")
    private String empName;
    @Column(name = "JOINED_ON")
    private Date joinedOn;

    @Column(name="EMAILID")
    private String  email;
    @Column(name="PASSWORD")
    private String password;

    @OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    private Location loc;





    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getJoinedOn() {
        return joinedOn;
    }

    public void setJoinedOn(Date joinedOn) {
        this.joinedOn = joinedOn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

