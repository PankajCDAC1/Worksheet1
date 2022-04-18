package com.SpringWorksheet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Emp Emp1 = (Emp) context.getBean("Emp1");
        System.out.println(Emp1);


    }
}
