package lydia.porter.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber1_3 {

	public GuessMyNumber1_3() {
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
		int guess_count = 0;
		
		do {
			System.out.println(guessText);
			
		//guess 1
			
				if (input.hasNextInt()) {
					guess = input.nextInt();
					 if (guess == the_number) {
						 System.out.println("You got it! Great job!");
						 win = true;
					 } //if guess
					 else if (guess < the_number) {
						 System.out.println("Guess higher.");
					 } // else if
					 else {
						 System.out.println("Guess lower.");
					 } //else
				}// has next
				
				else {
					input.nextLine();
					System.out.println("Not a good value. You lose a guess.");
				}//else
				guess_count++;// you need it here or else you get too many guesses! correct number of guesses
			} while((guess_count != totalGuess) && (win == false));//while; run no matter what the first time, then check if true to run again
		//place the while stuff on same line as do's curly bracket and end with ;
		if (win == true) {
			System.out.println("you win");
		}
		else {
			System.out.println("you lose");
		}//else
		
		input.close();
	}

	public static void main(String[] args) {
		new GuessMyNumber1_3(); // call to constructor

	}

}
