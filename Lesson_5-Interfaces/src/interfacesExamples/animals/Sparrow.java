package interfacesExamples.animals;

import interfacesExamples.interfaces.Flyer;

public class Sparrow extends Bird implements Flyer {
	//Implementation of the method from the super class Animal.
	public void speak() {
		System.out.println("Zif Zif");

	}

	//Implementation of the method from the interface Flyer.
	public void fly() {
		System.out.println("fly like a Sparrow");

	}

}
