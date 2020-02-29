import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
	public static Scanner scn = new Scanner(System.in);

	public static boolean checkYN(char x) {
		return (x == 'y' || x == 'Y');
	}

	public static int checkInputInt() {
		int res;

		while (true) {
			try {
				res = Integer.parseInt(scn.nextLine().trim());
				return res;

			} catch (Exception e) {
				System.err.println("please re-input Int : ");
			}
		}
	}

	public static String CheckInputString() {
		String res;
		while (true) {
			try {
				res = scn.nextLine();
				return res;
			} catch (Exception e) {
				System.err.println("please re-input String: ");
			}
		}
	}

	public static Character checkInputCharacter() {
		String res;
		while (true) {
			try {
				res = scn.nextLine().trim();

				if (res.isEmpty() || res.length() > 1) {
					throw new Exception();
				}

				return res.charAt(0);
			} catch (Exception e) {
				System.err.println("Please re-enter character");
			}
		}
	}

	public static int CheckLimitChoice(int min, int max) {
		int choice;
		while (true) {
			try {
				choice = Integer.parseInt(scn.nextLine().trim());
				if (choice < min || choice > max) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.err.println("range from min --> max : ");
			}

		}

	}

	public static Double CheckInputDoube() {
		Double res;
		while (true) {
			try {
				res = Double.parseDouble(scn.nextLine().trim());
			} catch (Exception e) {
				System.out.println(" re-ipnut Double");
			}
		}

	}

// tìm thằng max hiện tại xong cộng thêm 1 , giống như danh sách 0 1 2....
	public static int getIDMax(ArrayList<ShopItem> shopitem) {
		int id = 0;
		for (int i = 0; i < shopitem.size(); i++) {
			id = Math.max(id, shopitem.get(i).getId());
		}
		return id + 1;
	}

	public static Object findObjectFromStore(ArrayList<ShopItem> shopItem, int id) { // truyền vào danh sách sản phẩm,
																						// và id

		for (int i = 0; i < shopItem.size(); i++) {
			if (shopItem.get(i).getId() == id) {
				return shopItem.get(i); // trả về đối tượng tại vị trí i , đối tượng là cái gì "chứa cái gi trong đó : "
			}
		}

		return null; // not found
	}

	public static int findIdFromStore(ArrayList<ShopItem> shopItem, int id) {

		for (int i = 0; i < shopItem.size(); i++) {
			if (shopItem.get(i).getId() == id) { // lấy vị trí id tại đó
				return i; // trả về vị trí của id đó
			}
		}

		return -1; // not found
	}
}
