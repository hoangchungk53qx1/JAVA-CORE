package Fraction_Phanso;

public class Main_Phanso {

	public static void main(String[] args) {
		Fraction F = new Fraction(1, 2);
		Fraction F1 = new Fraction(1, 4);
		Fraction F2 = new Fraction(F, F1, "+");
		F2.printps();
		System.out.println("KẾT QUẢ CỘNG : " + F2.printps());
		F.printps();
		System.out.println(F.printps());
		System.out.println(F1.printps());

		if (F.Toigian() == true) {
			System.out.println(F.printps() + " phân số là tối giản");
		} else {

			System.out.println(F.printps() + " phân số ở dạng không tối giản");
			System.out.println("phân số sau khi rút gọn tối giản là: ");
			F.Rutgon();
			System.out.println(F.printps());

		}

	}
}
