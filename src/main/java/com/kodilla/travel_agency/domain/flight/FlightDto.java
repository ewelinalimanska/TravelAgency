package com.kodilla.travel_agency.domain.flight;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class FlightDto {

    private Long id;
    private int flightNumber;
    private String arrival;
    private String departure;
    private double price;

}
