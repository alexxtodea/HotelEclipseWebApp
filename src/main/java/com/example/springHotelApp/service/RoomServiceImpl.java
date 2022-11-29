package com.example.springHotelApp.service;

import java.util.List;
import java.util.UUID;

import com.example.springHotelApp.model.Booking;
import com.example.springHotelApp.model.Room;
import com.example.springHotelApp.repository.BookingRepository;
import com.example.springHotelApp.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class RoomServiceImpl implements RoomService {
	 @Autowired
	 private RoomRepository roomRepository;
	 @Autowired
     private BookingRepository bookingRepository;
	 
	@Override
	public Room addRoom(Room room) {
		room.setId(UUID.randomUUID().toString());
		 return roomRepository.save(room);
	}

	@Override
	public List<Room> getAllRooms() {
		 return roomRepository.findAll();
	}
	
	@Override
	public Room updateRoom(Room room) {		
		 return roomRepository.save(room);
	}
	
	@Override
	public Room findRoomById(String id) {
		return roomRepository.findRoomById(id);
	}
	
	@Override
	public void deleteRoom(String id) {
		roomRepository.deleteRoomById(id);
	}

	
    @Override
    public Booking addBookingToRoom(Room room, Booking booking) {
         booking.setId(UUID.randomUUID().toString());
         bookingRepository.save(booking);
         room.addBooking(booking);
         roomRepository.save(room);
         return null;
    }

    @Override
    public List<Booking> findBookingsById(String id) {
        return roomRepository.findBookingById(id);
    }

}
