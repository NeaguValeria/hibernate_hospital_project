package com.sda.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name= "prescribes")
public class Prescribe {

    private Physician physician;
    private Patient patient;
    private Medication medication;
    @Column(name= "date_of_prescribe")
    private Date date;
    private Appointment appointment;
    @Column(name= "dose")
    private String dose;

    private Prescribe(){

    }



}
