package com.smitha.aop.employee;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    public boolean isActiveEmployee(){
        return true;
    }
    public boolean isActiveManager(){
        return true;
    }
    public boolean isActiveEmployeeDirector(int years,String name){
        return false;
    }

    public boolean isActiveEmployeeDirector(int years){
        return false;
    }

    public void  getAge(){
        throw new NumberFormatException();
    }


}
