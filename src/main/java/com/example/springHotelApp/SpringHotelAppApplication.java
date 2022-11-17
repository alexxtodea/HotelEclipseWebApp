package com.example.springHotelApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*@CrossOrigin(origins = "http://localhost:8080")*/
@SpringBootApplication
public class SpringHotelAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelAppApplication.class, args);
	}
	

}
