package lydia.porter.TicTacToeAI;
import	java.util.*;
/* Debug report
 * 11/12
 * null pointer exception
 * so we went to checkWinner and changed return null; to return "";
 * 213
 * 
 * numbers not accepted; 0 is only accepted number
 * 
 *-1 out of range
 * 
 * index out of bounds - legal moves
 * 
 * added if statement to comp move
 * and else if 
 * 
 * print human and computer move check to see if you got in those
*/

public class TicTacToeAI {
	Scanner input = new Scanner(System.in);
	String human;
	String computer;
	
	//build method
	public void intro() {
		System.out.println("Welcome to TIC TAC TOE!");
		System.out.println("This will be a showdown between your human brain and my silicon processor.");
		System.out.println("You will make your move known by entering a number, 0-8.");
		System.out.println("The number will correspond to the board positions as illustrated:");
		System.out.println("\t\t 0 | 1 | 2 ");
		System.out.println("\t\t-----------");
		System.out.println("\t\t 3 | 4 | 5 ");
		System.out.println("\t\t-----------");
		System.out.println("\t\t 6 | 7 | 8 ");
		System.out.println("Are you ready?");
		System.out.println();
	}
	
	//gets a yes or no response
	public String yes_no_response(String question) {
		String response = "";
		while (true) {
			System.out.println(question);
			response = input.nextLine();
			if (response.equalsIgnoreCase("yes")) {
				break;
			}
			else if (response.equalsIgnoreCase("no")) {
				break;
			}
		}
		return response.toLowerCase();
	}
	
	
	//gets a user input for a number, makes sure it is a good input, and returns it if it is
	public int get_number(String question, int low, int high) {
		while (true) {
		
			int numInput;
			try {
				System.out.println(question);
				numInput = input.nextInt();
				System.out.println(numInput); //////////////////////////////////////////////////////
				if ((numInput >= low && numInput <=high)) {
					System.out.println(numInput);
					
					return numInput;
				}
				System.out.println("Invalid input; re-enter slot number: ");
				
			} catch(InputMismatchException e) {
				System.out.println("Invalid input; re-enter slot number: ");
				input.hasNextLine();
				continue;
			}
		}
		
		
		//int number = -1;
		//return number;
		
	}
	
	public void pieces(String X, String O) { 
		String go_first = yes_no_response("Do you want the first move? (yes/no): ");
		if (go_first.equals ("yes")) {
			human =  X;
			computer = O;
		}
		else {
			human = O;
			computer = X;
		}
	}
	
	
	public String[] new_board(int NUM_SQUARES, String EMPTY) {

		
		String[] board = new String[NUM_SQUARES]; //new array 9 elements long
		for (int i = 0; i < NUM_SQUARES; i++) {
			board[i]=EMPTY;
		}
		
		return board;
	}

	//displays updated board
	public void display_board(String[] board ) {
		System.out.println("\t\t\t+-----------+");
		System.out.println("\t\t\t| " +board[0]+ " | "+board[1]+" | "+board[2]+" | ");
		System.out.println("\t\t\t|-----------|");
		System.out.println("\t\t\t| " +board[3]+ " | "+board[4]+" | "+board[5]+" | ");
		System.out.println("\t\t\t|-----------|");
		System.out.println("\t\t\t| " +board[6]+ " | "+board[7]+" | "+board[8]+" | ");
		System.out.println("\t\t\t+-----------+");
	}
	
	//list of legal moves
	public int [] legal_moves(String[] board, int NUM_SQUARES, String EMPTY) {
		int[] moves = new int[NUM_SQUARES];
		
		for (int i = 0; i < NUM_SQUARES; i++) {
			if (board[i] == EMPTY) {
				moves[i] = i;
				//list of empty squares we can use
			}
			else {
				moves[i] = -1;
			}
		}
		return moves;
	}
	
	
	public int human_move(String[] board, int NUM_SQUARES, String EMPTY) {
		int[] moves =  legal_moves(board, NUM_SQUARES,EMPTY);
		int move = -1;
		System.out.println("you have made it in the if statement for human move check"); //
		while (true) {
			move = get_number("Where will you move? (0-8): ",0,NUM_SQUARES);
			for (int x:moves) { //loops through and gives first number to x
				if (move == x) {
					return move;
				}
			}
			System.out.println("That square is already occupied. Choose another.");
		}		
	}
	
	public String next_turn(String turn) {
		if (turn == "X") {
			return "O";
		}
		else {
			return "X";
		}
		
		//return turn;
	}
	
	
	
