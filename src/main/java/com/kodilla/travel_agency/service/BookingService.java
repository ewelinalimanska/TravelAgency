package com.kodilla.travel_agency.service;

import com.kodilla.travel_agency.domain.booking.Booking;
import com.kodilla.travel_agency.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Optional<Booking> getBooking(Long id) {
        return bookingRepository.findById(id);
    }

    public List<Booking> findAll() {
        return (List<Booking>) bookingRepository.findAll();
    }

    public long count() {
        return bookingRepository.count();
    }

    public void deleteById(Long id) {
        bookingRepository.deleteById(id);
    }
}