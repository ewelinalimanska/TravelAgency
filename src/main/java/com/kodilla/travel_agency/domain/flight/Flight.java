package com.kodilla.travel_agency.domain.flight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Entity
@Getter
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "flight_number")
    private int flightNumber;

    @Column(name = "arrival")
    private String arrival;

    @Column(name = "departure")
    private String departure;

    @Column(name = "price")
    private double price;
}
