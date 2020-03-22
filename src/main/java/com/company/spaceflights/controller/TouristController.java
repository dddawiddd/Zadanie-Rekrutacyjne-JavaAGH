package com.company.spaceflights.controller;

import com.company.spaceflights.model.Flight;
import com.company.spaceflights.model.Tourist;
import com.company.spaceflights.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TouristController {

/*    1. Zarządzanie turystami
    a. Lista turystów
    b. Dodawanie turysty
    c. Usuwanie turysty*/

    private TouristService touristService;

    @Autowired
    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    @RequestMapping("/tourists")
    public List<Tourist> getAllTourists() {
        return touristService.getAllTourists();
    }

    @GetMapping("/tourists/{id}")
    public Tourist getTourist(@PathVariable Long id) {
        return touristService.getTourist(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/tourists")
    public void addTopic(@RequestBody Tourist tourist) {
        touristService.addTourist(tourist);
    }


    @PutMapping("/tourists/{id}")
    public void updateTopic(@PathVariable Long id, @RequestBody Tourist tourist) {
        touristService.updateTourist(id, tourist);
    }

    @PutMapping("/tourists/{id}/{flightId}")
    public void updateTopic(@PathVariable Long id, @PathVariable Long flighId, @RequestBody Flight flight) {
        touristService.updateTouristFlight(id, flighId, flight);
    }


    @DeleteMapping("/tourists/{id}")
    public void deleteTopic(@PathVariable Long id) {
        touristService.deleteTourist(id);
    }

}
