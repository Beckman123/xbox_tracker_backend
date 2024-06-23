package com.example.xbox_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class XboxTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(XboxTrackerApplication.class, args);
	}

	@GetMapping("/HelloWorld")
	public ResponseEntity<String> getHelloWorld(){
		return ResponseEntity.ok("Hello World!");
	}
}
