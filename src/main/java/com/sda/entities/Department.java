package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "department")
public class Department {

    @Id
    @GenericGenerator(name="gen" , strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name = "departmentid")
    private Integer id;
    @Column(name= "name_of_department")
    private String name;

    private Physician head;

    private Department(){

    }

}
