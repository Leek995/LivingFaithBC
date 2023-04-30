package com.example.livingfaithbc.controllers;

import com.example.livingfaithbc.Repositories.JoinControllerRepo;

import com.example.livingfaithbc.models.JoinForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {
    public final JoinControllerRepo joinDoa;

    public JoinController(JoinControllerRepo joinDoa) {
        this.joinDoa = joinDoa;
    }
    @GetMapping("/join")
    public String join(Model model){
        model.addAttribute("joinF", new JoinForm());
        return "join";
    }
    @PostMapping("/join")
    public String joinForm(@ModelAttribute("joinF") JoinForm join){
        joinDoa.save(join);
        return "success";
    }
}
