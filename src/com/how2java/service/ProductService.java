package com.how2java.service;

import org.springframework.stereotype.Component;

@Component
public class ProductService {

    public void doSomeService() {
        try {
            Thread.sleep(5000);
            System.out.println("doSomeService");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doSomeServiceWhithoutSlepp() {

        System.out.println("doSomeServiceWhithoutSlepp");
    }
}