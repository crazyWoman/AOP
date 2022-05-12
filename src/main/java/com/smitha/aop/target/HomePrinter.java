package com.smitha.aop.target;


import org.springframework.stereotype.Component;

@Component
public class HomePrinter implements Printer{
    @Override
    public int print() {
        System.out.println("home printer");
        return 3;
    }
}
