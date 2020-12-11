package com.kodilla.travel_agency.controller;

import com.kodilla.travel_agency.domain.flight.FlightDto;
import com.kodilla.travel_agency.mapper.FlightMapper;
import com.kodilla.travel_agency.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/flight")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @Autowired
    private FlightMapper flightMapper;

    @GetMapping(value = "getFlight")
    public FlightDto getFlight(@RequestParam Long id){
        return flightMapper.mapToFlightDto(flightService.findById(id).get());
    }
}
