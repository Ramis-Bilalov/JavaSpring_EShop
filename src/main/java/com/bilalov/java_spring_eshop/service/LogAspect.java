package com.bilalov.java_spring_eshop.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* com.bilalov.java_spring_eshop.controllers..*.*(..))")
    private void anyMethod() {

    }

    @Before("anyMethod()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Log before: " + joinPoint);
    }

    @AfterReturning("anyMethod()")
    public void logAfterReturning(JoinPoint joinPoint) {
        System.out.println("Log AfterReturning: " + joinPoint);
    }

    @AfterThrowing("anyMethod()")
    public void logAfterThrowing(JoinPoint joinPoint) {
        System.out.println("Log AfterThrowing : " + joinPoint);
    }

    @Around("anyMethod()")
    public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Log around before : " + System.currentTimeMillis());
        Object value;
        try {
            value= pjp.proceed();
        } catch (Throwable t) {
            System.out.println("Log around after with error: " + System.currentTimeMillis());
            return null;
        }
        System.out.println("Log around after : " + System.currentTimeMillis());
        return value;
    }
}
