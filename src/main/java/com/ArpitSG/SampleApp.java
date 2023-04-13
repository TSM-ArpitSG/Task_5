package com.ArpitSG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleApp {

	@GetMapping
	public String message(){
		return "welcome to Kaiburr Task 5";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleApp.class, args);
	}

}
