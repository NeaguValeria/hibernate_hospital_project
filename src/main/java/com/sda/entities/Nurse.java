package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name= "nurse")
public class Nurse {

    @Id
    @GenericGenerator(name="gen" , strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name="employeeid")
    private  Integer employee;
    @Column(name= "name_of_nurse")
    private String name;
    @Column(name= "position")
    private String position;
    @Column(name = "registered")
    private  boolean registered;
    @Column(name = "ssn")
    private Integer ssn;

    private Nurse(){

    }

}
