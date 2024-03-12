package com.grayhat.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author grayhat
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Gateway is up and running!";
    }

}
