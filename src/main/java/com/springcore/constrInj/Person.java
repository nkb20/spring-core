package com.springcore.constrInj;

import java.util.List;

public class Person {

	private String name;
	private int personId;
	private Certi cer;
	private List<Integer> list;
	
	public Person (String name, int personId, Certi cer, List<Integer> list) {
		this.name=name;
		this.personId=personId;
		this.cer=cer;
		this.list=list;
	}

	@Override
	public String toString() {
		
		return this.name+", "+ this.personId+", "+this.cer.name1+", "+this.list;
	}
	
	
}
