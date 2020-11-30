package person;

import lydia.porter.car.*;

public class Person {
	int age; 
	String name;
		
	public Person() {
		
	}

	public void startCar(Car car) {
		car.start();
	}
	
	
	public void startTruck(Truck truck) {
		truck.start();
	}
	
	
}


//cohesion - how well objects come together
//cohesive - want high cohesive objects
//should work together well
/*
 * coupling
 * require each other to work
 * build things with the idea of reuse in mind
 * we want to be able to use it over and over
 * not reliant on other things
 * we want low coupling
 */