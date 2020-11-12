package lydia.porter.guess; 
// this is the for loop version!

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber1_4 {

	public GuessMyNumber1_4() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int guess; // if you declare it here you can use it anywhere throughout your code :)
		boolean win = false;
		int diff = 1; //which difficulty
		int maxRange = 10; //default values!
		int totalGuess = 3;
		//change range and number of guesses for different difficulties
		
		System.out.println("Choose your difficulty: easy medium hard");
		String result = input.nextLine(); //difficulty settings made with switch statements!
		switch(result) //switch statement needs curly brackets
		//switch(data checking against) {all possible cases;end each case with break statement} 
		{
			case "easy": //has to be exactly the same; think about all possible inputs . . . :(
				diff = 1;
				maxRange = 10;
				totalGuess = 3;
				break; // break out in case they don't choose this one
			case "Easy": //has to be exactly the same
				diff = 1;
				maxRange = 10;
				totalGuess = 3;
				break; 
			case "medium" : //"" what you're looking for
				diff = 2;
				maxRange = 50;
				totalGuess = 5;
				break;
			case "Medium" : //"" what you're looking for
				diff = 2;
				maxRange = 50;
				totalGuess = 5;
				break;
			case "hard":
				diff = 3;
				maxRange = 100;
				totalGuess = 10;
				break;
			case "Hard":
				diff = 3;
				maxRange = 100;
				totalGuess = 10;
				break;
			default: // if they wouldn't put in the correct difficulty, they get ULTRA hard hehehe :D :)
				diff = 4;
				maxRange = 1000;
				totalGuess = 1;
				win = true; // default just to last guess
				break;			
		}
		
		
		// System.out.println(random.nextInt(10)+1); // range (10) + 1 does 1-10
		//picking the random number
		int the_number = random.nextInt(maxRange)+1; // comparing everything else to this number
		System.out.println(the_number);
		
		System.out.println("Welcome to the Guess My Number game!");
		System.out.println("I'm thinking of a number between 1 and " +maxRange); //pop
		System.out.println(String.format("You have %s guesses to get the number.", totalGuess)); //pop totalGuess in where %s is; $ is for index value
		System.out.println("Good luck!");
		System.out.println();
		
		String guessText = String.format("Pick a number between 1 and %s", maxRange);
		
		
		
		for (int guess_count = 0; guess_count != totalGuess; guess_count++) {
			System.out.println(guessText);
			
		//guess 1
			
				if (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess_count != totalGuess-1) {
					
					 if (guess == the_number) {
						 System.out.println("You got it! Great job!");
						 win = true;
						 guess_count = totalGuess;
					 } //if guess
					 else if (guess < the_number) {
						 System.out.println("Guess higher.");
					 } // else if
					 else {
						 System.out.println("Guess lower.");
					 } //else
				}// guess count
				
				else {
					input.nextLine();
					System.out.println("Not a good value. You lose a guess.");
				}//else
				input.nextLine();
				if (win == true) {
					continue;
				} // win
							
		if (win == true) {
			System.out.println("you win");
		}
		else {
			System.out.println("you lose");
		}//else
				}	
		}
		input.close();
	} 
				
	public static void main(String[] args) {
		new GuessMyNumber1_4(); 
		
		//this allows you to run the program above (the guess my number)
		//void means run it but don't return data
		
		//nested for loop
	/*	for (int dayOfWeek = 0; dayOfWeek < 7; dayOfWeek++) {
			System.out.print("Day " + dayOfWeek + ": ");
			for (int hour = 0; hour < 24; hour++) {
				System.out.println("H " + hour);
				for (int min = 0; min < 60; min++) {
						System.out.println("M" + min);
						for(int sec = 0; sec < 60; sec++) {
							System.out.println("S " + sec);
						}//sec
			}//min
			System.out.println("");
		}//hour
		System.out.println("All done");
	}//day
	
	*/
	}//void

} //for int guess count
