package com.company.spaceflights.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Entity
public class Tourist {

/*
            1. Tourist
    a. Name
    b. Surname
    c. Gender
    d. Country
    e. Notes
    f. Date of birth
    g. List of flights*/

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String surname;
    private String gender; //todo change to enum?
    private String Country;
    private String notes;
    private java.sql.Date birthday;

    @ManyToOne
    //  @JoinColumn(name = "flight_id");
            Flight flight;

    public Tourist() {
    }

    public Tourist(String name,String surname,Flight flight) {
        this.name = name;
        this.surname = surname;
        this.flight=flight;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", Country='" + Country + '\'' +
                ", notes='" + notes + '\'' +
                ", birthday=" + birthday +
                ", flight=" + flight +
                '}';
    }
}
