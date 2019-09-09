package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name= "procedures")
public class Procedure {

    @Id
    @GenericGenerator(name="gen" , strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name = "code_of_procedures")
    private Integer code;
    @Column(name= "name_of_procedures")
    private String name;
    @Column(name = "cost")
    private double cost;

    private Procedure(){

    }
}
