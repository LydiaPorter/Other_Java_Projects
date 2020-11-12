package lydia.porter.contacts;

public class ContactsUse {

	public ContactsUse() {
		Contacts lydia = new Contacts(); // now there's a place that holds name, email, phone number, etc.
		// declaration, variable name, equal to something; new reference to it allows it to remember
		System.out.println(lydia.name);
		Contacts Jaiden = new Contacts();
		Jaiden.name = "Jaiden";
		System.out.println(Jaiden.name);
		
		System.out.println(Jaiden);
		System.out.println(lydia);
		
	}

	public static void main(String[] args) {
		// 3 different ways to make strings!
		String firstName = "Eric";
		String lastName = new String();
		lastName = "Broadbent";
		String midName;
		midName = "Sean";
				
		
		
		new ContactsUse(); // new reference to constructor

	}

}
