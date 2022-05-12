package com.smitha.aop.employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeAction {
    public void calculateBonus(){
        System.out.println("bonus is "+2000);

    }

    public int calculateBonusAndSalary(){
        System.out.println("calculateBonusAndSalary is "+2000);
        return 132000;
    }

    public String getName(){
        System.out.println("getName is "+"smitha");
        return "smitha";
    }
}
