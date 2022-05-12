package com.smitha.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

    @Pointcut("execution(boolean com.smitha.aop.employee..isActiveManager())")
    private void selectCalculate(){}

    @Before(value="selectCalculate()", argNames= "joinPoint")
    public void beforeAdvice(JoinPoint joinPoint)
    {
        System.out.println("entering method : "+joinPoint.getSignature().getName());

    }

    @Before("execution(boolean com.smitha.aop.employee..isActiveEmployee())")
    public void beforeAdvice2(JoinPoint joinPoint){
        System.out.println("entering method : "+joinPoint.getSignature().getName());
    }

    @AfterThrowing(value="execution(* *..getAge())",throwing="error")
    public void afterThrowingAdvice(JoinPoint jp, Throwable error)
    {
        System.out.println("After throwing method:"+jp.getSignature());

        System.out.println(error);
    }
    @Before("within(com.smitha.aop.employee.*)")
    public void beforeAdvice3(JoinPoint joinPoint){
        System.out.println("entering method : "+joinPoint.getSignature().getName());
    }

    @Around("this(com.smitha.aop.employee.Employee)")
    public void test(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("test");
        System.out.println(jp.getSignature().getName());
        jp.proceed();
    }

    @Around("target(com.smitha.aop.employee.Employee)")
    public void test2(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("test2");
        System.out.println(jp.getSignature().getName());
        jp.proceed();
    }

}
