/**
 * 
 */
package com.example.springHotelApp;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.springHotelApp.controller.RoomController;
import com.example.springHotelApp.model.Room;

/**
 * @author Gebruiker
 *
 */
@SpringBootTest
class TestController {
    

    @Test
    void testAddRoom() {
        
        RoomController rController = new RoomController(new MockRoomServiceImpl());
        Room testroom = new Room();
        testroom.setDescription("test room");
        rController.addRoom(testroom);
        ResponseEntity<List<Room>> roomsResponse = rController.getRooms();
        assertThat(roomsResponse.getStatusCode().equals( HttpStatus.CREATED));
    }
    
    @Test
    void testGetRoomByID_Created() {
        
        RoomController rController = new RoomController(new MockRoomServiceImpl());
        Room testroom = new Room();
        testroom.setDescription("test room");
        rController.addRoom(testroom);
        ResponseEntity<Room> roomsResponse = rController.getRoomById(testroom.getId());
        assertThat(roomsResponse.getStatusCode().equals( HttpStatus.CREATED));
    }
    
    @Test
    void testGetRoomByID_BadRequest() {
        
        RoomController rController = new RoomController(new MockRoomServiceImpl());
        ResponseEntity<Room> roomsResponse = rController.getRoomById("Id does not exist");
        assertThat(roomsResponse.getStatusCode().equals( HttpStatus.BAD_REQUEST));
    }

}
