package com.day3;

public class OverLoadOverRideDemo {
	public static void main(String[] args) throws Exception{
		new Child().test(1);
	}
}

class Parent {
	Parent() throws Exception{
		
	}
}
class Child extends Parent{
	public Child()throws Exception {
		// TODO Auto-generated constructor stub
	}
	//overloading is about having two method with the same name but with different parameters
	//virtual method invocation....
	public void test() {
		
	}
	public int test(int i) {
		return 1;
	}
}