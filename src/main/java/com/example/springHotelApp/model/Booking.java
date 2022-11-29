package com.example.springHotelApp.model;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Booking")
public class Booking {
    
    
    @Id
    private String id;
    private Room room;
    private Date timeOfArrival;
    private Date timeOfDeparture;
    private Integer amountDaysStay;
    private String bookerFullName;
    private String bookerEmail;
    private Integer amountOfGuests;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Integer getAmountDaysStay() {
        return amountDaysStay;
    }
    public void setAmountDaysStay(Integer amountDaysStay) {
        this.amountDaysStay = amountDaysStay;
    }
    public String getBookerFullName() {
        return bookerFullName;
    }
    public void setBookerFullName(String bookerFullName) {
        this.bookerFullName = bookerFullName;
    }
    public String getBookerEmail() {
        return bookerEmail;
    }
    public void setBookerEmail(String bookerEmail) {
        this.bookerEmail = bookerEmail;
    }
    public Integer getAmountOfGuests() {
        return amountOfGuests;
    }
    public void setAmountOfGuests(Integer amountOfGuests) {
        this.amountOfGuests = amountOfGuests;
    }
    public Date getTimeOfArrival() {
        return timeOfArrival;
    }
    public void setTimeOfArrival(Date timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }
    public Date getTimeOfDeparture() {
        return timeOfDeparture;
    }
    public void setTimeOfDeparture(Date timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }   

}
