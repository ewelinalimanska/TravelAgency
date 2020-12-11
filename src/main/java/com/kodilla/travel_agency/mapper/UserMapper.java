package com.kodilla.travel_agency.mapper;

import com.kodilla.travel_agency.domain.user.User;
import com.kodilla.travel_agency.domain.user.UserDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public User mapToUser(final UserDto userDto){
        return new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getEmail(),
                userDto.getCity());
    }

    public UserDto mapToUserDto(final User user){
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getCity());
    }

    public List<UserDto> mapToUserDtoList(final List<User> userList){
        return userList.stream()
                .map(u -> new UserDto(u.getId(), u.getName(), u.getEmail(), u.getCity()))
                .collect(Collectors.toList());
    }
}
