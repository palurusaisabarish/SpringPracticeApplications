package com.example.JavaBasedConfigSpring;

public class Desktop implements Computer{

	public Desktop(){
		System.out.println("Desktop Object is Created");
	}
	
	public void complie() {
		System.out.println("Compiling using Desktop...");
	}
}
