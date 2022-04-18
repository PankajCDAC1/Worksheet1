package com.SpringWorksheet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml ");
       Empl Emp2 = (Empl) context.getBean("Emp2");
        System.out.println(Emp2);


    }
}
