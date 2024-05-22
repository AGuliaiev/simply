package com.example.simply.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/uslugi")
    public String uslugi(Model model) {
        return "uslugi";
    }
    @GetMapping("/contacts")
    public String contacts(Model model) {
        return "contacts";
    }
    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }
}