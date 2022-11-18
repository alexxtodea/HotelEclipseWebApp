package com.example.springHotelApp.service;

import java.util.List;
import java.util.UUID;

import com.example.springHotelApp.model.Booking;
import com.example.springHotelApp.repository.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BookingServiceImpl implements BookingService {
     @Autowired
     private BookingRepository bookingRepository;
     
    @Override
    public Booking addBooking(Booking booking) {
        booking.setId(UUID.randomUUID().toString());
         return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
         return bookingRepository.findAll();
    }
    
    @Override
    public Booking updateBooking(Booking booking) {     
         return bookingRepository.save(booking);
    }
    
    @Override
    public Booking findBookingById(String id) {
        return bookingRepository.findBookingById(id);
    }
    
    @Override
    public void deleteBooking(String id) {
        bookingRepository.deleteBookingById(id);
    }

}
