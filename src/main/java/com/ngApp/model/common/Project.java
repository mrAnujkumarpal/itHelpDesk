package com.ngApp.model.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ngApp.model.Employee.Employee;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Project")
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_id")
    private int id;

    @Column(name = "pro_name")
    private String pro_name;

    @Column(name = "pro_code")
    private String pro_code;

    @Column(name = "CreatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pro_createdDate;

    @Column(name = "active")
    private boolean pro_active;

    @OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    private Team team;

    @OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JsonManagedReference
    public Employee TL_ID;

    @OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JsonManagedReference
    public Employee DM_ID;

    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_code() {
        return pro_code;
    }

    public void setPro_code(String pro_code) {
        this.pro_code = pro_code;
    }

    public Date getPro_createdDate() {
        return pro_createdDate;
    }

    public void setPro_createdDate(Date pro_createdDate) {
        this.pro_createdDate = pro_createdDate;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public boolean isPro_active() {
        return pro_active;
    }

    public void setPro_active(boolean pro_active) {
        this.pro_active = pro_active;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
