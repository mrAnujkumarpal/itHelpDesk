package com.ngApp.model.common;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Location")
public class Location implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int location_id;

    @Column(name = "location_name")
    public String location_name;


    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }


}
