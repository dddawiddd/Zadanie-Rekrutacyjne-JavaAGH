package com.company.spaceflights.service;

import com.company.spaceflights.model.Flight;
import com.company.spaceflights.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {

    private FlightRepository flightRepository;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        List<Flight> flights = new ArrayList<>();
        flightRepository.findAll().forEach(flights::add);
        return flights;
    }

    public Flight getFlight(Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    public void addFlight(Flight flight) {
        flightRepository.save(flight);
    }

    public void updateFlight(Long id, Flight flight) {
        flightRepository.save(flight);
    }

    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
}