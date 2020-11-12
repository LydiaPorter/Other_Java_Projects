package ch5_2;
import java.util.Calendar;

public class Ch5_StringTheory {

	public Ch5_StringTheory() {
		String str1 = "Bibbety";
		String str2 = "Bobbety";
		String str3 = "Boo";
		String str4 = "BIBBETY";
		String str5 = "5";
		
		//#5. does str1 equal str4?
		System.out.println("str1 equals str4: " +str1.equals(str4));
		//#5. does str1 equal str4 if the capital or lower case doesn't matter?
		System.out.println("str1 equals str4: " +str1.equalsIgnoreCase(str4));
		//#6. replace all "b"s with "p"s
		System.out.println("let's switch the b's to p's! " +str1.replace('b', 'p'));
		//#7. grab the first three characters of str2
		System.out.println("the first 3 characters of str2: " +str2.substring(0, 3));
		//#8. toUpperCase
		System.out.println("str3 uppercase: " +str3.toUpperCase());
		// #9. current time in am/pm format
		System.out.println("current time: " +String.format("%tr", Calendar.getInstance()));
		//str1+str2
		System.out.println("str1 + str2 = " +str1+str2);
		//"5" to int
		int newInt = Integer.parseInt(str5);
		System.out.println("parse int results: " +newInt);
		//index of e str1
		System.out.println("location of 'e' in str1: " +str1.indexOf('e'));
		
		
	}

	public static void main(String[] args) {
		new Ch5_StringTheory();

	}

}
