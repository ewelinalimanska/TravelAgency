package com.kodilla.travel_agency.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UserDto {

    private final Long id;
    private final String name;
    private final String email;
    private final String city;

}
