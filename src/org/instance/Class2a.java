package org.instance;

public class Class2a extends Class2 {
	int a = 10;
	public void sample() {
		int a = 20;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	private void sample1() {

	}
	public static void main(String[] args) {
		Class2a c= new Class2a();
		c.sample();
	}
	

}
