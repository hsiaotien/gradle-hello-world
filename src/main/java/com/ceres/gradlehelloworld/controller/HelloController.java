package com.ceres.gradlehelloworld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello/world")
public class HelloController {

    @GetMapping("first")
    public ResponseEntity hello() {
        return ResponseEntity.ok().body("hello world");
    }
}
