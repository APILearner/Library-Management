package com.barclay.bank.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckAPI {

  @GetMapping("/healthCheck")
  public ResponseEntity<String> getStatus() {
      return new ResponseEntity<>("Success", HttpStatus.OK);
  }

}