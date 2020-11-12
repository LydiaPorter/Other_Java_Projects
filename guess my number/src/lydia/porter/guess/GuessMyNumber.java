package lydia.porter.guess;
import java.util.Random;
import java.util.Scanner;
/*
 * Lydia Porter
 * 6,7th
 * */

public class GuessMyNumber {

	public GuessMyNumber() {
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
			default: // if they wouldn't put in the correct difficulty, they get ULTRA hard hehehe
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
		System.out.println(guessText);
		
		//System.out.println();
		//guess 1
		if (!win) {
			if  (input.hasNextInt()) {
				guess = input.nextInt();//only one possible outcome out of the three below:
				 if (guess == the_number) { // 3 scenarios possible: =, >, <
					 System.out.println("You got it! Great job!"); // if the number matches, it will say true
					 win = true;
				 }
				 else if (guess < the_number) {
					 System.out.println("Guess higher.");
				 } // if none of the above are false, check this one below:
				 else {
					 System.out.println("Guess lower.");
				 }
			}
			
			else {
				System.out.println("Not a good value. You lose a guess.");
				input.nextLine();
			}
		}
		//2nd guess
		System.out.println(guessText);
		if (!win) { //this guess only happens if there is not a win; ! means not
			 	if (input.hasNextInt()) {
			 		guess = input.nextInt(); 
			 		
			 		if(guess == the_number) {
			 			System.out.println("You got it! Great job!"); // if the number matches, it will say true
			 			win = true;
			 	}
			 	else if (guess < the_number) {
				System.out.println("Guess higher.");
			 	} // if none of the above, check this one below:
			 else {
				 System.out.println("Guess lower.");
			 }
			 
		}
		else {
			System.out.println("Not a good value. You lose a guess.");
		}
		}
		
		
		//guess 4
		if(!win) {
			if (diff > 1) {
				if  (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == the_number) {
						 System.out.println("You got it! Great job!"); // if the number matches, it will say true
						 win = true;
					 }
					 else if (guess < the_number) {
						 System.out.println("Guess higher.");
					 } // if none of the above are false, check this one below:
					 else {
						 System.out.println("Guess lower.");
					 }
					 
				}
				else {
					System.out.println("Not a good value. You lose a guess.");
				}
				

				
			}
		}
		
		//guess 5
		if(!win) {
			if (diff > 2) {
				if  (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == the_number) {
						 System.out.println("You got it! Great job!"); // if the number matches, it will say true
						 win = true;
					 }
					 else if (guess < the_number) {
						 System.out.println("Guess higher.");
					 } // if none of the above are false, check this one below:
					 else {
						 System.out.println("Guess lower.");
					 }
					 
				}
				else {
					System.out.println("Not a good value. You lose a guess.");
				}
				

				
			}
		}
		
		// guess 6
		if(!win) {
			if (diff > 2) {
				if  (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == the_number) {
						 System.out.println("You got it! Great job!"); // if the number matches, it will say true
						 win = true;
					 }
					 else if (guess < the_number) {
						 System.out.println("Guess higher.");
					 } // if none of the above are false, check this one below:
					 else {
						 System.out.println("Guess lower.");
					 }
					 
				}
				else {
					System.out.println("Not a good value. You lose a guess.");
				}
				
	
				
			}
		}
		
		//guess 7 
		if(!win) {
			if (diff > 2) {
				if  (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == the_number) {
						 System.out.println("You got it! Great job!"); // if the number matches, it will say true
						 win = true;
					 }
					 else if (guess < the_number) {
						 System.out.println("Guess higher.");
					 } // if none of the above are false, check this one below:
					 else {
						 System.out.println("Guess lower.");
					 }
					 
				}
				else {
					System.out.println("Not a good value. You lose a guess.");
				}
				
	
				
			}
		}
		
		//guess 8
		if(!win) {
			if (diff > 2) {
				if  (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == the_number) {
						 System.out.println("You got it! Great job!"); // if the number matches, it will say true
						 win = true;
					 }
					 else if (guess < the_number) {
						 System.out.println("Guess higher.");
					 } // if none of the above are false, check this one below:
					 else {
						 System.out.println("Guess lower.");
					 }
					 
				}
				else {
					System.out.println("Not a good value. You lose a guess.");
				}
				
	
				
			}
		}
		
		//guess 9 
		if(!win) {
			if (diff > 2) {
				if  (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == the_number) {
						 System.out.println("You got it! Great job!"); // if the number matches, it will say true
						 win = true;
					 }
					 else if (guess < the_number) {
						 System.out.println("Guess higher.");
					 } // if none of the above are false, check this one below:
					 else {
						 System.out.println("Guess lower.");
					 }
					 
				}
				else {
					System.out.println("Not a good value. You lose a guess.");
				}
				
	
				
			}
		}
		
		//guess 10 
		if(!win) {
			if (diff > 2) {
				if  (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == the_number) {
						 System.out.println("You got it! Great job!"); // if the number matches, it will say true
						 win = true;
					 }
					 else if (guess < the_number) {
						 System.out.println("Guess higher.");
					 } // if none of the above are false, check this one below:
					 else {
						 System.out.println("Guess lower.");
					 }
					 
				}
				else {
					System.out.println("Not a good value. You lose a guess.");
				}
				
	
				
			}
		}
		
		//last guess
		System.out.println(guessText);
		if (win) {
			//System.out.println("testing!");
			
			if  (input.hasNextInt()) {
				guess = input.nextInt();//only one possible outcome out of the three below:
				 if (guess == the_number) {
					 System.out.println("You got it! Great job!"); // if the number matches, it will say true
					 win = true;
				 }
				 else if (guess < the_number) {
					 System.out.println("Guess higher.");
					 System.out.println("Out of guesses. The number was "+the_number);
				 } // if none of the above, check this one below:
				 
				 else {
					 System.out.println("Guess lower.");
					 System.out.println("Out of guesses. The number was "+the_number);
				 }
				 
			}
			else {
				System.out.println("Not a good value. You lose a guess.");
			}
			
			//you lose. the number was +the_number
		}
			input.close();
		}
			
	

	public static void main(String[] args) {
		new GuessMyNumber();

	}

}
