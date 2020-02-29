package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	ArrayList<ShopItem> ls;
	final Scanner scn = new Scanner(System.in);

	public Store() {
		ls = new ArrayList<>();

		ls.add(new Book(1, 1, "Conan", 10.3, 10));
		ls.add(new Book(2, 2, "Doreamon", 1.2, 10));
		ls.add(new Software(7, 3, "My Tam", 7.8, 10));
		ls.add(new Book(3, 4, "Tom", 5.5, 10));
		ls.add(new Software(5, 5, "Snow", 6, 10));
	}

	public boolean addItem() {
		boolean f = false;

		System.out.print("Choice type (0: Software - 1: Book): ");
		System.out.println(">: ");
		int choice = Validate.checkLimitInput(0, 1);

		if (choice == 1)
			f = true;

		ShopItem item = makeItem(f);
		return ls.add(item);
	}

	public void display() {
		/*
		 * for (ShopItem item : ls) { System.out.println(item.toString()); }
		 */
		ls.forEach(item -> item.display());
	}

	public ShopItem makeItem(boolean f) {
		ShopItem item;

		String name;
		double price;
		int iQtt;
		int id = Validate.getIdMaxFromStore(ls);

		System.out.print("Enter name: ");
		name = Validate.checkInputString();
		System.out.print("Enter price: ");
		price = Validate.checkInputDouble();
		System.out.print("Enter quantity: ");
		iQtt = Validate.checkInputInt();

		// true : Book, false : Software
		if (f) {
			int weight;

			System.out.print("Enter weight: ");
			weight = Validate.checkInputInt();

			item = new Book(weight, id, name, price, iQtt);
		} else {
			int noCD;

			System.out.print("Enter noCD: ");
			noCD = Validate.checkInputInt();

			item = new Software(noCD, id, name, price, iQtt);
		}
		return item;
	}

	public boolean removeItem() {
		display();
		System.out.print("Enter id update: ");
		int id = Validate.checkInputInt(); // cÃ³ id --> tÃ¬m Ä‘Æ°á»£c nÃ³ náº±m á»Ÿ Ä‘Ã¢u trong Arraylist. Táº¡i vá»‹ trÃ­ Ä‘Ã³? láº¥y Ä‘Æ°á»£c
											// háº¿t thÃ´ng tin cá»§a Item

		ShopItem itemRemove = (ShopItem) Validate.findObjectFromStore(ls, id);
		if (itemRemove == null) {
			System.out.println("ID not found");
			return false;
		}

		return ls.remove(itemRemove);
	}

	public boolean updateItem() {
		int id;
		display();
		System.out.print("Enter id update: ");
		id = Validate.checkInputInt(); // cÃ³ id --> tÃ¬m Ä‘Æ°á»£c nÃ³ náº±m á»Ÿ Ä‘Ã¢u trong Arraylist. Táº¡i vá»‹ trÃ­ Ä‘Ã³? láº¥y Ä‘Æ°á»£c háº¿t
										// thÃ´ng tin cá»§a Item

		int found = Validate.findIdFromStore(ls, id);
		if (found == -1) {
			System.out.println("ID not found");
			return false;
		}

		// 1. Cho ngÆ°á»�i ta nháº­p láº¡i nhÆ° nháº­p má»›i.
		// 2. Problem? NÃ³ lÃ  Book hay Software.
		ShopItem itemOld = ls.get(found);
		ShopItem itemNew;
		if (itemOld instanceof Book) {
			// 3. Cho nÃ³ admin nháº­p láº¡i giÃ¡ trá»‹ cáº§n update.
			itemNew = makeItem(true);
		} else
			itemNew = makeItem(false);

		// NgÆ°á»�i dÃ¹ng cáº§n biáº¿t Ä‘Ã£ update thÃ nh cÃ´ng hay chÆ°a?
		if (itemOld.equals(itemNew)) {
			System.out.println("Update failed");
			return false;
		} else {
			ls.set(found, itemNew);
			System.out.println("Update success");
			return true;
		}
	}
}
