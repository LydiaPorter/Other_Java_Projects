package lydia.porter.car;
import java.util.*;

import lydia.porter.carComponent.Engine;

public class Car {
	//let's make some attributes/properties
	//not building a car here; just the blueprint
	String color;
	int numDoors;
	String doorType;
	int numWheels;
	String brand;
	Long hardware;
	double price;
	Engine engine = new Engine();		
	
	public Car() {
		//user builds car
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the color for your car: ");
		color = input.nextLine();
		
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

} //this defines object; this is the blueprint
