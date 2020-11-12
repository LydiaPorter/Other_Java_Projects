package lydia.porter.ch6exe;

import java.util.Scanner;

//import java.util.*; // go into java class and grab everything from the util *; grabbing everything with green circles

public class Ch6_2 {

	public Ch6_2() { // constructor
		Scanner input = new Scanner(System.in); //where the input's coming from; "input" can be any keyword, but input can grab any type of data
		// you must create a scanner tool to do user input; import, scanner object, use with a method call
		
		/*
		System.out.print("Type your name and press enter: "); // \n carriage return, next line, this signal ends the line
		String userName = input.nextLine();
		
		System.out.print("Type your age and press enter: ");
		int userAge = input.nextInt(); // age is a number
		userAge+=5;
		input.nextLine();
		
		System.out.print("Type your job title and press enter: ");
		String jobTitle = input.nextLine();
		
		System.out.print("Type a boolean and press enter: ");
		boolean inputbool = input.nextBoolean(); // user input must be true or false
		
		System.out.print("Type a double and press enter: ");
		double inputdub = input.nextDouble();
		
		
		
		String test2 = "age " + userAge;
		System.out.println(test2);
		
		String num = Integer.toString(339023); //converting int to a string
		
		System.out.println("Hello, " + userName);
		System.out.println("age " + userAge); //adding number to a string; converts to a string to add to the first string
		//converting anything to a string is basically wrapping it in ""
		// the + concatenates; it basically just converts it to a string. (toString)
		
		
		
		System.out.println("job title: " + jobTitle);
		System.out.println("test: " + inputbool);
		System.out.println("test: " + inputdub);
		*/
		
		System.out.println("enter a number here: ");
		//String test2 = input.nextInt(); 
		int test2 = input.nextInt();
		String test5 = input.next();
		int test3 = input.nextInt();
		int test4 = input.nextInt();
		
		
		
		//test2.contains("1,2,3,4,5,6,7,8,9"); //we can parse it if it contains any of these number characters;check to see if contains numbers
		//int int2 = Integer.parseInt(test2); 
		//int2+=42;
		System.out.println(test2);
		System.out.println(test5);
		System.out.println(test3);
		System.out.println(test4);
		
		
		
		//String test = "3";
		
		//int intval = Integer.parseInt(test); //parseing from a string to an int
		
		
		
	}

	public static void main(String [] args) { // args can be any keyword; this is main
		new Ch6_2();
	}
	
}
