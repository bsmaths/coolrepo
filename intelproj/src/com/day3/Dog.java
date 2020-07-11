package com.day3;

public class Dog {
	public void paly(String item) {
		if(item.equals("stone")){
			System.out.println("dog runs.............");
		}
		else if(item.equals("stick")) {
			System.out.println("You beat I bite.......");
		}
		else if(item.equals("biscuit")) {
			System.out.println("yummy yummy.....wags tail....");
		}
	}
	public static void main(String[] args) {
		Dog tiger=new Dog();
		tiger.paly("stick");
	}
}
