package lydia.porter.dogHouse;

public class Dog {
	//scope: class level
	private int numTimesFed = 0;
	private boolean sleeping = false;
	private String name = "Rover";
	
	//my methods
	/*
	public String getName() {
		return this.name;
		//access this dog and not another dog
	}
	*/
	
	
	public void wakeUp() {
		System.out.println("WAKING UP");
		this.sleeping = this.setSleeping(false);
		this.numTimesFed = this.setNumTimesFed(0);
		
	}
	
	//SETTERS
	public int setNumTimesFed(int numTimesFed) {
		this.numTimesFed = numTimesFed;
		return numTimesFed;
	}

	public boolean setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
		return sleeping;
	}

	//////////////
	public String getName() {
		return name;
	}

	public void sleep() {
		System.out.println("sleeping");
		this.sleeping = setSleeping(true);
		
	}
	
	public void hear(String sound) {
		if (this.sleeping == true) {
			return;
		}
		else if (sound.equals(name)) {
			System.out.println("WAG TAIL");
		}
		else if(sound.equals("ding-dong")) {
			System.out.println("BARK BARK BARK BARK BARK");
		}
		else {
			return; //do nothing
		}
		
		
	}
	
	public void feed() {
		if(this.sleeping == true) {
			return;
		}
		else {
			this.numTimesFed ++;
		}
		if(this.numTimesFed > 2) {
			System.out.println("YAWN");
		}
		else {
			System.out.println("YUM");
		}
	}
	
	public Dog() {
		//scope: constructor level
	}

}
