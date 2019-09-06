package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name= "physician")
public class Physician {

    @Id
    @GenericGenerator(name="gen" , strategy="increment")
    @GeneratedValue(generator="gen")
    private Integer employee;
    @Column(name= "name_of_physician")
    private String name;
    @Column(name= "position")
    private String position;
    @Column(name= "ssn")
    private  Integer ssn;

    private Physician(){

    }


}
