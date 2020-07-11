package com.day3;

public class StaticDemo {
	//static block, static variable, static method, static class
	private StaticDemo() {
		System.out.println("cons of static demo called....");
	}
	static {
		System.out.println("some initialization you can for static methods in static block...");
		System.out.println("static block called...");
	}
	static String s;
	static void met() {
		
	}
	static void met2() {
		
	}
	static class A{//inner class or class within a class
		
	}
}

