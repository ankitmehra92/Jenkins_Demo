package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class JenkinsDemoController {

	@RequestMapping(path = "/greeting",method= RequestMethod.GET)
	public ResponseEntity<String> getGreeting() {
		return ResponseEntity.ok("How you doin!!!!");
	}
}
