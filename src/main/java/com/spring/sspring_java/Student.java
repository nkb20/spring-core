package com.spring.sspring_java;

public class Student {
	 private String name;
private int mobileNumber;

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}
	
	public int getmobileNumber() {
	return mobileNumber;
		
	}
public void setmobileNumber(int mobileNumber) {
	System.out.println("Setting mobileNumber");
	this.mobileNumber=mobileNumber;
}

@Override
public String toString() {
	return "Student [name=" + name + ", mobileNumber=" + mobileNumber + "]";
}

	
	 

}
