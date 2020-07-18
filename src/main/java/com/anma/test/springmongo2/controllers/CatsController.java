package com.anma.test.springmongo2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatsController {

    @GetMapping("/cats")
    public String getCatsPage() {
        return "cats";
    }

}
