package com.kodilla.travel_agency.repository;

import com.kodilla.travel_agency.domain.booking.Booking;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookingRepository extends CrudRepository<Booking, Long> {

    @Override
    Booking save(Booking booking);

    @Override
    Optional<Booking> findById(Long id);

    @Override
    boolean existsById(Long id);

    @Override
    Iterable<Booking> findAll();

    @Override
    long count();

    @Override
    void deleteById(Long id);
}
