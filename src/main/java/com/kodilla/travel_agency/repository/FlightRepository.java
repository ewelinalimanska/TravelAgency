package com.kodilla.travel_agency.repository;

import com.kodilla.travel_agency.domain.flight.Flight;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FlightRepository extends CrudRepository <Flight, Long> {

    @Override
    Flight save(Flight flight);

    @Override
    Optional<Flight> findById(Long id);

    @Override
    boolean existsById(Long id);

    @Override
    long count();
}
