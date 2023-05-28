package com.spring.sspring_java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        ApplicationContext context=
                new ClassPathXmlApplicationContext("stdPom.xml");

        Student std1=(Student) context.getBean("std1");
        Student std2=(Student) context.getBean("std2");
         
//        System.out.println(std.getName());
        System.out.println(std1);
        System.out.println(std2);
    }
}
