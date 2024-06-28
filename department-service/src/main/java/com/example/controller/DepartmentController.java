package com.example.controller;

import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
  
@RestController
@RequestMapping("/department") 
public class DepartmentController {

	  @GetMapping("/gfg") 
	    public ResponseEntity<String> getDepartment() { 
	        return ResponseEntity.ok("Welcome to Department"); 
	    }
}
