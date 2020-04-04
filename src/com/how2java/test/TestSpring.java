package com.how2java.test;

import com.how2java.pojo.Category;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Category category = (Category) context.getBean("category");

        System.out.println(category.getName());
    }
}