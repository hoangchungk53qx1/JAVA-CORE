import java.util.ArrayList;

public class Basket {            // KHÁCH HÀNG mua hàng. 
ArrayList<ShopItem> selectedItems;
public Basket() {
	selectedItems = new ArrayList<ShopItem>();
}


public ArrayList<ShopItem> getSelectionCumtomer() {
	return selectedItems;
}


public void setSelectionCumtomer(ArrayList<ShopItem> selectionCumtomer) {
	this.selectedItems = selectionCumtomer;

}
// trước khi khách hàng mua cần xem có đủ sản phẩm mua không ?
public boolean CheckandAddItem(ShopItem item, int soluongcanmua) { // ShopItem truyền vào item và số lượng xem đủ số lượng ko
	if(item.getiQtt() >= soluongcanmua) {
	
		System.out.println("còn hàng để mua,xin mời chọn hàng cần mua: "+ item.getiQtt()); 
		// có 2 item. Cả 2 item đó đều có tất cả thuộc tính giống như item khách đã chọn
		// ( trừ số lượng )
		// 1. item để lưu vào basket
		// 2. item để cập nhật lại cho arraylist ( của cửa hàng)
	item.setiQtt(item.iQtt - soluongcanmua);	 // thiết lập lại số lượng item trong shopitem sau khi khách hàng mua
	ShopItem itemcopy;
	itemcopy = (ShopItem) item.clone(); // copy lại thuộc tính của item truyền vào, ví dụ như sách thì có cân nặng,.... không cân copy sô lg la được
	itemcopy.setiQtt(soluongcanmua); // thiết lập lại số lượng cần mua
	return selectedItems.add(itemcopy);

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
