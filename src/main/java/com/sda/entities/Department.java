package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name= "department")
public class Department {

    @Id
    @GenericGenerator(name="gen" , strategy="increment")
    @GeneratedValue(generator="gen")
    private Integer department;
    @Column(name= "name_of_department")
    private String name;

    private Physician head;

    private Department(){

    }

}
