package com.example.controller;

import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
  
@RestController
@RequestMapping("/user") 
public class UserController {

	  @GetMapping("/gfg") 
	    public ResponseEntity<String> getUser() { 
	        return ResponseEntity.ok("Welcome to User"); 
	    }
	  
	  @GetMapping("/gfg1") 
	    public ResponseEntity<String> getXyz() { 
	        return ResponseEntity.ok("Welcome to Userwewew"); 
	    }
}
