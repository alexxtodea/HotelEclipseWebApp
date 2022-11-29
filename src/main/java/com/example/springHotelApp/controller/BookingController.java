package com.example.springHotelApp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
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

import com.example.springHotelApp.model.Booking;
import com.example.springHotelApp.service.BookingService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Booking>> getBookings() {
        List<Booking> bookings = bookingService.getAllBookings();
        return new ResponseEntity<>(bookings,HttpStatus.OK);
    }
    
    @GetMapping("/find/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable("id") String id) {
        Booking booking = bookingService.findBookingById(id);
        return new ResponseEntity<>(booking,HttpStatus.OK);
    }
         
    
    @PostMapping("/add")
    public ResponseEntity<Booking> addBooking(@RequestBody Booking booking) {
        Booking newBooking = bookingService.addBooking(booking);       
        return new ResponseEntity<>(newBooking,HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Booking> updateBooking(@RequestBody Booking booking) {
        Booking updateBooking = bookingService.updateBooking(booking);     
        return new ResponseEntity<>(updateBooking,HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBooking(@PathVariable("id") String id) {
        bookingService.deleteBooking(id);     
        return new ResponseEntity<>(HttpStatus.OK);
    }

 
}