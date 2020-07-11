package com.day3;
public class HelpLine911 {
	public void handle(Dogs d) {
		System.out.println("I will handle dog problems...");
	}
	public void handle(Tiger t) {
		System.out.println("I will handle tiger problem...");
	}
	public void handle(OfficeBoy ob) {
		System.out.println("i will handle officeboy problem...");
	}
	public static void main(String[] args) {
		Dogs pinky=new Dogs();
		new Operator().connect(pinky);
	}
}
class Operator{
	public void connect(Item i) {
		i.connect();
	}
}
abstract class Item{abstract void connect();}
class Dogs extends Item{
	void connect() {new HelpLine911().handle(this);}
}
class Tiger extends Item{
	void connect() {new HelpLine911().handle(this);}
}
class OfficeBoy extends Item{
	void connect() {new HelpLine911().handle(this);}
}