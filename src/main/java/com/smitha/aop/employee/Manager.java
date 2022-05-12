package com.smitha.aop.employee;

import org.springframework.stereotype.Component;

@Component
public class Manager extends Employee{
    public void getPosition(){
        System.out.println("hi");

    }
}
