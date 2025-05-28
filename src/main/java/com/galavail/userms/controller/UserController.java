package com.galavail.userms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/")
public class UserController {

    @GetMapping("/user")
    public String getUserId() {
        return "Usuario autenticado correctamente";
    }

    @GetMapping("/uuid")
    public UUID getUserUuid() {
        return UUID.randomUUID();
    }
}
