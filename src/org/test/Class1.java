package org.test;

public class Class1 {
	static int a;
	private static void method() {
		System.out.println(a);
	}
	private static void method1() {
		System.out.println(a);
		method();

	}
	public static void main(String[] args) {
		method1();
	
	}
	
	public void method4() {
		System.out.println("method4");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}



