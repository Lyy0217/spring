package com.how2java.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class PerformanceAspect {

    @Around(value = "execution(* com.how2java.service.ProductService.* (..))")
    public Object performance(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime();

        System.out.println(new Date().toString());

        Object object = joinPoint.proceed();

        long endTime = System.nanoTime();
        System.out.println(new Date().toString());

        System.out.println("程序运行耗时：" + (endTime - startTime) + "ns");

        return object;
    }
}