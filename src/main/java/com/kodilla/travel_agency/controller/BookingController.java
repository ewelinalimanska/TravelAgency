package com.kodilla.travel_agency.controller;

import com.kodilla.travel_agency.domain.booking.Booking;
import com.kodilla.travel_agency.domain.booking.BookingDto;
import com.kodilla.travel_agency.mapper.BookingMapper;
import com.kodilla.travel_agency.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/booking")
public class BookingController {

   @Autowired
    BookingService bookingService;

   @Autowired
    BookingMapper bookingMapper;

    @PostMapping(value = "createBooking")
    public Booking save(@RequestBody BookingDto bookingDto) {
        return bookingService.save(bookingMapper.mapToBooking(bookingDto));
    }

    @GetMapping(value = "getBooking")
    public BookingDto getBooking(@RequestParam Long id) throws AgencyNotFoundException {
        return bookingMapper.mapToBookingDto(bookingService.getBooking(id).orElseThrow(AgencyNotFoundException::new));
    }

    @GetMapping(value = "getBookings")
    public List<BookingDto> getBookings() {
        return bookingMapper.mapToBookingDtoList(bookingService.findAll());
    }

    @DeleteMapping(value = "deleteBooking")
    public void deleteById(@RequestParam final Long id) {
        bookingService.deleteById(id);
    }
}
