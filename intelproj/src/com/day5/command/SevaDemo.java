package com.day5.command;

public class SevaDemo {
	public static void main(String[] args) {
		Seva seva=new Seva();
		seva.setCommand(new DeathCommand(), 2);
		seva.useCounter(2);
	}
}
