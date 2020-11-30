package lydia.porter.car;

public class Vehicle {
	private int occupancy; //if you don't specify, it will automatically set them to public
	//public means can be accessed freely
	//private - can only be accessed by things in this class, by objects
	//that defined it
	//protected - only methods that created it or inherit it can use this class
	private int top_speed;
	private int weight = 2500;
	private int length;
	protected double price;
	public String brand = "Ford";
	//so we called this one final, so now you can't change the brand in the car
	private String model;
	private int numWheels;
	
	//once declared as final, it can never be changed again
	//remember to put attributes at class level
	//private, public, or protected
	
	public Vehicle() {
		//final int weight = 25;
		//keyword final must be used on declaration statement
		//"final" used on constant values
		
	}
	
	//only altered in ways that we allow 
	//GETTERS AND SETTERS
	//source ->
	//generate getters and setters
	public int getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}

	public int getTop_speed() {
		return top_speed;
	}

	public void setTop_speed(int top_speed) {
		this.top_speed = top_speed;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<=50000.00) {
			this.price = price;
		}
		else {
			System.out.println("that price is too high");
		}
		
		/////////////////////////////
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

}
