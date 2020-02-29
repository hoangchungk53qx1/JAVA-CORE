package Tinhluongnhanvien;

import java.util.Scanner;

public class Nhan_vien {
Scanner scn = new Scanner(System.in);
	private String tennhanvien;
	public long luongnhanvien;
	public Nhan_vien() {
		
		super();
	}
public Nhan_vien(String tennhanvien,long luongnhanvien) {

	this.tennhanvien = tennhanvien;
	this.luongnhanvien= luongnhanvien;
}
public void nhapthongtin() {
	System.out.println("nhap thong tin nhan vien");
	tennhanvien = scn.nextLine();
	System.out.println("-----------------------");
}
public void tinhluong(){ //khai báo để lớp con có thể ghi đè
	
}
public String  toString() {
	return "Tên nhân viên " + this.tennhanvien + this.luongnhanvien + " VND ";
	
}

}
