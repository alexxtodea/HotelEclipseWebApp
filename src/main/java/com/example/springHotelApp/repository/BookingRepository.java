package com.example.springHotelApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.springHotelApp.model.Booking;

@Repository
public interface BookingRepository extends MongoRepository<Booking, Integer> {

    void deleteBookingById(String id);

    Booking findBookingById(String id);

  
}