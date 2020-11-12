package lydia.chapter4.lesson2;

public class Lesson2exe {

	public Lesson2exe() {
		// variable declaration
		int bankaccounttotal$; // 4 bytes
		short num_of_hotdogs_i_can_eat; // 2 bytes
		byte myage; // 1 byte
		long dream_val; // 8 bytes
		
		int x;
		
		// fractional numbers
		float mygpa; // 4 bytes
		// double PIE; // 8 bytes
		
		// non-numeric data types
		// boolean data type true or false
		boolean answer;
		// char
		char letter;
		String name;
		
		// assigning variables
		bankaccounttotal$ = 2000;
		num_of_hotdogs_i_can_eat = 500;
		myage = 15;
		dream_val = 250000000L; // add an L for a long
		
		mygpa = 3.85F; // add an F for a float
		final double PIE = 3.141579; // assigned and declared in the same line; final: this variable may not be changed 
		//PIE = 3.5;
		
		letter = 'a'; // strings use "" but letters/single characters use ''
		// Classes start with capital letters; variables start with lower case
		
		/* mathematical operations
		-
		+
		*
		*
		*
		/
		%
		*/
	
		bankaccounttotal$ = bankaccounttotal$+5000;
		System.out.println(bankaccounttotal$);
		bankaccounttotal$ = bankaccounttotal$-1000;
		System.out.println(bankaccounttotal$);
		bankaccounttotal$ = bankaccounttotal$*1000;
		System.out.println(bankaccounttotal$);
		bankaccounttotal$ = bankaccounttotal$/77;
		System.out.println(bankaccounttotal$);
		
		myage = (byte) (10 % 5); // divides and then returns the remainder
		System.out.println(myage);
		
		bankaccounttotal$+=200; // adds 200 in less code
		
		myage+=1;
		myage++; // adds one each time; INCREMENT
		myage--; // takes away one year every year; DECREMENT
		
		double value1 = 7.9999999;
		int value2 = (int) (value1 + 0.5); // add cast to int makes this become an int and gets rid of; the + 0.5 rounds it up; anything less will round down;trunk 
		System.out.println(value2);
		
		int 	value3 = 7;
		double value4 = value3 + 3.5;
		
		
		
		//public static void main(String[] args) {
			//new Lesson2exe();
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lesson2exe();

	}

}
