package com.kodilla.travel_agency.domain.booking;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class BookingDto {

    private Long id;
    private Long userId;
    private Long flightId;
    private int flightNumber;
    private String departureCity;
    private String arrivalCity;

}
