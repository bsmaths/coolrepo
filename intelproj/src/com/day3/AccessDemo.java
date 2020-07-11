package com.day3;
public class AccessDemo {
	public int pub;
	protected int pro;
	int nomod;
	private int pri;
	
	void testAccess() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(nomod);
		System.out.println(pri);
	}
}
class SubAccess extends AccessDemo{
	void testAccess() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(nomod);
//		System.out.println(pri);
	}
}
class Access{
	void testAccess() {
		AccessDemo obj=new AccessDemo();
		System.out.println(obj.pub);
		System.out.println(obj.pro);
		System.out.println(obj.nomod);
//		System.out.println(obj.pri);
	}
}