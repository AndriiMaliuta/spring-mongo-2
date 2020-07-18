package com.anma.test.springmongo2.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class CatsController {

    public String getCatsPage() {
        return "cats";
    }

}
