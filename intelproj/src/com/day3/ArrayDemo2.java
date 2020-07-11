package com.day3;

public class ArrayDemo2 {
	ClassRoom myclassrooms[]=new ClassRoom[5];
	public ArrayDemo2() {
		for(int i=0;i<myclassrooms.length;i++) {
			myclassrooms[i]=new ClassRoom("Currently not assigned......");
		}
	}
public static void main(String[] args) {
	ArrayDemo2 obj=new ArrayDemo2();
	System.out.println(obj.myclassrooms[2].subject);
}
}


class ClassRoom{
	String subject;//instance variable
	public ClassRoom(String subject) {
		//how will I associate the method variable to instance variable
		this.subject=subject;//this keyword refers to current object
		//cannot use this keyword inside static method...
	}
}
