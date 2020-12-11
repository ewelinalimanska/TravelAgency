package com.kodilla.travel_agency.repository;

import com.kodilla.travel_agency.domain.user.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    User save(User user);

    @Override
    Optional<User> findById(Long id);

    @Override
    Iterable<User> findAll();

    @Override
    void deleteById(Long id);

    @Override
    long count();
}
