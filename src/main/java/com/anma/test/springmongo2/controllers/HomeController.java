package com.anma.test.springmongo2.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String getHomePage() {
        return "home";
    }

}
