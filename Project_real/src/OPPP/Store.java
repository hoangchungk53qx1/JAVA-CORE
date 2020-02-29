package OPPP;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	ArrayList<ShopItem> ls;
	public static Scanner scn = new Scanner(System.in);

	public Store() {
		ls = new ArrayList<ShopItem>();
		// int id, String iName, double iPrice, int iQtt
		// Book ds = new Book();
		ls.add(new Book(1, 2, "Connan", 3.5, 10));
		ls.add(new Software(5, 3, "chungdz", 100000, 1));
		ls.add(new Book(5,3,"Hình sự" ,3.9,11));
		

	}

	public ShopItem MakeItem(boolean flag) {
		ShopItem item;

		String name;
		double price;
		int quantity;
		int id = Validate.getIdMaxFromStore(ls);
		System.out.println("id tự động tăng, không cần nhập: ");
		System.out.println("Nhập tên sản phẩm: ");
		name = Validate.checkInputString();
		System.out.println("Nhập giá sản phẩm: ");
		price = Validate.checkInputDouble();
		System.out.println("Nhập số lượng sản phẩm: ");
		quantity = Validate.checkInputInt();
		// dựa vào biến boolean để quyết đĩnh xem la book hay là software
		if (flag = true) { // ==1
			int weight;
			System.out.println("nhập vào số cân nặng của sách: ");
			weight = Validate.checkInputInt();
			item = new Book(weight, id, name, price, quantity); // tạo ra 1 quyển sách mới
		} else {
			int noCD;
			System.out.println("nhập vào số lượng phần mềm: ");
			noCD = Validate.checkInputCharacter();
			item = new Software(noCD, id, name, price, quantity); // phải có số lượng đầu vào mới tạo được new
		}
		return item;
	}

	public boolean addItem() { // add thì gôm 2 loại là sách và software thì cho người dung chọn add cái nào
		boolean flag = false;
// chọn 0 là software còn 1 là sách 
		System.err.println(" chọn 0 add software 1 add Book : -> ");
		int choice = Validate.checkLimitInput(0, 1); // bằng 1 thi laf true la book
		if (choice == 1) // chọn bOOK
			flag = true; // dùng truyền vào hàm MakeItem bên dưới
		ShopItem item = MakeItem(flag); // ShopItem bên hàm add Item bên trên nó trả về 1 cái ShopItem và thăng item nó
										// sẽ giữ
		return ls.add(item);

	}

	public void Display() {
		ls.forEach(item -> item.display());
	}

	public boolean RemoveItem() {
		// trước khi xóa phải xem có những gi mới xóa, thi tạo ra 1 ham display
		System.out.println("danh sách trước khi Remove: ");
		Display();
		int id = Validate.checkInputInt();
		ShopItem itemremove = (ShopItem) Validate.findObjectFromStore(ls, id); // ham findoject dựa vào id để xóa 1
																					// sản phẩm,
		// vì có id la có đặc tính của sản phẩm đó
		if (itemremove == null) {
			System.out.println("không tìm thấy id phù hợp với sản phẩm: ");
			return false;
		} else
			return ls.remove(itemremove);

	}

	public boolean update() {
		System.out.println("Danh sách sản phẩm trước khi update: ");
		Display();
		int id = Validate.checkInputInt();
		int found = Validate.findIdFromStore(ls, id);
		if (found == -1) // -1 la trong hàm findIdFromStore
		{
			System.out.println("không tìm thấy ID update");
			return false;
		}

		ShopItem itemOld = ls.get(found); // giờ lấy thằng ID cần sửa, đúng hơn là vị trí thằng ID cần update
		ShopItem newitem;
		if (itemOld instanceof Book) { // nếu la thể hiện của BOOK thì sẽ tạo ra cái item mới và trả vê true là của
										// BOOk,
			// còn ngược lại sẽ tạo newItem và trả về false la của Software
			newitem = MakeItem(true); // là thể hiện của BOOK
		} else {
			newitem = MakeItem(false);
		}
		if (itemOld.equals(newitem)) // cũ mà giống mới thi la update thất bại
		{ // đã sử dụng đến equal chỗ nào thì cần Generate Hash Code và Equals trong các
			// class

			System.out.println("update thất bại: ");
			return false;
		} else {
			System.out.println("update thành công: ");
			return true;
		}

	}

}
