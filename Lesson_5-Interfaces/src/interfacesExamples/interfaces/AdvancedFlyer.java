package interfacesExamples.interfaces;

//An interface can extend other interfaces (even multiple inheritance). By extending
//other interfaces, the class that implements it must also implement the methods of the
//interfaces that this interface extends. It can extend multiple unrelated interfaces.  
public interface AdvancedFlyer extends Flyer, Navigator {
	//All members in the interface are ABSTRACT AND PUBLIC by default.
	void takeOff();

	void land();
}
