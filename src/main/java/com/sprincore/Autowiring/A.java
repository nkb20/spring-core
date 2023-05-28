package com.sprincore.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

//	private int x;
	@Autowired
	private B obj;
	
//	public int getX() {
//		return x;
//	}
//	public void setX(int x) {
//		this.x = x;
//	}
	public B getObj() {
		return obj;
	}
//	@Autowired
	public void setObj(B obj) {
		System.out.println("class A");
		this.obj = obj;
	}
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	@Autowired
	public A(B obj) {
		super();
		this.obj = obj;
		System.out.println("inside Constructor of A");
	}
	@Override
	public String toString() {
		return "A [ obj" + this.obj + "]";
	}
	
	
}
