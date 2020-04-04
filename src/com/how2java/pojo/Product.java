package com.how2java.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;

@Component
public class Product {
    private int id;
    private String name;

//    @Autowired
//    @Resource(name = "category")
    private Category category;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Autowired
    @Resource(name = "category")
    public void setCategory(Category category) {
        this.category = category;
    }
}