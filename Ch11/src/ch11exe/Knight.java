package ch11exe;

import java.util.Scanner;

public class Knight {
	private String name;
	//private attribute
	//private so we can't access it in another class
	
	public Knight() { //DEFAULT CONSTRUCTOR; tells basic things to be done
		//we have to have a constructor in a class. you can do more than one though
		Scanner input = new Scanner(System.in); //user input ready!
		System.out.println("what is your name?");
		String inputName = input.nextLine();
		setName(inputName); //don't need to return anything
	}
	
	
	public Knight(String name) { //constructor w parameter passed in
		this.name = name;
	}
	
	public void setName(String name) { //name setter
		this.name = name;
	}

	//name getter
	public String getName() {
		return name;
	}


}
