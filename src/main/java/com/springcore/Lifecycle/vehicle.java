package com.springcore.Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// Using Initializing and Disposable Interfaces

public class vehicle implements InitializingBean, DisposableBean {
private int Stroke;

public int getStroke() {
	return Stroke;
}

public void setStroke(int stroke) {
	System.out.println("Setting V");
	Stroke = stroke;
}

@Override
public String toString() {
	return "vehicle [Stroke=" + Stroke + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	//init
	System.out.println("Inside Initializing method V");
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	//destroy
	System.out.println("Inside disposable method V");
}


}
