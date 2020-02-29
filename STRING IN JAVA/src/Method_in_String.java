
public class Method_in_String {

	public static void main(String[] args) {
		/*
		 * Phương thức toUpperCase() và toLowerCase() Phương thức toUpperCase() chuyển
		 * đối chuỗi thành dạng chữ hoa và phương thức toLowerCase() chuyển đổi chuỗi
		 * thành dạng chữ thường.
		 */
		String s = "    Hello Java";
		System.out.println(s.toUpperCase()); // HELLO JAVA
		System.out.println(s.toLowerCase()); // hello java
		/*
		 * Phương thức trim() Phương thức trim() được sử dụng để xóa khoảng trẳng ở đầu
		 * và cuối của chuỗi.
		 */
		System.out.println(s.trim());
		//
		/*
		 * Phương thức starswith và sendwith dùng để kiểm tra kí tự đầu và kí tự cuối
		 */
		System.out.println(s.startsWith(""));
		System.out.println(s.endsWith("a"));
		/*
		 * Phương thức charAt() Phương thức charAt() trả về một ký tự tại một ví trí cụ
		 * thể
		 */
		System.out.println(s.charAt(4));
		
		/*
		 * Phương thức length() Phương thức length() trả độ dài của chuỗi.
		 */
		System.out.println(s.length());
	}
	

}
