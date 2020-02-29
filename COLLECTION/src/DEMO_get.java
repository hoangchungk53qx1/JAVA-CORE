import java.util.ArrayList;

public class DEMO_get {

	public static void main(String[] args) {
		ArrayList<Integer> arrListInteger = new ArrayList<>();
        
	    // thêm phần tử vào trong arrListInteger
	    arrListInteger.add(4);
	    arrListInteger.add(8);
	    arrListInteger.add(12);
	    arrListInteger.add(16);
	    arrListInteger.add(20);
	    arrListInteger.add(24);
	             
	    System.out.println("Các phần tử của arrListInteger ban đầu: ");
	    System.out.println(arrListInteger);
	    int index =0;
	    for (Integer student : arrListInteger) {
            arrListInteger.get(2);
            System.out.println("index" +arrListInteger.get(2));
        }
	             
	    // cập nhật giá trị của phần tử thứ 4
	    // trong arrListInteger bằng phương thức set()
	    arrListInteger.set(4, 204);
	             
	    System.out.println("Các phần tử của arrListInteger sau khi cập nhật: ");
	    System.out.println(arrListInteger);
	}
}


