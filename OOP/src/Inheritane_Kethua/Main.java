package Inheritane_Kethua;

public class Main {

	public static void main(String[] args) {
		//Person pr = new Person();
		//pr.ShowInfo();
		Student st = new Student();
		st.setTen("Chung");
		st.setDiem(10);
		st.setSinhnhat(1998);
		st.setTuoi(21);
		st.ShowInfo();
		
		Teacher tc = new Teacher();
		tc.setTen("Binh");
		tc.setSinhnhat(1998);
		tc.setTuoi(21);
		tc.setSalary(200000000);
		tc.ShowInfo();

	}

}
