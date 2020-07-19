package com.anma.test.springmongo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private final CatRepository catRepository;

    @Autowired
    public Bootstrap(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (catRepository.count() == 0) {
            loadData();
        }
    }

    private void loadData() {
        Cat dockerCat = new Cat();
        dockerCat.setName("dockerCat");
        dockerCat.setAge("7");
        dockerCat.setColor("white");
        catRepository.save(dockerCat);
    }
}
