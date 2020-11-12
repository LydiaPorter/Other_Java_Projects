package lydia.porter.contacts;

public class Contacts {
	String name;
	Long phone_number;
	String email;
	String social_apps;
	String address;
	byte b_month;
	byte b_day;
	byte b_year;
	boolean work_or_personal;
	char letter1 = 'A';
	char letter2 = 'B';
	char letter3 = 'C';
	// strings can contain any character! letters, numbers, symbols, etc.
	
	public Contacts() {
		name = "Lydia"; // a string is a reference data type, most common reference data type(starts with capital; referring to a class)
		// reference data type is a null value; it's empty
		phone_number = 5555555555L;
		email = "Something@gmail.com";
		address = "123 Home St";
		b_month = 6;
		b_day = 12;
		b_year = 00;
		work_or_personal = true;
		// name = data type;
		
		
	}

}
