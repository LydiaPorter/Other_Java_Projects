package ch5_2;

public class Pi5_4 {

	public Pi5_4() {
		 double pi = 3.14159;
	      String result;
	              
	      result = "PI = " + pi;
	      System.out.println(result);
	              
	      result = String.format("PI = %f", pi);
	      System.out.println(result);
	              
	      result = String.format("PI = %e", pi);
	      System.out.println(result);
	              
	      result = String.format("PI = %.2f", pi); 
	      //2-digit precision to the right of the decimal point
	      System.out.println(result);
	              
	      result = String.format("PI = %6.2f", pi); 
	      //2-digit precision to the right of the decimal point and 6 overall characters in the output.
	      System.out.println(result);
	              
	      result = String.format("PI = %06.2f", pi);
	      //w 2-digit precision to the right of the decimal point, 6 overall characters in the output, and zero-padded to the left
	      System.out.println(result);
	}

	public static void main(String[] args) {
		new Pi5_4();

	}

}
