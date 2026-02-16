package com.adsoSpringBoot.adsoSpringBoot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping
    public String user() {
        return "hola frnak";

    }

}
