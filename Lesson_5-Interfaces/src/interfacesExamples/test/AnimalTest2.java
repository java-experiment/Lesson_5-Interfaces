package interfacesExamples.test;

import interfacesExamples.animals.Animal;
import interfacesExamples.animals.Ant;
import interfacesExamples.animals.Bat;
import interfacesExamples.animals.Cocroach;
import interfacesExamples.animals.Dog;
import interfacesExamples.animals.Hen;
import interfacesExamples.animals.Sparrow;
import interfacesExamples.interfaces.AdvancedFlyer;
import interfacesExamples.interfaces.Flyer;
import interfacesExamples.interfaces.Jumper;

public class AnimalTest2 {

	public static void main(String[] args) {

		Animal[] animals = new Animal[6];
		animals[0] = new Dog();
		animals[1] = new Bat();
		animals[2] = new Hen();
		animals[3] = new Sparrow();
		animals[4] = new Ant();
		animals[5] = new Cocroach();

		//Using polymorphism to iterate over all the objects of type animal.
		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();

			//Checking if the handled object IMPLEMETS the interface Flyer.
			if (animals[i] instanceof Flyer) {
				//An interface type variable can be assigned instances of classes that implement the interface.
				//The animals[i] reference is of Animal type and cannot invoke the method fly(). By casting it to 
				//a Flyer type (after checking it is of that type) to a Flyer type variable, it is now possible to 
				//invoke the fly() method of that animal. So for animals that implement the interface Flyer, the fly()
				//method will be invoked.
				Flyer f = (Flyer) animals[i];
				f.fly();
			}

			//Same as above - for animals that implement the AdvancedFlyer interface, the takeoff() & land() methods
			//will be invoked.
			if (animals[i] instanceof AdvancedFlyer) {
				AdvancedFlyer f = (AdvancedFlyer) animals[i];
				f.takeOff();
				f.land();
			}

			//Same as above - for animals that implement the Jumper interface, the jump() method will be invoked.
			if (animals[i] instanceof Jumper) {
				Jumper f = (Jumper) animals[i];
				f.jump();
			}

			System.out.println("=============");
		}
	}

}
