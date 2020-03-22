package com.company.spaceflights.controller;

import com.company.spaceflights.model.Flight;
import com.company.spaceflights.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    private FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @RequestMapping("/flights")
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/flights/{id}")
    public Flight getFlight(@PathVariable Long id) {
        return flightService.getFlight(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/flights")
    public void addFlight(@RequestBody Flight flight) {
        flightService.addFlight(flight);
    }

    @PutMapping("/flights/{id}")
    //@RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updateFlight(@PathVariable Long id, @RequestBody Flight flight) {
        flightService.updateFlight(id, flight);
    }

    @DeleteMapping("/flights/{id}")
    public void deleteFlight(@PathVariable Long id) {
        flightService.deleteFlight(id);
    }

}
