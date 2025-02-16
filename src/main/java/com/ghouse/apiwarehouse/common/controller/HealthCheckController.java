package com.ghouse.apiwarehouse.common.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.ZonedDateTime;

//@RestController

@Controller
public class HealthCheckController {

	@GetMapping(value="/", produces = "application/json")
	public ResponseEntity<String> checkHome() {
		return new ResponseEntity<>("APIWarehouse API Home: " + ZonedDateTime.now(), HttpStatus.OK);
	}

	@GetMapping(value="/health", produces = "application/json")
	public ResponseEntity<String> checkHealth() {
		return new ResponseEntity<>("APIWarehouse API Healthy: " + ZonedDateTime.now(), HttpStatus.OK);
	}

	@GetMapping(value="/liveness", produces = "application/json")
	public ResponseEntity<String> checkLiveness() {
		return new ResponseEntity<>("APIWarehouse API is Live: " + ZonedDateTime.now(), HttpStatus.OK);
	}

}
