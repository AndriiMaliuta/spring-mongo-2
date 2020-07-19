package com.anma.test.springmongo2.controllers;

import com.anma.test.springmongo2.Cat;
import com.anma.test.springmongo2.CatRepository;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CatsRESTController.REST_API)
public class CatsRESTController {

    final static String REST_API = "/rest/api/v1/cats";

    private final CatRepository catRepository;
    private final Environment environment;

    public CatsRESTController(CatRepository catRepository, Environment environment) {
        this.catRepository = catRepository;
        this.environment = environment;
    }

    @GetMapping("")
    public List<Cat> getAllCAts() {
        return catRepository.findAll();
    }

    @GetMapping("/{catName}")
    public List<Cat> findCatById(@PathVariable String catName) {
        return catRepository.findAllByName(catName);
    }

    @PostMapping
    public Cat createCat( @RequestBody Cat catModel) {
        Cat newCat = new Cat();
        newCat.setName(catModel.getName());
        newCat.setColor(catModel.getColor());
        newCat.setAge(catModel.getAge());

        catRepository.save(newCat);

        return newCat;
    }

}
