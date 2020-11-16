////////////////////////////////////////////////////////////////
// Copyright 2012, CompuScholar, Inc.
//
// This source code is for use by the students and teachers who 
// have purchased the corresponding TeenCoder or KidCoder product.
// It may not be transmitted to other parties for any reason
// without the written consent of CompuScholar, Inc.
// This source is provided as-is for educational purposes only.
// CompuScholar, Inc. makes no warranty and assumes
// no liability regarding the functionality of this program.
//
////////////////////////////////////////////////////////////////

/** TeenCoder: Java Programming
 * Chapter 9 - Run Time Error Project
 * This project contains one or more errors that the student
 * will correct using the debugger as part of a chapter lesson.
 * @author CompuScholar, Inc.
 * @version 1.0
*/

public class RunTimeError 
{

	public static void main(String[] args) 
	{
	    // initialize some variables
	    int numerator = 14;
	    int denominator1 = 3 + 4;   // do some math
	    int denominator2 = 7;

	    // result is "numerator divided by (denominator1 minus denominator2)"
    	int result = numerator / (denominator1 - denominator2);   
    	System.out.println("result is: " + result);

		String myString = null;
		int length = myString.length();
		System.out.println("String length = " + length);

	}

}

