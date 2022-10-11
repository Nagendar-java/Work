package com.work.java8;

@FunctionalInterface
public interface Display {

	void show();
	//System.out.println("welcome to java training");
	//void disp();
	static void print() {
		System.out.println("welcome to java training");
		
	}
}
