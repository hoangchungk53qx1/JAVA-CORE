package Fraction_Phanso;

public class Fraction {
	private int numberator;
	private int demominator;

	public Fraction(int numberator, int demominator) {
		super();
		this.numberator = numberator;
		this.demominator = demominator;
	}

	public Fraction(Fraction F, Fraction F1, String action) {
		F.Rutgon();
		F1.Rutgon();
		switch (action) {
		case "+":
			this.add(F, F1);
			break;
		case "-":
			this.sub(F, F1);
			break;
		case ".":
		case "x":
		case "X":
		case "*":
			this.multiply(F, F1);
			break;
		case "//":
		case ":":
			this.devide(F, F1);
		default:
			break;
		}

	}

	public int getNumberator() {
		return numberator;
	}

	public void setNumberator(int numberator) {
		this.numberator = numberator;
	}

	public int getDemominator() {
		return demominator;
	}

	public void setDemominator(int demominator) {
		this.demominator = demominator;
	}

	public String printps() {
		return this.numberator + "/" + this.demominator;
	}

	public void Rutgon() { // lấy tử và mẫu chia cho UCLN là ra phân số tối giản

		int ucln = UCLN(this.getNumberator(), this.demominator);
		this.numberator = this.numberator / ucln;
		this.demominator = this.demominator / ucln;

	}

	public boolean Toigian() {
		// kiểm tra xem phân số đã tối giản hay chưa
		// nếu chưa tối giản thì mới tối giản , còn đã tối giản ròi thì thôi
		// làm như vậy chương trình sẽ chạy nhanh hơn
		boolean flag = false;
		int ucln = UCLN(this.getNumberator(), this.demominator);
		if (ucln == 1) { // bằng 1 lớn nhất của tử và mẫu bằng 1 thì phân số đó tối giản
			flag = true;
		}

		return flag;
	}

	public void add(Fraction F, Fraction F1) {
		System.out.println("cộng hai phân số ");
		this.numberator = F.numberator*F1.demominator + F.demominator*F1.numberator;
		this.demominator =F.demominator*F1.demominator;
	}

	public void sub(Fraction F, Fraction F1) {

	}

	public void multiply(Fraction F, Fraction F1) {

	}

	public void devide(Fraction F, Fraction F1) {

	}

	private int UCLN(int a, int b) {
		// Chuyển sang public --> private thì chỉ cho truy cập trong lớp mà thôi
		// ước chung lớn nhất là số lớn nhất mà cả tử và mẫu cùng chia hết
		// ví dụ như 3 và 9 thì ước chung lớn nhất của 2 số này là 3
		if (a == 0 || b == 0) {
			return a + b;
		}
		while (a * b != 0) {
			if (a > b) {
				a = a - b;
			} else
				b = b - a;
		}
		return a;

	}

}
