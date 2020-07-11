package com.day3.noon;

import com.day3.AccessDemo;

public class DiffPackSubAccess extends AccessDemo{
	void testAccess() {
		System.out.println(pub);
		System.out.println(pro);
//		System.out.println(nomod);
//		System.out.println(pri);
	}
}

class DiffPackAccess {
	void testAccess() {
		AccessDemo obj=new AccessDemo();
		System.out.println(obj.pub);
//		System.out.println(obj.pro);
//		System.out.println(obj.nomod);
//		System.out.println(obj.pri);
	}
}