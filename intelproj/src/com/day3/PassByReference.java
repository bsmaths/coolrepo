package com.day3;

public class PassByReference {
	public static void main(String[] args) {
		PassByReference obj=new PassByReference();
		
		Laddu boondiladdu=new Laddu();
		System.out.println("Initial size of laddu....:"+boondiladdu.size);
		
		obj.test(boondiladdu);
		System.out.println("Now the laddu size....:"+boondiladdu.size);
	}	
	void test(Laddu laddu) {
		//he eats half of the laddu
		laddu.size=5;
	}
}
class Laddu{
	int size=10;
}