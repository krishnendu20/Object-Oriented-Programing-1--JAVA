package com.pkg2;

import com.pkg1.ClassA;

public class ClassZ extends ClassA {

	private int z1;
	protected int z2;
	public int z3;
	int z4;

	void show() {

		super.a2 = 10;
		super.a3 = 10;
		// error: a1 has private access in ClassA
		// super.a1 = 10;

		// error: a4 is not public in ClassA; cannot be accessed from outside package
		// super.a4 = 10;
	}
}