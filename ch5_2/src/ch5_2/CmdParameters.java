package ch5_2;

public class CmdParameters {

	public static void main(String[] args) { // main method entry point [] array list of strings
		int numArgs = args.length;
		
		if (numArgs > 0) {
		System.out.println(args[0]);
		}
		if (numArgs > 1) {
		System.out.println(args[1]);
		}
		if (numArgs > 2) {
		System.out.println(args[2]);
		}
		if (numArgs > 3) {
		System.out.println(args[3]);
		}
		if (args[0].equals("help")) {
			System.out.println("this could be your help menu");
		}
	}

}
