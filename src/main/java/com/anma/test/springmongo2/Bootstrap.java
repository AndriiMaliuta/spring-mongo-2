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
        Cat murzik = new Cat();
        murzik.setName("Murzik");
        murzik.setAge(7);
        murzik.setColor("white");
        catRepository.save(murzik);
    }
}
