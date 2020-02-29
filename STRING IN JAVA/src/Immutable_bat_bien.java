
public class Immutable_bat_bien {
	public static int  giongnhau() {
		String s="helo";
		s.concat("java");
		System.out.println(s); //sẽ chỉ in ra "Hello" vì các chuỗi này là đối tượng không thể thay đổi.
		return 0;
	}
	public static int khacnhau() {
		String s = "hello";
		s= s.concat("Java"); //Nhưng nếu chúng ta gán s vào biến tham chiếu, s sẽ được tham chiếu đến chuỗi mới
		System.out.println(s);
		
		return 0;
		
	}
	public static void main(String[] args) {
		
          giongnhau();
          khacnhau();
	}

}
