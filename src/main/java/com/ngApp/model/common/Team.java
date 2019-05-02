package com.ngApp.model.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Team")
public class Team implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private int  id;

    @Column(name = "team_name")
    private String team_name;

    @Column(name = "team_code")
    private String team_code;

    @Column(name = "CreatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date team_createdDate;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getTeam_code() {
        return team_code;
    }

    public void setTeam_code(String team_code) {
        this.team_code = team_code;
    }

    public Date getTeam_createdDate() {
        return team_createdDate;
    }

    public void setTeam_createdDate(Date team_createdDate) {
        this.team_createdDate = team_createdDate;
    }
}
