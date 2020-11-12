package lydia.porter.ch5_2;

public class Example {
	
	public Example() {
		String storedUsername;
		String storedPassword;
		
		storedUsername = "captainbob";
		storedPassword = "Ahoy";
		
		String inputUsername = "CAPTAINBOB";
		String inputPassword = "Ahoy";
		
		boolean username = false;
		boolean password = false;
		
		if (storedUsername.equalsIgnoreCase(inputUsername)) {
			username = true;
		}
		if (storedPassword.equals(inputPassword)) {
			password = true;
		}
		if (username) {
			if (password) {
				System.out.println("you got in");
			}
			else {
				System.out.println("you did not get in");
			}
		}
		else {
			System.out.println("wrong user name");
		}
		
	}

	
	public static void main(String[] args) {
		new Example(); 

	}

}
