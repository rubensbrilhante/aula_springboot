package com.rubens.brilhante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PersonController {

    @GetMapping("/persons")
    public String getRoot() {
        return "Person";
    }

}
