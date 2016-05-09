package interfacesExamples.animals;

import interfacesExamples.interfaces.Flyer;
import interfacesExamples.interfaces.Jumper;

//A class can implement many unrelated interfaces.
public class Cocroach extends Insect implements Flyer, Jumper {
	//Implementation of the method from the super class Animal.
	public void speak() {
		System.out.println("sound of Cocroach");

	}

	//Implementation of the method from the interface Flyer.
	public void fly() {
		System.out.println("fly like a Cocroach");

	}

	//Implementation of the method from the interface Jumper.
	public void jump() {
		System.out.println("jump like a Cocroach");
	}

}
