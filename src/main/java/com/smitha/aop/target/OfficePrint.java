package com.smitha.aop.target;

import org.springframework.stereotype.Component;

@Component
public class OfficePrint extends Print{

    public void print(){
        System.out.println("Hi Im OfficePrint");
    }
}
