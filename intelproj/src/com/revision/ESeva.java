package com.revision;

public class ESeva {//virtual method invocation....
	//data changes behavior changes...
	public void collectPayment(EB ebbill) {
		System.out.println("Payment collected for eb....");
	}
	public void collectPayment(Metro metrobill) {
		System.out.println("Payment collected for metro...water...");
	}
}


//new ESeva().collectPayment(new EB())
