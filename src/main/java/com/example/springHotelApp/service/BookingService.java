package com.example.springHotelApp.service;

import java.util.List;


import com.example.springHotelApp.model.Booking;

public interface BookingService {
     public Booking addBooking(Booking booking);
     public List<Booking> getAllBookings();
     public Booking updateBooking(Booking booking);
     void deleteBooking(String id);
     Booking findBookingById(String id);
}
