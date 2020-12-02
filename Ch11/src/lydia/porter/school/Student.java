package lydia.porter.school;

import java.util.*;

public class Student {
	private String name;
	private int ID;
	private String bDay;
	private double gpa;
	private String health_conditions;
	private String address; 
	private int year; 
	private int lunchNum;
	private Classes[] classes;
	private String phoneNum;
	//private String parents;
	private String email;
	
	private void pickClasses() {
		//String[] classList = new String[22]; //22 elements long; 22 classes to choose from
		//classList[0] = "Math"; //long way to do it
		String[] classList = new String[22];
		String[] classList = {
				"Math,"
				"English,"
				"History, "
				"Science,"
				"programming_Java,"
				"programming_Python,"
				"programming_C_Sharp,"
				"Choir,"
				"Health,"
				"PE,"
				"Foods,"
				"Pro_Start,"
				"Cosmo,"
				"Internship,"
				"Early_childhood_ed,"
				"Business,"
				"Seminary,"
				"Auto,"
				"Spanish,"
				"French,"
				"ASL,"
				"Art,"
		}
		for(int i = 0; i < 22; i++) {
			System.out.println(classList[i]);
		}
		
	}
	
	//ALL
	public Student(String name, int iD, String bDay, double gpa, String health, String address, int year, int lunchNum,
			String phoneNum, String parents, String email) {
		super();
		this.name = name;
		ID = iD;
		this.bDay = bDay;
		this.gpa = gpa;
		this.health_conditions = health;
		this.address = address;
		this.year = year;
		this.lunchNum = lunchNum;
		this.phoneNum = phoneNum;
	//	this.parents = parents;
		this.email = email;
	}

	//old student
	public Student(double gpa, int year) {
		super();
		this.gpa = gpa;
		this.year = year;
	}
	
	
	//change contact info
	public Student(String phoneNum, String parents, String email) {
		super();
		this.phoneNum = phoneNum;
		//this.parents = parents;
		this.email = email;
	}

	private String genID() {
		Random rand = new Random();
		//8 digit 
		int num1 = rand.nextInt(10);
		String pos1 = Integer.toString(num1);
		int num2 = rand.nextInt(10);
		String pos2 = Integer.toString(num2);
		int num3 = rand.nextInt(10);
		String pos3 = Integer.toString(num3);
		int num4 = rand.nextInt(10);
		String pos4 = Integer.toString(num4);
		int num5 = rand.nextInt(10);
		String pos5 = Integer.toString(num5);
		int num6 = rand.nextInt(10);
		String pos6 = Integer.toString(num6);
		int num7 = rand.nextInt(10);
		String pos7 = Integer.toString(num7);
		int num8 = rand.nextInt(10);
		String pos8 = Integer.toString(num8);
	
		String ID = pos1+pos2+pos3+pos4+pos5+pos6+pos7+pos8;
		
		return ID;
	}
	
	//method lunch num plus
	private int genLunchnum(String ID, int year) {
		//String genLunch = ID + year;
		//parse year?
		int lunchnum;
		String x = ID + Integer.toString(year);
		lunchnum = Integer.parseInt(x);
		return lunchnum;
	}
	
	
/////////ALL GETTERS AND SETTERS
	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		setName(input.nextLine());
		System.out.println("Enter your birthday: ");
		setbDay(input.nextLine());
		System.out.println("Enter your GPA: ");
		setGpa(input.nextDouble());
		System.out.println("Enter your health: ");
		setHealth(input.nextLine());
		System.out.println("Enter your address: ");
		setAddress(input.nextLine());
		System.out.println("Enter your grade: ");
		setYear(input.nextInt());
		System.out.println("Enter your lunch number: ");
		setLunchNum(input.nextInt());
		System.out.println("Enter your phone number: ");
		setPhoneNum(input.nextLine());
		System.out.println("Enter your email: ");
		setEmail(input.nextLine());
		///////////////////////////setLunchNum(genLunchnum(this.ID, this.year));
		pickClasses();
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getbDay() {
		return bDay;
	}

	public void setbDay(String bDay) {
		this.bDay = bDay;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getHealth() {
		return health_conditions;
	}

	public void setHealth(String health) {
		this.health_conditions = health;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getLunchNum() {
		return lunchNum;
	}

	public void setLunchNum(int lunchNum) {
		this.lunchNum = lunchNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	/*public String getParents() {
		return parents;
	}

	public void setParents(String parents) {
		this.parents = parents;
	}
*/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(String name) {
		this.name = name;
	}

}
