package org.example.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {

    @Before("execution(* org.example.TaskManager.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Переде вызовом метода: " + joinPoint.getSignature().getName());

    }

    @AfterReturning(value = "execution(* org.example.TaskManager.*(..))", returning = "result")
    public void logAfter(JoinPoint joinPoint,Object result) {
        System.out.println("Переде вызовом метода: " + joinPoint.getSignature().getName() +  " результат - " + result);

    }
    @AfterThrowing(value = "execution(* org.example.TaskManager.*(..))",throwing = "iskl")
    public void logThrowing(JoinPoint joinPoint, Exception iskl) {
        System.out.println("Переде вызовом метода: " + joinPoint.getSignature().getName()  + iskl);
    }

    @Around("execution(* org.example.TaskManager.*(..))")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("До метода: ");
        Object res = proceedingJoinPoint.proceed();
        System.out.println("После метода: ");
        return res;
    }


}
