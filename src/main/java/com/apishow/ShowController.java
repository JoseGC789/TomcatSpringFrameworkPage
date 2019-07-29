package com.apishow;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController{

    @GetMapping("/service")
    public ResponseEntity<String> show(){
        return ResponseEntity.ok("VAMMOOOO LO CONFIGURE CON XML !!! CACHITO LOCOOO!! MANU PUTO!");
    }
}
