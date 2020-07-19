package com.anma.test.springmongo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

//(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@SpringBootApplication
public class SpringMongo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringMongo2Application.class, args);
    }

}
