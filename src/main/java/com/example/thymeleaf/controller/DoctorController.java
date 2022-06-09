package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor/")
    public String doctor(Model model,
                        @RequestParam(value="name",
                                required=false,
                                defaultValue="John Smith") String name
    ){
    model.addAttribute("name", name); 
        return "doctor";
    }
    @GetMapping("/doctor/")
    public Integer doctor(Model model,
                        @RequestParam(value="number",
                                required=false,
                                defaultValue="0") Integer number
    ){
    model.addAttribute("number", number);
        return "doctor";
    }

