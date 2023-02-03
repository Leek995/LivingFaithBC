package com.example.livingfaithbc.controllers;

import com.example.livingfaithbc.Repositories.EmailSubscriptionRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    public final EmailSubscriptionRepo emailDoa;

    public HomeController(EmailSubscriptionRepo emailDoa) {
        this.emailDoa = emailDoa;
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/sunday/experience")
    public String sundayExperience(){
        return "sunday-experience";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/join")
    public String join(){
        return "join";
    }
    @GetMapping("/devotionals")
    public String devotionals(){
        return "devotionals";
    }
}
