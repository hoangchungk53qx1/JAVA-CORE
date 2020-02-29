package Overiding_Ghide;

import java.util.Calendar;

public class Person {

	//private static final Calendar Calender = null;
	public String ten;
	public int tuoi;
       public int sinhnhat;
       
       
       
//public Person(String ten, int tuoi, int sinhnhat) {
//	
//	this.ten = ten;
//		this.tuoi = tuoi;
//		this.sinhnhat = sinhnhat;
//	}
	public String getTen() {
		return ten;
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
     public int getAge() {
    	 Calendar now = Calendar.getInstance();
    	 return now.get(Calendar.YEAR)- this.getSinhnhat();
		
     }
     public void ShowInfo() {
 		System.out.println(this.getSinhnhat());
 		System.out.println(this.getTen());
 		System.out.println(this.getTuoi());
 		System.out.println(this.getAge());
		
 		
 	}
	}
