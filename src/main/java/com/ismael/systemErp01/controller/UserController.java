package com.ismael.systemErp01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/demo")
public class UserController {

    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello World");
    }
}
