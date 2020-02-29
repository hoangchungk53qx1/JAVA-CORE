package OOP;

import java.util.Scanner;

public class Mycalculation extends Calculation {
	public void nhan(int a,int b) {
			c = a + b;
		System.out.println("kết quả nhân là " +c);
	}
	public void chia(int a,int b) {
		c= a/b;
		System.out.println("kết quả chia là" +c);
	}
	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Mycalculation ez = new Mycalculation();
		int a = scn.nextInt();
		int b = scn.nextInt();
		ez.cong(a,b);
		ez.chia(a, b);
		
		
		

	}

}
