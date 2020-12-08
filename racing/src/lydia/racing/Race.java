package lydia.racing;

public class Race {
////////////////////////////////////////////////////////////////
//Copyright 2012, CompuScholar, Inc.
//
//This source code is for use by the students and teachers who 
//have purchased the corresponding TeenCoder or KidCoder product.
//It may not be transmitted to other parties for any reason
//without the written consent of CompuScholar, Inc.
//This source is provided as-is for educational purposes only.
//CompuScholar, Inc. makes no warranty and assumes
//no liability regarding the functionality of this program.
//
////////////////////////////////////////////////////////////////

//This file is provided NEARLY complete as part of the activity starter.
//The student need only modify the three RaceCar constructors marked below
//in the main() method.

/** TeenCoder: Java Programming
* Race Track Project
* This class will run several races using the student's RaceCar.
* When run, the RaceTrack will automatically conduct 3 races of different
* distances for 3 cars, and display the winner of each race.
* @author CompuScholar, Inc.
* @version 1.0
*/

	import java.text.NumberFormat;
	
	public class RaceTrack
	{
	
	public static void main(String[] args)
	{
		
	// STUDENT should create three new RaceCar objects named
	// car1, car2, and car3 below.  Use constructor parameters
	// to give each car a unique name, maximum speed, and acceleration.
	RaceCar car1 = RaceCar("Racer 1", 140.0, 101.0);
	RaceCar car2 = 
	RaceCar car3 = 
	
	// STUDENT does not need to modify anything below this line!
	
	// set the 3 finish line distances
	double FINISH_LINE1 = 10;
	double FINISH_LINE2 = 50;
	double FINISH_LINE3 = 100;
	
	// conduct races to each of the 3 finish line distances
	// using the 3 different cars
	raceToFinish(FINISH_LINE1,car1,car2,car3);
	raceToFinish(FINISH_LINE2,car1,car2,car3);
	raceToFinish(FINISH_LINE3,car1,car2,car3);
	}
	
	// This method is provided complete as part of the activity starter.
	// It will conduct a single race to the specified finish line
	// using the three provided RaceCars.
	private static void raceToFinish(double finishLine, IRacer car1, IRacer car2, IRacer car3)
	{
	double fastestFinishTime;	// keep track of the fastest time
	double currentFinishTime;	// holds the current race time
	
	// reset the speed of all cars back to zero
	car1.resetCurrentSpeed();
	car2.resetCurrentSpeed();
	car3.resetCurrentSpeed();
	
	// show how far this race will cover
	System.out.println("Racing to distance of: " + finishLine);
	
	// chose default fastest car
	IRacer fastestCar = car1;	// assume car1 will win
	
	// race car 1 to finish and store result in current time
	currentFinishTime = race(finishLine, car1);
	
	// first finish time is also the fastest time...
	fastestFinishTime = currentFinishTime;
	
	// race car 2 to finish and store result in current time
	currentFinishTime = race(finishLine, car2);
	
	// if the current time is faster
	if (currentFinishTime < fastestFinishTime)
	{
	// remember the new fastest time
	fastestFinishTime = currentFinishTime;
	// remember the car that produced the fastest time
	fastestCar = car2;
	}
	
	// race car 3 to finish and store result in current time
	currentFinishTime = race(finishLine, car3);
	
	// if the current time is faster
	if (currentFinishTime < fastestFinishTime)
	{
	// remember the new fastest time
	fastestFinishTime = currentFinishTime;
	// remember the car that produced the fastest time
	fastestCar = car3;
	}
	
	// show the winning car for this race distance!
	System.out.println(fastestCar.getName() + " is the winner!");
	System.out.println("");
	}
	
	// This method is provided complete as part of the activity starter.
	// It will race a single car the specified distance, showing progress
	// on the command line each second and tracking total elapsed time.
	private static double race(double finishLine, IRacer racer)
	{
	// show the car's name first
	System.out.print(String.format("%20s",racer.getName()));
	System.out.print(": ");
	
	// store the starting time, in milliseconds
	long startTimeMilliseconds = System.currentTimeMillis();
	
	// initialize some internal variables
	double currentPosition = 0;
	long currentColumn = 0;
	double lastStepOverage = 0;
	double lastSpeed = 0;
	
	// while the car's position has not yet crossed the finish line
	while (currentPosition < finishLine)
	{
	// give the racer a chance to speed up!
	racer.accelerate();
	
	// get the racer's speed
	lastSpeed = racer.getCurrentSpeed();
	
	// add the racer's speed to current position to get new position
	currentPosition += lastSpeed;
	
	// if racer has crossed finish line
	if (currentPosition >= finishLine)
	{
	// see if that last step took us past finish,
	// in order to correct time calculation later!
	lastStepOverage = currentPosition - finishLine;
	
	// set current position to finish line so we'll print
	// only the right number of progress markers below
	currentPosition = finishLine;
	}
	
	// if racer moved at least one unit during this past second
	if (currentPosition > currentColumn)
	{
	// for each of the units moved, print out an equals sign
	for (int i=0; i<((long)currentPosition - currentColumn); i++)
	{
	System.out.print("=");
	}
	
	// keep track of the new position after movement complete
	currentColumn = (long)currentPosition;
	}
	
	// crude "sleep" loop will spin and do nothing for 1000 milliseconds
	long now = System.currentTimeMillis();
	while ((now + 1000) > System.currentTimeMillis())
	{
	}
	
	// now go up and move the racer again, until we have finished!
	}
	
	// capture stop time
	long stopTimeMilliseconds = System.currentTimeMillis();
	
	// calculate elapsed milliseconds
	double elapsedMilliseconds = (stopTimeMilliseconds - startTimeMilliseconds);
	
	// correct elapsed time if that last stop took us well past the finish line
	elapsedMilliseconds -= (lastStepOverage / lastSpeed) * 1000;
	
	// convert milliseconds to seconds
	double elapsedSeconds = elapsedMilliseconds / 1000;
	
	// print out the elapsed time using exactly two decimal places
	NumberFormat nf = NumberFormat.getInstance();
	nf.setMaximumFractionDigits(2);
	nf.setMinimumFractionDigits(2);
	
	System.out.println(": Finished in " + nf.format(elapsedSeconds) + " seconds");
	
	// return elapsed time for this racer and distance
	return elapsedSeconds; 
	}
	
	}

	public Race() {
		String name;
		double maxSpeed;
		double acceleration;
		myCurrentSpeed = 0.0;
	}

}
