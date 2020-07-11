package com.day3;

public class ArrayDemo {
public static void main(String[] args) {
	//by default arrays have two distinct properties, though being declared with primitive
	//1. it is an object by default - pass by reference
	//2. it is initialized by default....
	ArrayDemo ad=new ArrayDemo();
	int i[]=new int[5];
	int a=10;
	System.out.println("Before Passing...:"+i[0]);
	ad.testArray(i);
	System.out.println("After Passing...:"+i[0]);
}

	void testArray(int abc[]) {
		abc[0]=101010;
	}
}
