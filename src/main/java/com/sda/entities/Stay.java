package com.sda.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name= "stay")
public class Stay {

    @Id
    @GenericGenerator(name="gen" , strategy="increment")
    @GeneratedValue(generator="gen")
    private Integer stay;
    private Patient patient;
    private Room room;
    @Column(name= "start_time")
    private Time start;
    @Column(name= "end_time")
    private Time end;

    private Stay(){

    }

}
