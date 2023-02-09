package com.example.livingfaithbc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DonationsController {

    @GetMapping("/give")
    public String showDonateForm(){
        return "donations";
    }

    @PostMapping("/give")
    public String donateForm(){
        return "donations";
    }
}
