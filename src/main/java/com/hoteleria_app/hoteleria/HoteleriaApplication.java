package com.hoteleria_app.hoteleria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HoteleriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoteleriaApplication.class, args);
	}
	@PostMapping
	public String hello () {
		return "Hello World";
	}

}
