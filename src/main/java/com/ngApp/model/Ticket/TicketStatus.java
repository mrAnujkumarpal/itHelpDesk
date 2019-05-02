package com.ngApp.model.Ticket;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ticket_status")

public class TicketStatus implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_Id")
    private int id;

    @Column(name = "status_Name")
    private String tkt_StatusName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTkt_StatusName() {
        return tkt_StatusName;
    }

    public void setTkt_StatusName(String tkt_StatusName) {
        this.tkt_StatusName = tkt_StatusName;
    }
}
