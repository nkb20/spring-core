package com.sprincore.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new 
				ClassPathXmlApplicationContext("com/sprincore/Autowiring/Autoconfig.xml");
		
				A a=(A)context.getBean("a");
				System.out.println(a);
//				System.out.println(a.getObj().getY());
	}

}
