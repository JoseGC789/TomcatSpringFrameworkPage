package com.apishow.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController{

    @GetMapping("/service")
    public ResponseEntity<String> show(){
        return ResponseEntity.ok("OK");
    }
}
