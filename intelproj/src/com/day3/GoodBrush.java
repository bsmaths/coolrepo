package com.day3;

public class GoodBrush {
	//RedPaint rp;//I make it specific
	Paint pt;//Generic
	public void doPaint() {
		//convert the condition to classes
		//create a hierarchy of classes
		//create a relationship between the hierarchial class and using class
		System.out.println(pt);
	}
}
//relation between paint and redpaint is - generalization (which is kind of)
//relation between paint and paintbrush is - association/aggregation - part of
abstract class Paint{
	
}
class RedPaint extends Paint{
	public String toString() {return "Red colour paint....";}
}
class BluePaint extends Paint{
	public String toString() {return "Blue colour paint....";}
}
class GreenPaint extends Paint{
	public String toString() {return "Green colour paint....";}
}
//Conditions - RedPaint, BluePaint, GreenPaint
//Hierarchy class or classifier of the above could be - Paint - because Redpaint is a kind of paint
//Paintbrush is now associated with Paint....