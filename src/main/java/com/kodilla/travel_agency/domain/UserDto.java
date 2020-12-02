package com.kodilla.travel_agency.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserDto {

    private String name;
    private int id;
    private String email;

}
