package com.company.spaceflights;


import com.company.spaceflights.model.Flight;
import com.company.spaceflights.model.Tourist;
import com.company.spaceflights.repository.FlightRepository;
import com.company.spaceflights.repository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class DataLoader implements ApplicationRunner {

    private TouristRepository touristRepository;
    private FlightRepository flightRepository;

    @Autowired
    public DataLoader(TouristRepository touristRepository, FlightRepository flightRepository){
        this.touristRepository=touristRepository;
        this.flightRepository=flightRepository;

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Flight flight1 = new Flight("KRK-ASD", LocalDateTime.of(2020,10,14,8,50));
        Flight flight2 = new Flight("ASD-KLE", LocalDateTime.of(2020,11,4,8,34));
        Flight flight3 = new Flight("DLK-ASF", LocalDateTime.of(2020,8,14,6,30));

        flightRepository.save(flight1);
        flightRepository.save(flight2);
        flightRepository.save(flight3);

        Tourist tourist1 = new Tourist("Kamil","Lak",flight1);
        Tourist tourist2 = new Tourist("Jan","Mak",flight2);
        Tourist tourist3 = new Tourist("Klan","Jak",flight3);
        Tourist tourist4 = new Tourist("Janusz","Krak",flight3);

        touristRepository.save(tourist1);
        touristRepository.save(tourist2);
        touristRepository.save(tourist3);
        touristRepository.save(tourist4);

    }
}
