package com.smitha.aop.target;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.tools.Traceable;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggingPrinter {

   /* @DeclareParents(value="HomePrinter",defaultImpl = HomePrinter.class)
    public Printer p;*/

    @Pointcut("this(com.smitha.aop.target.Printer)")
    private void test(){}


    @Pointcut("target(com.smitha.aop.target.Printer)")
    private void test1(){}

    // this works because this uses jdkproxy
    @After(value="test()")
    public void logPrinter(JoinPoint joinPoint){
       // System.out.println("logPrinter this"+joinPoint.getThis());
       // System.out.println("logPrinter this"+joinPoint.getTarget());
        System.out.println(" ******************* ");
        System.out.println("this  method name   :"+joinPoint.getSignature().getName());


    }

   //Spring AOP (interface) use jdk proxy so use target


    @After(value="test1()")
    public void logPrinter2(JoinPoint joinPoint){
      //  System.out.println("logPrinter target"+joinPoint.getThis());
       // System.out.println("logPrinter target"+joinPoint.getTarget());
        System.out.println(" &&&&&&&&&&&&&&&&&& ");
        System.out.println("target method name   :"+joinPoint.getSignature().getName());

    }

  /*  @After("this(com.smitha.aop.target.OfficePrint)")
    public void logPrinter4(JoinPoint joinPoint){
        System.out.println(" *********this********** ");
        System.out.println("logPrinter method name   :"+joinPoint.getSignature().getName());





    }*/

    // target didn't work because HomePrinter is not of type Printer
    // if Home Printer does not implement any interface
    //or proxyClass  true then point cut will work (CGLIB)

  /*  @After("target(com.smitha.aop.target.OfficePrint)")
    public void logPrinter3(JoinPoint joinPoint){
        System.out.println(" &&&&&&&&Target&&&&&&&&&& ");
         System.out.println("logPrinter method name   : "+joinPoint.getSignature().getName());



    }*/
}
