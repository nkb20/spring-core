package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/springcore/collection/collection.xml");
//	
		Planet planet = (Planet) context.getBean("earth");

		System.out.println(planet.getName());
		System.out.println(planet.getWeather());
		System.out.println(planet.getContinent());
		System.out.println(planet.getPopulation());
		System.out.println(planet.getProps());

	}
}
