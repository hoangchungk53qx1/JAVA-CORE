import java.util.Scanner;

public class Student {
	final static Scanner scn = new Scanner(System.in);
	int id;
	String name;

	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	void setId(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public void input() {

		System.out.println("Enter id: ");
		id = Integer.parseInt(scn.nextLine());
		System.out.println("Enter name: ");
		name = scn.nextLine();

	}
	
	public void display() {
		System.out.println(id + " - " +  name);
	}

	public static void main(String[] args) {
		
	int [] mang= new int[3];
	Student[] s= new Student[3];
	
	for (int i = 0; i < s.length; i++) {
		
	
	for(int i=0;i<s.length;i++) {
		String id=scn.nextLine();
		String name= scn.nextLine();
		s[i]= new Student();
	}
	for(Student st:s) {
		System.out.println(st.getId() + st.getName());
	}
	
	}
	
}

