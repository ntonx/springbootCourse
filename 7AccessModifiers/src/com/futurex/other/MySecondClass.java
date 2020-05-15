package com.futurex.other;

import com.futurex.oops.Animal;

public class MySecondClass extends Animal {

	public MySecondClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void printDogValues() {
		System.out.println("Inside printDogValues 2nd Class---------------------------");
		System.out.println("publicVar "+publicVar);
		System.out.println("protectedVar "+protectedVar);
		System.out.println("noModVar hasn't defined a access modifier, it's not accesible");
		
	}

}
