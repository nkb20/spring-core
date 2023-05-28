package com.springcore.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Lifecycle/lifeCyConfig.xml");
		//registering shutdown hook
		context.registerShutdownHook();
		
		
		Rocket r = (Rocket) context.getBean("r1");
		System.out.println(r);
		
		vehicle v=(vehicle) context.getBean("v1");
		System.out.println(v);
		
		Subject s=(Subject) context.getBean("s1");
		System.out.println(s);
	}

}
