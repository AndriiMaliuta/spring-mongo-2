package com.anma.test.springmongo2;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cats")
public class Cat {

    @Id
    private String id;

    private String name;
    private String age;
    private String color;

    public Cat(String id, String name, String age, String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
