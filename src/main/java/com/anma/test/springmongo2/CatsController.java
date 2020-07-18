package com.anma.test.springmongo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatsController {

    private final CatRepository catRepository;

    public CatsController(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @GetMapping("/")
    public List<Cat> getAllCAts() {
        return catRepository.findAll();
    }
}
