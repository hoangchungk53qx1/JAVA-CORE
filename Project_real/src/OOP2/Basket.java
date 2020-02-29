package OOP2;

import java.util.ArrayList;

public class Basket {
	private ArrayList<ShopItem> selectedItems;

	public Basket() {
		selectedItems = new ArrayList<>();
	}

	public boolean addItem(ShopItem items, int soluong_khachhangmua) {
		if (items.getiQtt() >= soluong_khachhangmua) { // sáº£n pháº©m Ä‘á»§, cÃ³ thá»ƒ mua

			// cÃ³ 2 item. Cáº£ 2 item Ä‘Ã³ Ä‘á»�u cÃ³ táº¥t cáº£ thuá»™c tÃ­nh giá»‘ng nhÆ° item khÃ¡ch Ä‘Ã£ chá»�n
			// ( trá»« sá»‘ lÆ°á»£ng )
			// 1. item Ä‘á»ƒ lÆ°u vÃ o basket
			// 2. item Ä‘á»ƒ cáº­p nháº­t láº¡i cho arraylist ( cá»§a cá»­a hÃ ng)

			items.setiQtt(items.getiQtt() - soluong_khachhangmua); // update quantity cá»§a cá»­a hÃ ng
			// sÃ¡ch, Ä‘Ä©a CD, pháº§n má»�m
			// sÃ¡ch: A, 32, 1kg
			// sÃ¡ch: B, 10, 0,5kg

			ShopItem itemBasket;
			itemBasket = (ShopItem) items.clone(); // sao chÃ©p thuá»™c tÃ­nh cá»§a item cá»­a hÃ ng

			itemBasket.setiQtt(soluong_khachhangmua);
			return selectedItems.add(itemBasket);
		}
		return false;
	}

	public void display() {
		selectedItems.forEach(item -> item.display());
	}

	ArrayList<ShopItem> getSelectedItems() {
		return selectedItems;
	}

	public double getShipBookFee() {
		double total = 0;
		long totalWeight = totalWeightBook();

		int numberKg = (int) (totalWeight / 1000);
		total += numberKg * 7;
		totalWeight -= numberKg * 1000;

		if (totalWeight < 500) {
			total += 5;
		} else if (totalWeight < 1000)
			total += 9.5;

		return total;
	}

	public double getTotal() {
		return getTotalPrice() + transFeeTotal();
	}

	public double getTotalPrice() {
		return getTotalPriceOfBook() + getTotalPriceOfSoftware();
	}

	public double getTotalPriceOfBook() {
		double total = 0;
		for (ShopItem item : selectedItems) {
			if (item instanceof Book) {
				total += item.getiPrice() * item.getiQtt();
			}
		}

		return total;
	}

	public double getTotalPriceOfSoftware() {
		double total = 0;
		for (ShopItem item : selectedItems) {
			if (item instanceof Software) {
				total += item.getiPrice() * item.getiQtt();
			}
		}

		return total;
	}

	public void printInvoice() { // 1. tá»•ng tiá»�n, 2. Tiá»�n sáº£n pháº©m, 3. tiá»�n phÃ­ ship
		System.out.println("Total price book and software: " + getTotalPrice());
		System.out.println("Total ship fee: " + transFeeTotal());
		System.out.println("Total money: " + getTotal());

		display();
	}

	public boolean removeBasket(ShopItem items, int soluong) {

		boolean found = selectedItems.contains(items);

		if (found) {
			if (items.getiQtt() - soluong == 0)
				return selectedItems.remove(items);

			items.setiQtt(items.getiQtt() - soluong);
			return true;
		}

		return false;
	}

	void setSelectedItems(ArrayList<ShopItem> selectedItems) {
		this.selectedItems = selectedItems;
	}

	public long totalWeightBook() {
		long total = 0;

		for (ShopItem item : selectedItems) {
			if (item instanceof Book) {
				total += ((Book) item).getWeight() * item.getiQtt();
			}
		}

		return total;
	}

	public double transFeeTotal() {
		double total = 0;
		double totalSoftware = 0;
		for (ShopItem item : selectedItems) {
			if (item instanceof Software) {
				totalSoftware += (item.transportingFee() * item.getiQtt());
			}
		}

		total = totalSoftware + getShipBookFee();

		return total;
	}
}
