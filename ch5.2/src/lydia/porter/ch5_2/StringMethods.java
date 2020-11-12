package lydia.porter.ch5_2;

public class StringMethods {

	public StringMethods() {
		// a string (name) built out of the string "let" (alphabet)
		String let = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String myString2 = "moon";
		String myString3 = "MOON";
		String newTest = myString2.replace("o", "z");
		System.out.println(newTest);
		
		myString2 = myString2.toUpperCase();
		myString3 = myString3.toLowerCase();
		System.out.println(myString2);
		System.out.println(myString3);
		
		String newsub = let.substring(7, 11); // grab characters from one point to another
		System.out.println(newsub);
		
		int lastO = myString3.lastIndexOf("O");
		System.out.print(let.length());
		
		int first = let.indexOf("L");
		int second = let.indexOf("Y");
		int third = let.indexOf("D");
		int fourth = let.indexOf("I");
		int fifth= let.indexOf("A");
		
		char l = let.charAt(first);
		char y = let.charAt(second);
		char d = let.charAt(third);
		char i = let.charAt(fourth);
		char a = let.charAt(fifth);
		
		
		/*char l = let.charAt(11);
		char y = let.charAt(24);
		char d = let.charAt(3);
		char i = let.charAt(8);
		char a = let.charAt(0);
		*/
		
		System.out.print(l);
		System.out.print(y);
		System.out.print(d);
		System.out.print(i);
		System.out.print(a);
		
	}

	public static void main(String[] args) {
		new StringMethods();

	}

}
