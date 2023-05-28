package com.springcore.constrInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class consMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constrInj/constconfig.xml");
		
		Person a = (Person) context.getBean("p1");
		System.out.println(a);

		Addition add=(Addition)context.getBean("add1");
		add.Add();
	}
}
