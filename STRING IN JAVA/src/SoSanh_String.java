
public class SoSanh_String {

	/**
	 * 
	 * có 3 cách để so sánh chuỗi trong java
	 * 1:SỬ DỤNG  PHƯƠNG THỨC equals()
	 * 2:SO SÁNH  CHUỖI BẰNG TOÁN TỬ : ==
	 * 3: SO SÁNH CHUỖI BẰNG PHƯƠNG THỨC  COMPARETO()
	 */
	//1 SO sánh chuỗi bằng phương thức equals
		/**
		 * phương thức equals() được sử dụng để so sánh nội dung 2 lớp chuỗi 
		 * Lớp String cung cấp 2 phương thức equals
		 * + public boolean equals(String another) So sánh 2 chuỗi có phân biệt chữ thường, chữ hoa
		 * +public boolean equalslgnoreCase(String another) so sánh 2 chuỗi không phân biệt chữ thường, chữ hoa
		 * 
		 */
	
	public static int equals() {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("HELLO");
		String s4 = "HALLO";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		return 0;
	}
	public static int equalsnoreCase() {
		String s1 = "hello";
		String s2 = "HELLO";
		System.out.println(s1.equalsIgnoreCase(s2));
		return 0;
	}
	public static void main(String[] args) {
		equals();
		equalsnoreCase();
	 

	}

}
