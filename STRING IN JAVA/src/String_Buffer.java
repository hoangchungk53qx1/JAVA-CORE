
public class String_Buffer {

	public static void main(String[] args) {
		/*
		 * Trong java, lớp StringBuffer được sử dụng để tạo chuỗi có thể thay đổi
		 * (mutable). Lớp StringBuffer trong java tương tự như lớp String ngoại trừ nó
		 * có thể thay đổi
		 */
		/*
		 * Chú ý: Lớp StringBuffer là thread-safe (luồng an toàn) nghĩa là nhiều luồng
		 * (thread) không thể truy cập nó trong cùng một thời điểm.
		 */
		
		//-----------------------------------------------
		/*
		 * 1) Phương thức append() của lớp StringBuffer trong java Phương thức append()
		 * của lớp StringBuffer nối thêm tham số vào cuối chuỗi.
		 */
	StringBuffer sb = new StringBuffer("Helloo");
	StringBuffer str = new StringBuffer("Hello");
			sb.append(" JAVA");
	System.out.println(sb);
		/*
		 * 2) Phương thức insert() của lớp StringBuffer trong java Phương thức insert()
		 * của lớp StringBuffer chèn chuỗi vào chuỗi này từ vị trí quy định.
		 */
	sb.insert(3,"hihi");
	System.out.println(sb);
	//out Helhihiloo JAVA
		/*
		 * 3) Phương thức replace() của lớp StringBuffer trong java Phương thức
		 * replace() của lớp StringBuffer thay thế chuỗi bằng chuỗi khác từ vị trị bắt
		 * đầu và kết thúc được quy định.
		 */
	
	str.replace(2, 4, "thaythe");
	System.out.println(str);
		/* 4) Phương thức delete() của lớp StringBuffer trong java */
	sb.delete(1, 6);
	System.out.println(sb);
	str.deleteCharAt(4);
	System.out.println(str);
		/* 5) Phương thức reverse() của lớp StringBuffer trong java */
	StringBuffer x =str.reverse();
	System.out.println(x);
	StringBuffer sc = new StringBuffer();
	  System.out.println(sc.capacity());//mặc định là 16  
	  sc.append("Hello");
	  System.out.println(sc.capacity());//đến đây vẫn là 16  
	  sc.append("java is my favourite language");
	  System.out.println(sc.capacity());//đến đây là (16*2)+2=34 i.e (dung lượng cũ*2)+2 
}
}
