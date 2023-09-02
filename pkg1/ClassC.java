package com.pkg1;

public class ClassC extends ClassA {

	private int c1;
	protected int c2;
	public int c3;
	int c4;

	void show() {
		super.a4 = 10;
		super.a3 = 20;
		super.a2 = 5;
		// error: a1 has private access in ClassA
		// super.a1 = 200;
	}
}