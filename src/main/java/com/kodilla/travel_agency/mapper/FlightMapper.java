package com.kodilla.travel_agency.mapper;

import com.kodilla.travel_agency.domain.flight.Flight;
import com.kodilla.travel_agency.domain.flight.FlightDto;
import org.springframework.stereotype.Component;

@Component
public class FlightMapper {

    public static Flight mapToFlight(final FlightDto flightDto){
        return new Flight(
                flightDto.getId(),
                flightDto.getFlightNumber(),
                flightDto.getArrival(),
                flightDto.getDeparture(),
                flightDto.getPrice());
    }

    public static FlightDto mapToFlightDto(final Flight flight){
        return new FlightDto(
                flight.getId(),
                flight.getFlightNumber(),
                flight.getArrival(),
                flight.getDeparture(),
                flight.getPrice());
    }
}
