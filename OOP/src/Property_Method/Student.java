package Property_Method;

public class Student {

	public String ten;
	public int tuoi;
       public int sinhnhat;
	public String getTen() {
		return ten;
	}
	public Student(String ten, int tuoi, int sinhnhat) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.sinhnhat = sinhnhat;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getSinhnhat() {
		return sinhnhat;
	}
	public void setSinhnhat(int sinhnhat) {
		this.sinhnhat = sinhnhat;
	}
       
       // show Student Info
	// việc in ra thông tin thì không cần kiểu trả vê , vì thế chúng ta để cho nó là void
	public void ShowInfo() {
		System.out.println("----------------------------------");
		System.out.println(this.getSinhnhat());
		System.out.println(this.getTen());
		System.out.println(this.getTuoi());
	}
	
}