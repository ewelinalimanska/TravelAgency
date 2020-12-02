package com.kodilla.travel_agency.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private int id;
    private String email;

}
