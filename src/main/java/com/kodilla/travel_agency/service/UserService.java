package com.kodilla.travel_agency.service;

import com.kodilla.travel_agency.domain.user.User;
import com.kodilla.travel_agency.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(final User user){
        return userRepository.save(user);
    }

    public Optional<User> getUser(final Long id){
        return userRepository.findById(id);
    }

    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }

    public Optional<User> getTask(final Long id){
        return userRepository.findById(id);
    }

    public void deleteUser(final Long id){
        userRepository.deleteById(id);
    }
}
