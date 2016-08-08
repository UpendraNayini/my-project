package com.niit.shoppingart;


public class TestCategory {
	
	public static void main(String[] args){
		
		//you have to ask context factory
		
	AnnotationConfigApplicationContext context = new context AnnotationConfigApplicationContext();
		
		
		context.scan("com.niit");
		context.refresh();
		
		context.getBean("category");
		
		System.out.println("Bean created successfully");
		
	}

}


