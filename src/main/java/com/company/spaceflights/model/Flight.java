package com.company.spaceflights.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.Set;

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
    private Long id;

    private String name;
    private LocalDateTime departure;

    @ManyToMany(mappedBy = "course_like")
    Set<Tourist> likes;





    public Flight() {
    }

    public Flight(String name, LocalDateTime departure) {
        this.name = name;
        this.departure = departure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }
}