	//CHECK WINNER
	public String checkWinner(String[] board, String EMPTY, String TIE) {
		for (int a = 0; a < 8; a++) {
			String line = null; //blank line every time
			//8 different ways to win
			switch (a) {
			//horizontal checks
			//top row
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			//middle row
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			//bottom row
			case 2:
				line = board[6] + board[7] + board[8];
				break;
				
				
			//vertical checks
				//vertical left
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			//vertical middle
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			//vertical right
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			//diagonal
			case 6:
				line = board[0] + board[4] + board[8]; //not check
				break;
			//diagonal
			case 7:
				line = board[2] + board[4] + board[6]; //check
				break;
			} // switch a
			if (line.equals("XXX")) {
				return "X wins!!!!!!";
			} else if (line.equals("OOO")) {
				return "O wins!!!!";
			}
				
			for (int i = 0; i <9; i++) {
				if(board[i] == EMPTY) {
					break;
				}
				else if(i == 8) { 
					return TIE;
				}
			
			}//for little
		
			
		} //for
		return "";
		
	} //public
	/////////////////////////////////////////////////////////////////
	//home stuff from November 10
	////////////////////////////////////////////////////////////////
	public int comp_move(String[] board, String EMPTY, String TIE) { //pass in string array called board
		String[] test_board = new String [9];
		//make a copy to work with sine the function will be changing array
		for (int i = 0; i <9; i++) {
			test_board[i] = board[i];
		}
		int[] best_moves = {1,2,3,4,5,6,7,8,0};
		int[] legalmoves = legal_moves(board, 9, EMPTY);
		
				
				
				
		
		
		//check/see if computer can win with any of these legal moves
		for (int move: legalmoves) {
			if (move != -1) { //new
			System.out.println("you have made it in the if statement for computer move check");
			test_board[move] = computer;
			//put computer piece in the board where it's at
			//assigned move to board
			String win = checkWinner(test_board,EMPTY,TIE);
			if (win.equals(computer)) {
				return move; //204
			}
			}
			else if (move == -1) { //new add 11/12
				continue;
			}
			test_board[move] = EMPTY;
		}
		
		//returns an x or an o
		
		
		
		
		//if human can win
		for (int move: legalmoves) {
			if (move != -1) {
			test_board[move] = human;
			//put computer piece in the board where it's at
			//assigned move to board
			String win = checkWinner(test_board,EMPTY,TIE);
			if (win.equals(human)) {
				//if the human is the winner/could win, it will "return" that move
				//it will place that move
				return move;
			}
			}
			else if (move == -1) { //new add 11/12
				continue;
			}
			test_board[move] = EMPTY;
			
	}
		
		
		//chose best move
		for (int move: best_moves) {
			//is move in legal moves?
			//if (legalmoves.contains(move)) {
			boolean inarray = contains(legalmoves, move);
			if (inarray) {
				return move;
			}	
		}
		return best_moves[0]; //one of the above 3 scenarios should get hit
		
		
}
	
	public boolean contains(int[] array, int key) {
		//array[], key
		for(int i: array) {
			if (i == key) {
				return true;
			}
		}
		return false; 
		//this method can get a true or false response to see if it is in there
	}

		
	/////////////////////////////////////////////////////////////////////////
	
	//build game
	public TicTacToeAI() {
		String X = "X";
		String O = "O";
		String EMPTY = " ";
		String TIE = "TIE";
		int NUM_SQUARES = 9; //how long the array is
		int move;
		String win = "";
		
		
		//game setup
		intro(); //welcome
		pieces(X, O); //set tokens
		String[] board = new_board(NUM_SQUARES, EMPTY); //empty board
		//board[0] = X;
		//board[8] = O;
		
		
		String turn = "X";
		display_board(board);
		while(win == "") {
			
			if (turn == human) {
				move = human_move(board, NUM_SQUARES, EMPTY);
				board[move] = human;
			}
			else {
				move = comp_move(board, EMPTY, TIE);
				board[move] = computer;
				
			}
			display_board(board); //as it repeats, it will show us the updated board
			win = checkWinner(board, EMPTY, TIE);
			turn = next_turn(turn);
		}
		
		System.out.println(win);
		
			
		/*
		int[] legal_moves = legal_moves(board,NUM_SQUARES,EMPTY);
		for(int var: legal_moves) {
			System.out.println(var);
		}
		*/
		
		//prints out all the variables (z's)
				
		
		//System.out.println(human);
		//System.out.println(computer);
		
		//String x = yes_no_response("is this working?");
		//System.out.println(x);
		
		//int i = get_number("pick a number between 0  and 8", 0, 8);
		//System.out.println(i);
	}
	
	
	//start game
	public static void main(String[] args) {
		new TicTacToeAI();

	}

}
