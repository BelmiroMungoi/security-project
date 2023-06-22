package com.bbm.securityproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @PostMapping
    public String post() {
        return "POST:: admin controller";
    }

    @GetMapping
    public String get() {
        return "GET:: admin controller";
    }

    @PutMapping
    public String put() {
        return "PUT:: admin controller";
    }

    @DeleteMapping
    public String delete() {
        return "DELETE:: admin controller";
    }
}
