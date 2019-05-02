package com.ngApp.model.Ticket;

import com.ngApp.model.Employee.Employee;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Ticket")
public class Ticket implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "CreatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tkt_createdDate;


    @OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    private Employee createrBy;


    @Column(name = "UpdatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date exp_updatedDate;


    @Column(name = "Description")
    private String tkt_description;


    @OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    private TicketStatus ticketStatus;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTkt_createdDate() {
        return tkt_createdDate;
    }

    public void setTkt_createdDate(Date tkt_createdDate) {
        this.tkt_createdDate = tkt_createdDate;
    }

    public Employee getCreaterBy() {
        return createrBy;
    }

    public void setCreaterBy(Employee createrBy) {
        this.createrBy = createrBy;
    }

    public Date getExp_updatedDate() {
        return exp_updatedDate;
    }

    public void setExp_updatedDate(Date exp_updatedDate) {
        this.exp_updatedDate = exp_updatedDate;
    }

    public String getTkt_description() {
        return tkt_description;
    }

    public void setTkt_description(String tkt_description) {
        this.tkt_description = tkt_description;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
}



