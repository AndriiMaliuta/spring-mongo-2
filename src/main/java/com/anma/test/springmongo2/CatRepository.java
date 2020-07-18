package com.anma.test.springmongo2;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatRepository extends MongoRepository<Cat, String> {

    List<Cat> findAllByName(String name);
}
