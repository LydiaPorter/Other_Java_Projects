package lydia.racing;

public class RaceCar implements IRacer {
	String myName = "Racer X";
	double myMaxSpeed = 150.0;
	double myAcceleration = 10.0;
	double myCurrentSpeed;
	
	
	public RaceCar() {
		
	}

	@Override
	public String getName() {
		
		return myName;
	}

	@Override
	public double getCurrentSpeed() {
		// TODO Auto-generated method stub
		return myCurrentSpeed;
	}

	@Override
	public void resetCurrentSpeed() {
		myCurrentSpeed = 0.0;
		
	}

	@Override
	public void accelerate() {
		myCurrentSpeed += myAcceleration;
		if (myCurrentSpeed > myMaxSpeed) {
			myCurrentSpeed = myMaxSpeed;
		}
		
	}

}
