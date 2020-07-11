package com.day3;

public class PassByValue {
	public static void main(String[] args) {
		int i=10;float f=10.5f;byte b=124;double d=1234;char c='a';//primitive
		//by default all primitive variables follow pass by value.....
		PassByValue obj=new PassByValue();
		obj.testMethod(i);
		System.out.println(i);
	}
	
	void testMethod(int i) {
		i=i+100;
		//return i;
	}
}
