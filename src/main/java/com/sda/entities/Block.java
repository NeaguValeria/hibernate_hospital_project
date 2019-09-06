package com.sda.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "undergoes")
public class Block {

    @Column(name= "blockfloor")
    private Integer blockfloor;
    @Column(name="blockcode")
    private  Integer blockcode;

    private Block(){

    }
}
