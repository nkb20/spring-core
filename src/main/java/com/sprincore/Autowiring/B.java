package com.sprincore.Autowiring;

public class B {
	
	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		System.out.println("Class B");
		this.y = y;
	}
	

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public B(int y) {
		
		super();

	this.y = y;
	System.out.println("Inside constructor of class b");
	}

	@Override
	public String toString() {
//		return "B [y=" + y + "]";
	return "y= "+y;
	}

	
}


