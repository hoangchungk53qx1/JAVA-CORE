
public class Student {
	// attributes of a Student
	private String firstName;
	private String lastName;
	private int studentId;
	private double gpa;

	public static void main(String[] args) {
		Student stu = new Student("Jane", "Smith", 123-456-789, 2.95);
		// System.out.println(stu.toString());
		System.out.println(stu.getLastName() + ", " + stu.getFirstName());
		System.out.println("ID: " + stu.getStudentID() + " GPA: " + stu.getGPA());

	}

	public Student(String _fName, String _lName, int _id, double _gpa) {
		firstName = _fName;
		lastName = _lName;
		studentId = _id;
		gpa = _gpa;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getStudentID() {
		return studentId;
	}

	public double getGPA() {
		return gpa;
	}

	public void setFirstName(String _fName) {
		firstName = _fName;
	}

	public void setLastName(String _lastName) {
		lastName = _lastName;
	}

	public void setStudentId(int _id) {
		studentId = _id;
	}

	public void setGpa(double _gpa) {
		gpa = _gpa;
	}
}
