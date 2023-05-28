package com.springcore.Lifecycle;

// Using Annotation @PostConstruct and PreDestroy

public class Subject {
	
private String topic;

public String getTopic() {
	return topic;
}

public void setTopic(String topic) {
	System.out.println("setting value S");
	this.topic=topic;
}

@Override
public String toString() {
	return "Subject [topic=" + topic + "]";
}

//@PostConstruct
public void init() {
	System.out.println("Inside of S");
}

//@PreDestroy
public void end() {
	System.out.println("ending method S");
}

}
