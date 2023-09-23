package edu.eci.ieti.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CiCdController {
    @GetMapping
    public String getName() {
        return "Juan Pablo Sánchez Bermúdez";
    }
}
