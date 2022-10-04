package com.example.springHotelApp.service;

import java.util.List;


import com.example.springHotelApp.model.Room;

public interface RoomService {
	 public Room addRoom(Room room);
	 public List<Room> getAllRooms();
	 public Room updateRoom(Room room);
	 void deleteRoom(String id);
	 Room findRoomById(String id);
}
