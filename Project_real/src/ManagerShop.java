
public class ManagerShop {
	Shop shop;
	public ManagerShop() {
		shop = new Shop();
	}

	public void handlerMenu() {
		int choiceMenu = Menu.menu();

		switch (choiceMenu) {
		case 1:
			handlerAdmin();
			break;
		case 2:
			handlerCustomer();
			break;
		case 3:
			System.exit(0);
			break;

		}

	}

	private void handlerCustomer() {
		int choiceCustomer = Menu.menuCustomer();

		switch (choiceCustomer) {
		case 1:
			addToBasket();
			break;
		case 2:
			displayBasket();
			break;
		case 3:
			removeBasket();
			break;
		case 4:
			printInvoice();
			break;
		case 5:
			System.exit(0);
			break;
		}
	}

	private void printInvoice() {
		Basket basket = shop.getBasket();
		basket.printInvoice();
	}

	private void removeBasket() {
		Basket basket = shop.getBasket();
		displayBasket();

		System.out.println("Choice id item remove: ");
		int choiceID = Validation.checkInputInt();
		
		int found = Validation.findIdFromStore(basket.getSelectedItems(), choiceID);
		if (found == -1) {
			System.out.println("Id not found");
			return;
		}
		
		ShopItem itemRemove = basket.getSelectedItems().get(found);
		System.out.println("Choice quantity remove: ");
		int choiceQuantityRemove = Validation.checkInputInt();
		
		boolean check = basket.removeBasket(itemRemove, choiceQuantityRemove);
	
		if(check)
			System.out.println("Remove success");
		else
			System.out.println("Remove failed");
	}

	private void displayBasket() {
		Basket basket = shop.getBasket();
		basket.display();
	}

	private void addToBasket() {
		Basket basket = shop.getBasket();
		viewItem();

		System.out.println("Choice id item: ");
		int choiceID = Validation.checkInputInt();

		int found = Validation.findIdFromStore(shop.getStore().ls, choiceID);
		if (found == -1) {
			System.out.println("Id not found");
			return;
		}

		ShopItem item = shop.getStore().ls.get(found);
		System.out.println("Choice quantity: ");
		int choiceQuantity = Validation.checkInputInt();

		boolean check = basket.CheckandAddItem(item, choiceQuantity);
		if (check)
			System.out.println("Add item success");
		else
			System.out.println("Add item failed");

	}

	private void handlerAdmin() {
		int choiceAdmin = Menu.menuAdmin();

		switch (choiceAdmin) {
		case 1:
			addItem();
			break;
		case 2:
			updateItem();
			break;
		case 3:
			viewItem();
			break;
		case 4:
			removeItem();
			break;
		case 5:
			System.exit(0);
			break;
		}
	}

	private void removeItem() {
		shop.getStore().RemoveItem();
	}

	private void viewItem() {
		shop.getStore().Display();
	}

	private void updateItem() {
		shop.getStore().update();
	}

	private void addItem() {
		shop.getStore().addItem();
	}

	public void start() {
		while (true) {
			handlerMenu();
		}
	}
}

