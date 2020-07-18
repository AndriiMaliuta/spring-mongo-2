package com.anma.test.springmongo2.controllers;

import com.anma.test.springmongo2.CatRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatsController {

    private final CatRepository catRepository;

    public CatsController(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @GetMapping("/cats")
    public String getCatsPage(Model model) {

        model.addAttribute("cats", catRepository.findAll());

        return "cats";
    }

}
