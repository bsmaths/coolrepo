package com.day5;

import java.util.Scanner;

public class FanDemo {
	public static void main(String[] args) {
		//ShaitanFan badfan=new ShaitanFan();
		Khaitan goodfan=new Khaitan();
		
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Please press enter to pull fan....string...");
			System.out.println("press Ctr+C to exit..");
			scan.next();
			goodfan.pull();
		}
	}
}
