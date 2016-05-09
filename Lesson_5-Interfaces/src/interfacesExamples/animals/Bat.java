package interfacesExamples.animals;

import interfacesExamples.interfaces.AdvancedFlyer;

//A bat is a mammal but it can also fly. Not all mammals can fly, so the bat implements 
//the interface AdvancedFlyer which extends the interfaces Flyer and Navigator.
public class Bat extends Mammal implements AdvancedFlyer {
	//Implementation of the method from the super class Animal. 
	public void speak() {
		System.out.println("Squikk");

	}

	//Implementation of the method from the interface Flyer.
	public void fly() {
		System.out.println("fly like a bat");

	}

	//Implementation of the method from the interface Navigator.
	public void navigate() {
		System.out.println("navigate like a bat");

	}

	//Implementation of the methods from the interface AdvancedFlyer.
	public void takeOff() {
		System.out.println("takeOff like a bat");

	}

	public void land() {
		System.out.println("land like a bat");

	}

}
