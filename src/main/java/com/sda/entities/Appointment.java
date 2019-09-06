package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="appointment")
public class Appointment {

    @Id
    @GenericGenerator(name="gen" , strategy="increment")
    @GeneratedValue(generator="gen")
    private Integer appointment;


    private  Patient patient;
    private Nurse prepnurse;
    private Physician physician;
    private Date start;
    private Date end;
    private String examinationRoom;

    private Appointment(){

    }

}
