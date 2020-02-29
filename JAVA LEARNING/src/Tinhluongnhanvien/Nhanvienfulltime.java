package Tinhluongnhanvien;

public class Nhanvienfulltime extends Nhan_vien {
 private int songaylamthem,chose;
 private String loainhanvien;
 private static final long LUONG_SEP = 20000000;
 private static final long LUONG_NHAN_VIEN_BINH_THUONG = 15000000;
 private static final long LUONG_LAM_THEM = 5000000;
	public Nhanvienfulltime() {
		super();
	}
public Nhanvienfulltime(int songaylamthem,String loainhanvien) {
	super();
	this.songaylamthem = songaylamthem;
	this.loainhanvien = loainhanvien;
}
public void setSongaylamthem(int songaylamthem) {
	this.songaylamthem = songaylamthem;
}
public int getSongaylamthem() {
	return songaylamthem;
}
public void loainhanvien(String loainhanvien) {
	this.loainhanvien = loainhanvien;
}
public String getloainhanvien() {
	return loainhanvien;
}
public void nhapthongtin() {
	super.nhapthongtin();
	System.out.println("Nhập số ngày làm thêm");
	songaylamthem = scn.nextInt();

	System.out.println(" nhập loại nhân viên 1 - Bình thường , 2 - Sếp ");
	chose = scn.nextInt();
	switch(chose) {
	case 1:
		loainhanvien = " Nhân viên bình thường";
		break;
	case 2:
		loainhanvien = " Sếp ";
		break;
	default:
		System.out.println("nhập không đúng , vui lòng nhập lại");
		break;
	}
}
public void tinhluong
}
