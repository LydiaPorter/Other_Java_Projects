package lydia.porter.ch6exe;
// import
import java.util.*;
//create a scanner object
//close scanner

public class Ch6_3 {

	public Ch6_3() {
		Scanner input = new Scanner(System.in);
		double gpa; 
		
		System.out.print("Enter in your GPA and press enter: "); //clear instructions for users
		
		if(input.hasNextDouble()) { //curly brackets instead of ;
			gpa = input.nextDouble(); //we're expecting double data to come back
			input.nextLine();
		}
		else {
			System.out.println("that wasn't a good gpa. you must have a low GPA. you can't even follow simple instructions ");
			gpa = 0.1;
		}
		
		System.out.println("Your GPA is " + gpa);
		
		//NEW
		
		System.out.print("option 2");
		
		System.out.print("Enter in your GPA and press enter: "); //clear instructions for users
		gpa = 0.0;
		boolean good = input.hasNextDouble();
		if (good) {
			gpa = input.nextDouble();
		}
		else {
			while (good == false) {
				input.nextLine();
				System.out.println("not a good value"); 
				System.out.print("Enter in your GPA and press enter: ");
				gpa = input.nextDouble();
				if (good == true) {
					gpa = input.nextDouble();
				
				}
			}
			
		}

		System.out.println("Your GPA is " + gpa);
		/*
		 * relational operators always return a true or false value
		 * <
		 * (a>b && c<d)|| z>x
		 * a<=b || c>=d if one of the expressions is true they will both send back true
		 * <=
		 * >=
		 * == is it equal to something else? comparison; but 
		 * = assignment
		 * != not equal to something
		 * 
		 * && check two things are both true; compare two logical expressions to one another
		 * || or 
		 * ! not
		 * 
		 * 
		 * 
		 * */
		
		input.close();
		
		
		 //close your scanner before you leave!
	}

	public static void main(String[] args) {
		new Ch6_3();

	}

}
