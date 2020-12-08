package lydia.porter.school;

public class School {

	public School() {
		//Student lydia_p = new Student();
		Student.totalStudents +=10;
		System.out.println(Student.totalStudents);
		Student Austin = new Student(2.8, 11);
		System.out.println(Austin);
		Student bob = new Student("Bob", 1, "2", 0.0, "na", "123", 9, 1,"1234567890", "i@a");
		System.out.println(Student.totalStudents);
	}

	public static void main(String[] args) {
		
		new School();
	}
}
