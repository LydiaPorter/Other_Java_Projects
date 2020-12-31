
public class RaceCar implements IRacer {
	String	myName;
	double	myMaxSpeed;
	double	myAcceleration;
	double	myCurrentSpeed;

	public RaceCar (String name, double maxSpeed, double acceleration) {
		myName = name;
		myMaxSpeed = maxSpeed;
		myAcceleration = acceleration;
		myCurrentSpeed = 0.0;
	}
	
	
	@Override
	public String getName() {
		
		return myName;
	}

	@Override
	public double getCurrentSpeed() {
		return myCurrentSpeed;
	}

	@Override
	public void resetCurrentSpeed() {
		myCurrentSpeed = 0.0;
		
		
	}

	@Override
	public void accelerate() {
		myCurrentSpeed += myAcceleration;
		if (myCurrentSpeed == myMaxSpeed) {
			myCurrentSpeed = myMaxSpeed;
		}
		
	}
	
	
	
	
	

}

