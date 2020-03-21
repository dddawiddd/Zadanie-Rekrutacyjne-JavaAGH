package com.company.spaceflights.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Flight {

/*2. Lot
    a. Date and time of departure
    b. Date and time of arrival
    c. Number of seats
    d. Tourist list
    e. Ticket price*/


    @Id
    @GeneratedValue
    private int id;

    private String name;
    private LocalDateTime departure;


}
