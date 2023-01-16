package com.example.springHotelApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.example.springHotelApp.model.Booking;
import com.example.springHotelApp.model.Room;

public class MockRoomServiceImpl implements com.example.springHotelApp.service.RoomService {

    
    Map<String, Room>   backingMap = new HashMap<>();

    @Override
    public Room addRoom(Room room) {
        room.setId(UUID.randomUUID().toString());
        backingMap.put( room.getId(), room);

        return room;
    }

    @Override
    public List<Room> getAllRooms() {
        List<Room> result = new ArrayList<>();

        result.addAll(backingMap.values());

        return result;
    }

    @Override
    public Room updateRoom(Room room) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteRoom(String id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Room findRoomById(String id) {
        Room result = backingMap.get(id);
        return result;
    }

    @Override
    public List<Booking> findBookingsById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Booking addBookingToRoom(Room room, Booking booking) {
        // TODO Auto-generated method stub
        return null;
    }

 
}
