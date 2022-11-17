package com.example.springHotelApp.controller;

import com.example.springHotelApp.model.*;
import com.auth0.example.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/login")
public class LoginController {


 // @Autowired
 // private AuthenticationManager authenticationManager;

  @PostMapping
  public ResponseEntity login(@RequestBody LoginModel loginModel) {
   // Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginModel.getUsername(), loginModel.getPassword()));

  //  if (isAuthenticated(authentication)) {
     // JwtUserDto jwtUserDto = JwtUserDto.buildFromAuthentication(authentication);
      return ResponseEntity.status(HttpStatus.CREATED).body("1234567");
  //  }

   // return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
  }

}
