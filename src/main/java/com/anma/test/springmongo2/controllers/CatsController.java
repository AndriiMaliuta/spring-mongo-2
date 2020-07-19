package com.anma.test.springmongo2.controllers;

import com.anma.test.springmongo2.Cat;
import com.anma.test.springmongo2.CatRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CatsController {

    private final CatRepository catRepository;

    public CatsController(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @GetMapping("/cats")
    public String getCatsPage(Model model) {

        model.addAttribute("cats", catRepository.findAll());
        model.addAttribute("cat", new Cat());

        return "cats";
    }


    @PostMapping("/create-cat")
    public String creatCat(@ModelAttribute Cat catModel, Model model) {

        Cat newCat = new Cat();
        newCat.setName(catModel.getName());
        newCat.setColor(catModel.getColor());
        newCat.setAge(catModel.getAge());

        catRepository.save(newCat);

        return "redirect:/cats";
    }

}
