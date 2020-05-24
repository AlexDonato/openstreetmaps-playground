package com.openmind.testopenmap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController
{
    @GetMapping("/")
    public String getIndex(Model model)
    {
        return "index";
    }
}
