package com.kodilla.travel_agency.service;

import com.kodilla.travel_agency.domain.flight.Flight;
import com.kodilla.travel_agency.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public Flight saveFlight(final Flight flight){
        return flightRepository.save(flight);
    }

    public Optional<Flight> findById(final Long id){
        return flightRepository.findById(id);
    }

    public boolean existsById(Long id){
        return flightRepository.existsById(id);
    }
}
