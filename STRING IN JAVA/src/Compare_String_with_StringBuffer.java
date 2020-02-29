
public class Compare_String_with_StringBuffer {
	 public static String concatWithString() {
		  String t = "Java";
		  int lt;
		for (int i = 0; i < 10000; i++) {
		   t = t + "Hello";
		  }
		  return t;
		 }
		 
		 public static String concatWithStringBuffer() {
		  StringBuffer sb = new StringBuffer("Java");
		  for (int i = 0; i <10000; i++) {
		   sb.append("Hello");
		  }
		  return sb.toString();
		 }
	public static void main(String[] args) {
		  long startTime = System.currentTimeMillis();
		  concatWithString();
		  System.out.println("Thời gian nối chuỗi của lớp String: "
		    + (System.currentTimeMillis() - startTime) + "ms");
		  startTime = System.currentTimeMillis();
		  concatWithStringBuffer();
		  System.out.println("Thời gian nối chuỗi của lớp StringBuffer: "
		    + (System.currentTimeMillis() - startTime) + "ms");

		/*  Ta thấy thời gian cua StringBuffer nhanh hơn nhiều so với thời gian của String thường
		  thứ 2
		  String Lớp String ghi đề phương thức equals() của lớp Object. Vì thế bạn có thể so sánh nội dung của 2 chuỗi bằng phương thức equals()*/
		  
	}

}
