/*
 * 
 */


package lydia.porter.castingexe;
import java.lang.*; // it goes under the package :)

/**
 * @author lydia.porter
 * 9/28
 * Casting
 */
public class Casting {

	/**
	 * 	byte	java.lang.Byte
		short	java.lang.Short
		int	    java.lang.Integer
		long	java.lang.Long
		float	java.lang.Float
		double	java.lang.Double
		char	java.lang.Character
		boolean	java.lang.Boolean	 
	 * 
	 */
	public Casting() {
		double value1 = 7.2;
		int value2 = (int)value1; // truncate: to chop something off the end; 
		// (int) means turn this into an int even though it will chop off the .2; even though it will truncate
		
		int number55 = 55;
		char five = (char) number55; // convert to a char
		
		//System.out.println(five);
		int value3 = 100;
		double value4 = value3; // let's you switch as long as there is no data loss or you'll have to do something like (int)
		
		byte num1 = 127; // can declare it byte or java.lang.Byte or import java.lang and Byte
		Byte num2 = 127;
		System.out.println(num1);
		System.out.println(num2);
		
		
		short num3 = 3;
		Short num4 = 3;
		Integer num5 = 5;
		
		int maxintvalue = Integer.MIN_VALUE;
		System.out.println(maxintvalue);
		
		float maxFloat = Float.MAX_VALUE;
		System.out.println(maxFloat);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Casting(); // call up to do everything up there; cast number from an int to a char
		
	}

}
