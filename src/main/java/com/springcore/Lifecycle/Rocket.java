package com.springcore.Lifecycle;

//LifeCycle of bean using Xml file
public class Rocket {
	private int Thruster;

	public int getThruster() {
		return Thruster;
	}

	public void setThruster(int Thruster) {
		System.out.println("Setting property R");
		this.Thruster = Thruster;
	}

	@Override
	public String toString() {
		return "Number of Thruster: "+this.Thruster;
	}
	
	//Life cycle method
	public void init() {
		System.out.println("Inside init method of R");
	}
public void destroy() {
	System.out.println("Inside Destroy method R");
}
	
}
