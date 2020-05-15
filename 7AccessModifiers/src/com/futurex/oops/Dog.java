package com.futurex.oops;

public class Dog extends Animal{
	public void printDogValues() {
		System.out.println("From dog class ----------------------------");
		System.out.println("publicVar "+publicVar);
		System.out.println("protectedVar "+protectedVar);
		System.out.println("privatedVar is privated in Animal class, dont visible on dog class");
		System.out.println("noModVar "+noModVar);	
	}

}
