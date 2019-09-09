package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name= "patient")
public class Patient {

    @Id
    @GenericGenerator(name="gen" , strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name = "ssn")
    private Integer ssn;
    @Column(name= "name_of_patient")
    private String name;
    @Column(name= "address")
    private String address;
    @Column(name= "phone")
    private String phone;
    @Column(name= "insuranceid")
    private Integer insurance;
    private Physician pcp;

    private Patient(){

    }
}
