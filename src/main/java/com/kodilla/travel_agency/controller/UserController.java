package com.kodilla.travel_agency.controller;


import com.kodilla.travel_agency.domain.user.UserDto;
import com.kodilla.travel_agency.mapper.UserMapper;
import com.kodilla.travel_agency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "getUsers")
    public List<UserDto> getUsers(){
        return userMapper.mapToUserDtoList(userService.getAllUsers());
    }

    @GetMapping(value = "getUser")
    public UserDto getUser(@RequestParam Long userId) throws AgencyNotFoundException{
        return userMapper.mapToUserDto(userService.getTask(userId).orElseThrow(AgencyNotFoundException::new));
    }

    @PostMapping("createUser")
    public void createUser(@RequestBody UserDto userDto){
        userService.saveUser(userMapper.mapToUser(userDto));
    }

    @DeleteMapping(value = "deleteUser")
    public void deleteUser(@RequestParam final Long id){
        userService.deleteUser(id);
    }
}
