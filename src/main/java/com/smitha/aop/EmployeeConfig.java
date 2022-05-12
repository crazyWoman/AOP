
package com.smitha.aop;

import com.smitha.aop.employee.Employee;
import com.smitha.aop.employee.Manager;
import com.smitha.aop.target.HomePrinter;
import com.smitha.aop.target.OfficePrint;
import com.smitha.aop.target.Print;
import com.smitha.aop.target.Printer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class EmployeeConfig {
    public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(EmployeeConfig.class);
    /*   Employee emp =  context.getBean(Employee.class);
        emp.isActiveManager();
        emp.isActiveEmployee();*/
       // emp.getAge();
      /*  Manager manager =  context.getBean(Manager.class);
        manager.getPosition();*/
       /* try {
            emp.getAge();
        }catch(Exception e){
            System.out.println("*********");
        }*/

     context.getBean(Printer.class).print();

      /*  Print print = context.getBean(OfficePrint.class);
        print.print();*/
    }

}
