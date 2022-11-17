package com.example.springHotelApp.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Room")
public class Room {

	@Id
	private String id;
	private String roomType;
	private String description;
	private String imageURL;
	private Integer bedAmount;
	private Integer price;
	private Integer roomNumber;
	
	
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return imageURL;
	}

	public void setImage(String image) {
		this.imageURL = image;
	}

	public Integer getBedAmount() {
		return bedAmount;
	}

	public void setBedAmount(Integer bedAmount) {
		this.bedAmount = bedAmount;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", roomType=" + roomType + ", description=" + description + ", image=" + imageURL
				+ ", bedAmount=" + bedAmount + ", price=" + price + ", roomNumber=" + roomNumber + "]";
	}
	
	
	
	
}
