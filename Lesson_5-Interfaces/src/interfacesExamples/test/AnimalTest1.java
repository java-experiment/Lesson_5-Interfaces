package interfacesExamples.test;

import interfacesExamples.animals.Animal;
import interfacesExamples.animals.Ant;
import interfacesExamples.animals.Bat;
import interfacesExamples.animals.Cocroach;
import interfacesExamples.animals.Dog;
import interfacesExamples.animals.Hen;
import interfacesExamples.animals.Sparrow;

public class AnimalTest1 {

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
		}
	}

}
