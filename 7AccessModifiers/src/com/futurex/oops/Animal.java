package com.futurex.oops;

public class Animal {
	int noModVar;
	private int privateVar;
	protected int protectedVar;
	public int publicVar;
	
	protected Animal() {
		this.noModVar = 1;
		this.privateVar = 2;
		this.protectedVar = 3;
		this.publicVar = 4;
		
	}
	
	public void printValues () {
		System.out.println("From animal class int noModVar - privateVar - protectedVar - publicVar");
		System.out.println("noModVar "+noModVar);
		System.out.println("privateVar "+privateVar);
		System.out.println("protectedVar "+protectedVar);
		System.out.println("publicVar "+publicVar);
	}

}
