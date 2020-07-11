package com.revision;

public class EB extends Government{
	public void action() {
		new ESeva().collectPayment(this);
	}
}

//1. I call the eseva and pass the eb object
//new ESeva().collectPyament(new EB())
//2. I call the eb office and ask eb office to call eseva and process itself...
//new EB().action();