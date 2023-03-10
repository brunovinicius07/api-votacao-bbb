package com.api.votacao.bbb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/api/status")
    public ResponseEntity<String> status(){
        return ResponseEntity.ok("online");
    }
}
