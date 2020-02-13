package com.app;

public class labTest {
	int a;
	int b;
	static int c;

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	void m1(int a, int b) {
		this.a = a;
		this.b = b;
		int c = a + b;
	}

	public static void main(String[] args) {
		labTest om = new labTest(10, 20);
		System.out.println("This is Maish");
		om.a=10;
		om.b=10;
		System.out.println(om);
		
		
	}

	public labTest(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

}
