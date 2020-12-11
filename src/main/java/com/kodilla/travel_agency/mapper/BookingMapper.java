package com.kodilla.travel_agency.mapper;

import com.kodilla.travel_agency.domain.booking.Booking;
import com.kodilla.travel_agency.domain.booking.BookingDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class BookingMapper {

    public Booking mapToBooking(final BookingDto bookingDto){
        return new Booking(
                bookingDto.getId(),
                bookingDto.getUserId(),
                bookingDto.getFlightId(),
                bookingDto.getFlightNumber(),
                bookingDto.getDepartureCity(),
                bookingDto.getArrivalCity());
    }

    public BookingDto mapToBookingDto(final Booking booking){
        return new BookingDto(
                booking.getId(),
                booking.getUserId(),
                booking.getFlightId(),
                booking.getFlightNumber(),
                booking.getDepartureCity(),
                booking.getArrivalCity());
    }

    public List<BookingDto> mapToBookingDtoList(final List<Booking> bookings){
        return bookings.stream()
                .map(b -> new BookingDto(
                        b.getId(),
                        b.getUserId(),
                        b.getFlightId(),
                        b.getFlightNumber(),
                        b.getDepartureCity(),
                        b.getArrivalCity()))
                .collect(Collectors.toList());
    }
}
