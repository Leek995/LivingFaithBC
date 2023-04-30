package com.example.livingfaithbc.controllers;

import com.example.livingfaithbc.Repositories.EmailSubscriptionRepo;
import com.example.livingfaithbc.models.EmailSubscription;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    public final EmailSubscriptionRepo emailDoa;

    public HomeController(EmailSubscriptionRepo emailDoa) {
        this.emailDoa = emailDoa;
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("emailSub", new EmailSubscription());
        return "index";
    }
    @PostMapping("/success")
    public String RegisterUserForm(@ModelAttribute("emailSub") EmailSubscription email){
        emailDoa.save(email);
        return "success";
    }

    @GetMapping("/sunday/experience")
    public String sundayExperience(){
        return "sunday-experience";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
//    @GetMapping("/join")
//    public String join(){
//        return "join";
//    }
    @GetMapping("/devotionals")
    public String devotionals(){
        return "devotionals";
    }
    @GetMapping("/give")
    public String give(){
        return "give";
    }
    @GetMapping("/ministries")
    public String ministries(){
        return "ministries";
    }
}
