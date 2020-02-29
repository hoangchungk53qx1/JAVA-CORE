package Inheritane_Kethua;

public class Teacher extends Person{
	public int salary;

	public int getSalary() { // cần trả về và in ra
		return salary;
	}

	public void setSalary(int salary) { // nhận vào không cần trả về
		this.salary = salary;
	}
	
}
