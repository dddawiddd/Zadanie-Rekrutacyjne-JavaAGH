package com.company.spaceflights.service;

import com.company.spaceflights.model.Flight;
import com.company.spaceflights.model.Tourist;
import com.company.spaceflights.repository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TouristService {

    @Autowired
    TouristRepository touristRepository;

    public List<Tourist> getAllTourists() {
        List<Tourist> tourists = new ArrayList<>();
        touristRepository.findAll().forEach(tourists::add);
        return tourists;
    }

    public Tourist getTourist(Long id) {
        return touristRepository.findById(id).orElse(null);
    }

    public void addTourist(Tourist tourist) {
        touristRepository.save(tourist);
    }

    public void updateTourist(Long id, Tourist tourist) {

        Optional<Tourist> t = touristRepository.findById(id);

        if (t.isPresent()) {
            t.get().setName(tourist.getName());
            t.get().setSurname(tourist.getSurname());
            t.get().setGender(tourist.getGender());
            t.get().setCountry(tourist.getCountry());
            t.get().setNotes(tourist.getNotes());
            t.get().setBirthday(tourist.getBirthday());
           // t.get().setFlight(tourist.getFlight());

            touristRepository.save(t.get());
        }
    }



    public void updateTouristFlight(Long id,Long flightId, Flight flight) {

/*        Optional<Tourist> t = touristRepository.findById(id);

        if (t.isPresent()) {
            t.get().setId(tourist.getId());
            t.get().setName(tourist.getName());
            t.get().setSurname(tourist.getSurname());
            t.get().setGender(tourist.getGender());
            t.get().setCountry(tourist.getCountry());
            t.get().setNotes(tourist.getNotes());
            t.get().setBirthday(tourist.getBirthday());

            touristRepository.save(t.get());
        }*/
    }






    public void deleteTourist(Long id) {
        touristRepository.deleteById(id);
    }
}