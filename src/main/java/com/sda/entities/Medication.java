package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name= "medication")
public class Medication {

    @Id
    @GenericGenerator(name="gen" , strategy="increment")
    @GeneratedValue(generator="gen")
    private Integer code;
    @Column(name= "name_of_medicine")
    private String name;
    @Column(name= "brand")
    private String brand;
    @Column(name= "description_of_medicine")
    private String description;

    private Medication(){

    }

}
