package com.pkg1;

public class ClassB {

	private int b1;
	protected int b2;
	public int b3;
	int b4;
	ClassA cA1;

	void show() {

		cA1.a4 = 10;
		cA1.a3 = 20;
		cA1.a2 = 20;
		// error: a1 has private access in ClassA
		// cA1.a1 = 10;
	}
}