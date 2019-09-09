package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name= "room")
public class Room {

    @Id
    @GenericGenerator(name="gen" , strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name="roomnumber")
    private Integer roomNumber;
    @Column(name= "roomtype")
    private String roomType;
    private Block blockfloor;
    private Block blockcode;

    private Room(){

    }
}
