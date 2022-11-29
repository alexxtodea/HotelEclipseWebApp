package com.example.springHotelApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;


/*@CrossOrigin(origins = "http://localhost:8080")*/
@SpringBootApplication
public class SpringHotelAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelAppApplication.class, args);
	}
	

}
