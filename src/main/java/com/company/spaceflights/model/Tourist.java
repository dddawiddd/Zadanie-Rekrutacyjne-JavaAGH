package com.company.spaceflights.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
public class Tourist {


/*    @ManyToOne
    Flight flight;*/

    @ManyToMany
    @JoinTable(name = "flight_tourist",
            joinColumns = @JoinColumn(name = "tourist_id"),
            inverseJoinColumns = @JoinColumn(name = "flight_id"))
    Set<Flight> flights;


/*@ManyToMany
@JoinTable(
        name = "course_like",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id"))
Set<Course> likedCourses;*/


    @Id // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String gender; //todo change to enum?
    private String Country;
    private String notes;
    private java.sql.Date birthday;
    //  @JoinColumn(name = "flight_id");

    public Tourist() {
    }

    public Tourist(String name, String surname, Flight flight) {
        this.name = name;
        this.surname = surname;
        this.flights.add(flight);
    }


    public Tourist(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public void setFlights(Set<Flight> flights) {
        this.flights = flights;
    }

    public void setFlight(Flight flight) {
        this.flights.add(flight);
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "flights=" + flights +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", Country='" + Country + '\'' +
                ", notes='" + notes + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
