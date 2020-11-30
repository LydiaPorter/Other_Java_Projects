package lydia.porter.car;
import java.util.*;

import lydia.porter.carComponent.Engine;

public class Car extends Vehicle {
	//let's make some attributes/properties
	//not building a car here; just the blueprint
	String color;
	int numDoors;
	String doorType;
	Long hardware;
	Engine engine = new Engine();		
	
	public Car() {
		//user builds car
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the color for your car: ");
		color = input.nextLine();
		input.nextLine();
		price = 25000.00;
		//can only use/play with this when it's public
		//
		
		brand = "chevy";
		//won't work cause it's final
		input.close();
	}
	
	public void drive() {
		//now we have a drive method!
		if (engine.cylinders == 8) {
			System.out.println("I'm driving really fast!");
		}
		else {
			System.out.println("I'm driving!");
		}
		
	}

	public void start() {
		System.out.println("you started the car");
	}
	
	
} //this defines object; this is the blueprint
//more details -> more realistic