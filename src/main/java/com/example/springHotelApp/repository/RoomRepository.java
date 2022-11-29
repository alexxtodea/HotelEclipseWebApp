package com.example.springHotelApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.springHotelApp.model.Booking;
import com.example.springHotelApp.model.Room;

@Repository
public interface RoomRepository extends MongoRepository<Room, Integer> {

	void deleteRoomById(String id);

	Room findRoomById(String id);

    List<Booking> findBookingById(String id);

  
}
 
