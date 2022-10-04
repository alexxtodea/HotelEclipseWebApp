package com.example.springHotelApp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.springHotelApp.model.Room;
import com.example.springHotelApp.service.RoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {

	@Autowired
	private RoomService roomService;

	@GetMapping("/getAll")
	public ResponseEntity<List<Room>> getRooms() {
		List<Room> rooms = roomService.getAllRooms();
		return new ResponseEntity<>(rooms,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Room> getRoomById(@PathVariable("id") String id) {
		Room room = roomService.findRoomById(id);
		return new ResponseEntity<>(room,HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Room> addRoom(@RequestBody Room room) {
		Room newRoom = roomService.addRoom(room);		
		return new ResponseEntity<>(newRoom,HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Room> updateRoom(@RequestBody Room room) {
		Room updateRoom = roomService.updateRoom(room);		
		return new ResponseEntity<>(updateRoom,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteRoom(@PathVariable("id") String id) {
		roomService.deleteRoom(id);		
		return new ResponseEntity<>(HttpStatus.OK);
	}

 
}
