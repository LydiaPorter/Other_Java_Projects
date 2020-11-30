package lydia.porter.car;

import lydia.porter.carComponent.Engine;

public class Truck extends Vehicle { //"extends Vehicle" makes an "is-a" relationship
	//inherit 
	int bed_length;
	String color;
	int numDoors;
	String doorType;
	Long hardware;
	Engine engine = new Engine();
	//new component like engine for "has-a"
	
	
	public Truck() {
		
	}
	
	public void start() {
		System.out.println("you started the car");
	}

}
