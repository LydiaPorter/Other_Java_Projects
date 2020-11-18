package lydia.porter.carComponent;

//no public static void main

public class Engine {
	public int cylinders; //public so that other things can see/use it
	public String type;
	
	
	public Engine() {
		//constructor
		//new object -> constructor automatically called
		cylinders = 6;
		type = "v";
		
	}
	
	public void engine_description() {
		//public = visible by other things
		System.out.println(type + " " + cylinders);
				
		
	}

}
