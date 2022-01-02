package org.instance;

public class Class1 {
	int a;
	private void sample() {
		a = 100;
		System.out.println(a);
	}
	private void sample1() {
		System.out.println(a);

	}
	public static void main(String[] args) {
		Class1 c = new Class1();
		c.sample();
		c.sample1();
		
		Class1 c1 = new Class1();
		c1.sample1();
		c1.sample();
		
		
		
		
		
		
		
		
	}

}
