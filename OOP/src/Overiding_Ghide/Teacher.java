package Overiding_Ghide;

public class Teacher extends Person{
//	public Teacher(String ten, int tuoi, int sinhnhat) {
//		super(ten, tuoi, sinhnhat);
//		// TODO Auto-generated constructor stub
//	}

	public int salary;

	public int getSalary() { // cần trả về và in ra
		return salary;
	}

	public void setSalary(int salary) { // nhận vào không cần trả về
		this.salary = salary;
	}

	@Override
//	public String toString() {
//		return "Teacher [salary=" + salary + "]";
	//}
    public void ShowInfo() {
	super.ShowInfo();  // ghi đè SHOWINFO . 
System.out.println("day la giáo viên " + this.getSalary());
		
		
	}
	
}
