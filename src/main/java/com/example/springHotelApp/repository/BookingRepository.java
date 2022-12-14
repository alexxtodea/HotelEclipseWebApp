package com.example.springHotelApp.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.springHotelApp.model.Booking;

@Repository
public interface BookingRepository extends MongoRepository<Booking, Integer> {

    void deleteBookingById(String id);

    Booking findBookingById(String id);

    void findAllById(String id);

  
}