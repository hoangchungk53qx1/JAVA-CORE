package Overiding_Ghide;

public class Student extends Person {
//		public Student(String ten, int tuoi, int sinhnhat) {
//		super(ten, tuoi, sinhnhat);
//	}

		public double diem;

		public double getDiem() {
			return diem;
		}

		public void setDiem(double diem) {
			this.diem = diem;
		}

//		@Override
//		public String toString() {
//			return "Student [diem=" + diem + "]";
//		}
		 public void ShowInfo() {
			 super.ShowInfo();
			 System.out.println("hello"+ this.getDiem());
			 // ghi đè lên SHowINfo  bằng  cách dùng super.
		 		
				
		 		
		 	}
		
		
		
		
	}

