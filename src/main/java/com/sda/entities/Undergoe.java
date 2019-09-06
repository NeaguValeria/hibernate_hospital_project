package com.sda.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name= "undergoes")
public class Undergoe {

    private Patient patient;
    private Procedure procedure;
    private Stay stay;
    @Column(name = "date_of_undergoes")
    private Date date;
    private Physician physician;
    private Nurse assistingNurse;

    private Undergoe(){

    }
}
