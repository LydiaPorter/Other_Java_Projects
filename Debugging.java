public class Debugging {

	public static void main (String[] args) {
		/*
		String myString = "12";
		String myNumber = myString;
		System.out.println(myNumber);
		*/
		
		/*
		int numerator = 14;
		int denominator1 = 3+4;
		int denominator2 = 7;
		int result = 0;
		try {
			result = numerator / (denominator1-denominator2);
		}
		catch (Exception x) {
			System.out.println("can't divide by 0" + x);
		}	
		System.out.println("result is " +result);
		*/
	
		/*
		String myString = null;
		int length = myString.length(string);
		System.out.println("String length = " +length);
		*/
		
		/*
		String username = "Elmer";
		String firstLetter = username.charAt (5);
		//remember: index starts at 0
		System.out.println("First char: " + firstLetter);
		*/
		
		/*
		String inputPassword = null;
		String storedPassword = "mystery";
		if (storedPassword.equals(inputPassword))
		{
			System.out.println("Login successful");
		}
		*/
		
		int numGrades = 0;
		int totalScore = 500;
		try {
		double avgGrade = totalScore / numGrades;
		}
		catch (Exception error){
		System.out.println("Grade average: " + avgGrade);
		}
		//can't divide by 0


		/* Debugging
		Code Review - read it out loud in the order it will execute!
		errors can give you hints
		reading out loud

		Trace Statements - print to make sure variables and stuff works

		Comments - explains logic; think through what you need and what should happen

		Debugger - step by step that runs your code 
		built into IDEs
		helps you follow the flow of your program 
		- run, continue (to next line), step over (skip), 
		step into (brings us into a function), stop (program)

		*/
		
			
	}
}		