package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="appointment")
public class Appointment {

    @Id
    @GenericGenerator(name="gen" , strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name="appointmentid")
    private Integer id;
    private  Patient patient;
    private Nurse prepnurse;
    private Physician physician;
    private Date start;
    private Date end;
    private String examinationRoom;

    private Appointment(){

    }

}
