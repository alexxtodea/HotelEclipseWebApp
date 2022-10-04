package com.example.springHotelApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.springHotelApp.model.Room;

@Repository
public interface RoomRepository extends MongoRepository<Room, Integer> {

	void deleteRoomById(String id);

	Room findRoomById(String id);
  
}
 
