package com.revision;

public class Metro extends Government{
@Override
public void action() {
	new ESeva().collectPayment(this);
}
}
