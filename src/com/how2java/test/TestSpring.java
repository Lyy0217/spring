package com.how2java.test;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //表示这是一个Spring的测试类
@ContextConfiguration("classpath:applicationContext.xml")   //定位Spring的配置文件
public class TestSpring {

    @Autowired
    private Category category;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Category category = (Category) context.getBean("category");
//        Product product = (Product) context.getBean("product");
        ProductService productService = (ProductService) context.getBean("productService");

//        System.out.println(product.getName());
//        System.out.println(product.getCategory().getName());

        productService.doSomeService();

        System.out.println();

        productService.doSomeServiceWhithoutSlepp();
    }

    @Test
    public void test() {
        System.out.println("category Name = " + category.getName());
    }
}