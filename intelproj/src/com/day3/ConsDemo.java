package com.day3;

public class ConsDemo {
	public static void main(String[] args) {
		//new Animal();
		new Animal("hello");
	}
}
abstract class LivingObject{
	public LivingObject() {
		System.out.println("living cons no param called...");
	}
	public LivingObject(String s) {
		this();
		System.out.println("living object cons called....");
		
	}
}
class Animal extends LivingObject{
	public Animal() {		
		System.out.println("animal object cons called....");
	}
	public Animal(String s) {
		super(s);
		
	}
}
